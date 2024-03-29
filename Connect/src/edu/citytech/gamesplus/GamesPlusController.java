package edu.citytech.gamesplus;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import edu.citytech.service.Connect4Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class GamesPlusController implements Initializable {

	@FXML
	private GridPane GPane;

	@FXML
	private AnchorPane MainPane;

	@FXML
	private Button btn_Reset;

	@FXML
	private Label lbl_Message;

	private Label[] labels = new Label[42];

	private boolean isX = false;

	int win = 1;
// array index 3 look AT rest of code
	@Override
	public void initialize(URL url, ResourceBundle resource) {

		int i = 0;
		for (int rows = 0; rows <= 5; rows++)
			for (int column = 0; column <= 6; column++) {
				Label label = new Label("?");
				labels[i] = label;
				label.getStyleClass().add("custom-label");
				label.setUserData(i);
				label.setOnMouseClicked((MouseEvent e) -> this.ClickedEvent(e));
				GPane.add(label, column, rows);
				i++;
			}
	}

	private void ClickedEvent(MouseEvent e) {
		Label label = (Label) e.getSource();
		String[] moves = new String[42];

		for (int i = 0; i < labels.length; i++) {
			moves[i] = labels[i].getText();

		}

		int[] winner = Connect4Service.getWinner(moves);
		
		if (win == 1 && winner.length < 4) {


		if (label.getTextFill() != Color.WHITE) {
			lbl_Message.setText("Not your turn");
			return;
		}

		String xOrO = "";
		if (isX) {
			xOrO = "X";

		} else {
			xOrO = "O";

		}
		isX = !isX;
		label.setText(xOrO);

		int columnNumber = (int) label.getUserData();
		String newMove = label.getText();
		moves[columnNumber] = "?";
		label.setText("?");
		int nextMove = Connect4Service.getValidCellMoves(moves, columnNumber);

		labels[nextMove].setText(newMove);
		labels[nextMove].getStyleClass().add(xOrO);

                lbl_Message
		.setText("Current is " + columnNumber + 
				" next valid move is " + nextMove + 
				" clicked on " + new Date());
		
		if (winner.length == 4) {
			lbl_Message.setText("Winner");
			win = 0;
		}
		
	} else {

		lbl_Message.setText("Game done" );

	}


	}

	@FXML
	void reset(ActionEvent event) {

		for (Label label : labels) {
			label.setText("?");
			label.getStyleClass().removeIf(e -> e.equals("X") || e.equals("O"));
		}
		isX = true;
		lbl_Message.setText("");

	}

}
