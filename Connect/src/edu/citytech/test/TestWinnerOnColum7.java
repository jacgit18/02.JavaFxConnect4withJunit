package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnColum7 {

	@Test
	void testColum7_0_X() {
		String[] moves = {"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 6 && winners[1] == 13
				&& winners[2] == 20 && winners[3] == 27;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum7_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 13 && winners[1] == 20
				&& winners[2] == 27 && winners[3] == 34;
		
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum7_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 20 && winners[1] == 27
				&& winners[2] == 34 && winners[3] == 41;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum7_0_Circle() {
		String[] moves = {"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 6 && winners[1] == 13
				&& winners[2] == 20 && winners[3] == 27;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum7_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 13 && winners[1] == 20
				&& winners[2] == 27 && winners[3] == 34;
		
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum7_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","O"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 20 && winners[1] == 27
				&& winners[2] == 34 && winners[3] == 41;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum7_NoMatch() {
		String[] moves = {"?","?","?","?","?","?","0"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));


	}
	
	@Test
	void testColum7_Empty() {
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