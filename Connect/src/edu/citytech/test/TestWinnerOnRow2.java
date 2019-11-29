package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnRow2 {


	@Test
	void testRow2_0_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 7 && winners[1] == 8
				&& winners[2] == 9 && winners[3] == 10;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testRow2_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 8 && winners[1] == 9
				&& winners[2] == 10 && winners[3] == 11;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testRow2_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 9 && winners[1] == 10
				&& winners[2] == 11 && winners[3] == 12;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testRow2_3_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 10 && winners[1] == 11
				&& winners[2] == 12 && winners[3] == 13;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	

	@Test
	void testRow2_0_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 7 && winners[1] == 8
				&& winners[2] == 9 && winners[3] == 10;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}

	@Test
	void testRow2_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};

		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 8 && winners[1] == 9
				&& winners[2] == 10 && winners[3] == 11;
				
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testRow2_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};

		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 9 && winners[1] == 10
				&& winners[2] == 11 && winners[3] == 12;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testRow2_3_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 10 && winners[1] == 11
				&& winners[2] == 12 && winners[3] == 13;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	
	@Test
	void testRow2NoMatch() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	

	@Test
	void testRow2Empty() {
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


	

