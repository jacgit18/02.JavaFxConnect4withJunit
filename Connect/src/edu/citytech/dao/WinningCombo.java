package edu.citytech.dao;

public class WinningCombo {

	public final int p1;
	public final int p2;
	public final int p3;
	public final int p4;


	public WinningCombo(int p1, int p2, int p3, int p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;

		
	}


	@Override
	public String toString() {
		return "WinningCombo [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + "]";
	}

	
	
	

}
