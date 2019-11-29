package edu.citytech.service;

import java.util.List;

import edu.citytech.dao.WinningCombo;
import edu.citytech.dao.WinningComboDAO;

public class Connect4Service {

	public static int getValidCellMoves(String[] moves, int nextMove) {
		
		int validPosition = 0;
		int i = nextMove;
		boolean isFound = false;
		
		for ( ; i < moves.length; i+= 7) {
			isFound = !moves[i].contentEquals("?");
			if (isFound) {
				break;
			}
			
			}
		
		validPosition = i - 7;
		if (validPosition < 0) {
			validPosition = -1;
		}
		
		return validPosition;
	}

	public static int[] getWinner(String[] moves) {

		int [] status = {};
		WinningComboDAO  dao = new WinningComboDAO();
		List<WinningCombo> list = dao.findAll();
		// Rows

		for (WinningCombo wc : list) {
			
		
		if (findWinner(moves[wc.p1], moves[wc.p2], moves[wc.p3], moves[wc.p4])) {
			status = new int [] {wc.p1,wc.p2,wc.p3,wc.p4};
			break;
		}
		}
		
		return status;
	}
	
	private static boolean findWinner(String p1, String p2, String p3, String p4) {
		boolean status = p1.equals(p2)&& p2.equals(p3) && p3.equals(p4)&& !p1.equals("?") ; 
		
		
		return status;
	}
}

