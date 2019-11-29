package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnColum3 {

	@Test
	void testColum3_0_X() {
		String[] moves = {"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 2 && winners[1] == 9
				&& winners[2] == 16 && winners[3] == 23;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum3_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 9 && winners[1] == 16
				&& winners[2] == 23 && winners[3] == 30;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum3_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 16 && winners[1] == 23
				&& winners[2] == 30 && winners[3] == 37;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum3_0_Circle() {
		String[] moves = {"?","?","O","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 2 && winners[1] == 9
				&& winners[2] == 16 && winners[3] == 23;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum3_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 9 && winners[1] == 16
				&& winners[2] == 23 && winners[3] == 30;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum3_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","O","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 16 && winners[1] == 23
				&& winners[2] == 30 && winners[3] == 37;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum3_NoMatch() {
		String[] moves = {"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));


	}
	
	@Test
	void testColum3_Empty() {
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