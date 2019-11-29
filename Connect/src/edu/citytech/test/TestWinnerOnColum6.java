package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnColum6 {

	@Test
	void testColum6_0_X() {
		String[] moves = {"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 5 && winners[1] == 12
				&& winners[2] == 19 && winners[3] == 26;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum6_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 12 && winners[1] == 19
				&& winners[2] == 26 && winners[3] == 33;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum6_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 19 && winners[1] == 26
				&& winners[2] == 33 && winners[3] == 40;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum6_0_Circle() {
		String[] moves = {"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 5 && winners[1] == 12
				&& winners[2] == 19 && winners[3] == 26;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testColum6_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 12 && winners[1] == 19
				&& winners[2] == 26 && winners[3] == 33;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum6_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","O","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 19 && winners[1] == 26
				&& winners[2] == 33 && winners[3] == 40;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testColum6_NoMatch() {
		String[] moves = {"?","?","?","?","?","0","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));


	}
	
	@Test
	void testColum6_Empty() {
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