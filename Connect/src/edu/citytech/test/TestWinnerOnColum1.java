package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnColum1 {

	@Test
	void testColum1_0_X() {
		String[] moves = {"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 0 && winners[1] == 7
				&& winners[2] == 14 && winners[3] == 21;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum1_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 7 && winners[1] == 14
				&& winners[2] == 21 && winners[3] == 28;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum1_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 14 && winners[1] == 21
				&& winners[2] == 28 && winners[3] == 35;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum1_0_Circle() {
		String[] moves = {"O","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 0 && winners[1] == 7
				&& winners[2] == 14 && winners[3] == 21;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum1_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 7 && winners[1] == 14
				&& winners[2] == 21 && winners[3] == 28;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum1_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 14 && winners[1] == 21
				&& winners[2] == 28 && winners[3] == 35;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum1_NoMatch() {
		String[] moves = {"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));


	}
	
	@Test
	void testColum1_Empty() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


   }