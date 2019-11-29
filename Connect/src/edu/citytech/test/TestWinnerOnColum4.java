package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnColum4 {

	@Test
	void testColum4_0_X() {
		String[] moves = {"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 3 && winners[1] == 10
				&& winners[2] == 17 && winners[3] == 24;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum4_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 10 && winners[1] == 17
				&& winners[2] == 24 && winners[3] == 31;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum4_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 17 && winners[1] == 24
				&& winners[2] == 31 && winners[3] == 38;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum4_0_Circle() {
		String[] moves = {"?","?","?","O","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 3 && winners[1] == 10
				&& winners[2] == 17 && winners[3] == 24;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum4_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 10 && winners[1] == 17
				&& winners[2] == 24 && winners[3] == 31;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum4_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","0","?","?","?"
				         ,"?","?","?","0","?","?","?"
				         ,"?","?","?","0","?","?","?"
				         ,"?","?","?","0","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 17 && winners[1] == 24
				&& winners[2] == 31 && winners[3] == 38;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum4_NoMatch() {
		String[] moves = {"?","?","?","O","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));


	}
	
	@Test
	void testColum4_Empty() {
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