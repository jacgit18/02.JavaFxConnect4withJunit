package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnColum2 {


	@Test
	void testColum2_0_X() {
		String[] moves = {"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 1 && winners[1] == 8
				&& winners[2] == 15 && winners[3] == 22;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum2_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 8 && winners[1] == 15
				&& winners[2] == 22 && winners[3] == 29;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum2_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 15 && winners[1] == 22
				&& winners[2] == 29 && winners[3] == 36;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum2_0_Circle() {
		String[] moves = {"?","O","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 1 && winners[1] == 8
				&& winners[2] == 15 && winners[3] == 22;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum2_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 8 && winners[1] == 15
				&& winners[2] == 22 && winners[3] == 29;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum2_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 15 && winners[1] == 22
				&& winners[2] == 29 && winners[3] == 36;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum2_NoMatch() {
		String[] moves = {"?","O","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));


	}
	
	@Test
	void testColum2_Empty() {
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