package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnColum5 {

	@Test
	void testColum5_0_X() {
		String[] moves = {"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 4 && winners[1] == 11
				&& winners[2] == 18 && winners[3] == 25;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum5_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 11 && winners[1] == 18
				&& winners[2] == 25 && winners[3] == 32;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum5_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 18 && winners[1] == 25
				&& winners[2] == 32 && winners[3] == 39;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum5_0_Circle() {
		String[] moves = {"?","?","?","?","O","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 4 && winners[1] == 11
				&& winners[2] == 18 && winners[3] == 25;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum5_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 11 && winners[1] == 18
				&& winners[2] == 25 && winners[3] == 32;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum5_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","O","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 18 && winners[1] == 25
				&& winners[2] == 32 && winners[3] == 39;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum5_NoMatch() {
		String[] moves = {"?","?","?","?","O","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));


	}
	
	@Test
	void testColum5_Empty() {
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