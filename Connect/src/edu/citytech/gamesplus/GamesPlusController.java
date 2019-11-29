package edu.citytech.gamesplus;

import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.ResourceBundle;

import edu.citytech.service.Connect4Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class GamesPlusController implements Initializable {

    @FXML
    private GridPane GPane;
        
    @FXML
    private Button btn_Reset;
    
    
    @FXML
    private Label lbl_Message; 

    @FXML
    void checkFloatOption(ActionEvent event) {
 
    }
    
    
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
    
    private boolean isX = true;
    
	private void ClickedEvent(MouseEvent e) {
		Label label = (Label)e.getSource();
		if(! label.getText().equals("?")){
			lbl_Message.setText("Invalid move as of " + new Date());
		
		return;
	}
	
	String xOrO = "";
	if (isX) {
		xOrO = "X";
	} else {
		xOrO = "O";
	}
	isX =!isX;
	label.setText(xOrO);
	
	String[] moves = new String[42];
	
	for (int i = 0; i < labels.length; i++) {
		moves[i] = labels[i].getText();
	}
	
	int cellNumber = (int) label.getUserData();
	String newMove = label.getText();
	moves[cellNumber] = "?";
	label.setText("?");
	
	int nextMove = Connect4Service.getValidCellMoves(moves, cellNumber);
	
	labels[nextMove].setText(newMove);
	labels[nextMove].getStyleClass().add(xOrO);
	
	lbl_Message.setText("Current is " + cellNumber + " next valid move is " + nextMove + " clicked on " + new Date());
		
	}
	
	private Label[] labels = new Label[42];
	
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
