package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnDiag1 {
	
	@Test
	void testdiag1_0_X() {
		String[] moves = {"X","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 0 && winners[1] == 8
				&& winners[2] == 16 && winners[3] == 24;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag1_1_X() {
		String[] moves = {"?","X","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};

			int [] winners = Connect4Service.getWinner(moves);
			boolean c1 = winners[0] == 1 && winners[1] == 9
					&& winners[2] == 17 && winners[3] == 25;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testdiag1_2_X() {
		String[] moves = {"?","?","X","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 2 && winners[1] == 10
				&& winners[2] == 18 && winners[3] == 26;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag1_3_X() {
		String[] moves = {"?","?","?","X","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 3 && winners[1] == 11
				&& winners[2] == 19 && winners[3] == 27;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	

	@Test
	void testdiag2_0_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 7 && winners[1] == 15
				&& winners[2] == 23 && winners[3] == 31;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag2_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 8 && winners[1] == 16
				&& winners[2] == 24 && winners[3] == 32;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag2_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 9 && winners[1] == 17
				&& winners[2] == 25 && winners[3] == 33;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	
	@Test
	void testdiag2_3_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 10 && winners[1] == 18
				&& winners[2] == 26 && winners[3] == 34;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag3_0_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","X","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 14 && winners[1] == 22
				&& winners[2] == 30 && winners[3] == 38;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag3_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","X","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 15 && winners[1] == 23
				&& winners[2] == 31 && winners[3] == 39;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag3_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","X","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 16 && winners[1] == 24
				&& winners[2] == 32 && winners[3] == 40;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag3_3_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","?","X","?","?"
				         ,"?","?","?","?","?","X","?"
				         ,"?","?","?","?","?","?","X"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 17 && winners[1] == 25
				&& winners[2] == 33 && winners[3] == 41;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	
	

	@Test
	void testdiag1_0_Circle() {
		String[] moves = {"O","?","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 0 && winners[1] == 8
				&& winners[2] == 16 && winners[3] == 24;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag1_1_Circle() {
		String[] moves = {"?","O","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};

			int [] winners = Connect4Service.getWinner(moves);
			boolean c1 = winners[0] == 1 && winners[1] == 9
					&& winners[2] == 17 && winners[3] == 25;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testdiag1_2_Circle() {
		String[] moves = {"?","?","O","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 2 && winners[1] == 10
				&& winners[2] == 18 && winners[3] == 26;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag1_3_Circle() {
		String[] moves = {"?","?","?","O","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 3 && winners[1] == 11
				&& winners[2] == 19 && winners[3] == 27;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	

	@Test
	void testdiag2_0_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 7 && winners[1] == 15
				&& winners[2] == 23 && winners[3] == 31;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag2_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 8 && winners[1] == 16
				&& winners[2] == 24 && winners[3] == 32;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag2_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 9 && winners[1] == 17
				&& winners[2] == 25 && winners[3] == 33;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	
	@Test
	void testdiag2_3_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 10 && winners[1] == 18
				&& winners[2] == 26 && winners[3] == 34;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag3_0_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","O","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 14 && winners[1] == 22
				&& winners[2] == 30 && winners[3] == 38;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag3_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","O","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 15 && winners[1] == 23
				&& winners[2] == 31 && winners[3] == 39;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag3_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","O","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 16 && winners[1] == 24
				&& winners[2] == 32 && winners[3] == 40;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testdiag3_3_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","O","?","?"
				         ,"?","?","?","?","?","O","?"
				         ,"?","?","?","?","?","?","O"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 17 && winners[1] == 25
				&& winners[2] == 33 && winners[3] == 41;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	

	@Test
	void testDiagNoMatch() {
		String[] moves = {"X","?","?","?","?","?","?"
				         ,"?","X","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	

	@Test
	void testDiagEmpty() {
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


	

