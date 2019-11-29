package edu.citytech.dao;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ReadingFile {

	private static final String WINNING_COMBO = "winning-combination.txt";

	public static void main(String[] args) {
		e1();

	}

	public static void e1() {

		InputStream in = ReadingFile.class.getResourceAsStream(WINNING_COMBO);
	
		Stream<String> lines = new BufferedReader(new InputStreamReader(in))
				                      .lines();
		
		Object[] rows = lines.toArray();
		int p1 = 0, p2 = 0, p3 = 0, p4 = 0 ;
		Boolean isFirstTime = true;
		
		for (Object currentRow : rows) {
			if(isFirstTime) 
				isFirstTime = false;
			else	{
			String [] columns = currentRow.toString().split(",");
			p1 = Integer.parseInt(columns[2]);
			p2 = Integer.parseInt(columns[3]);
			p3 = Integer.parseInt(columns[4]);
			p4 = Integer.parseInt(columns[5]);

			WinningCombo wc = new WinningCombo(p1,p2,p3,p4);
			System.out.println(wc);
			}
		}
		
	}

}
