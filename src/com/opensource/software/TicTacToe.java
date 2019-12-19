package com.opensource.software;


public class TicTacToe {
	
	private char[][] mygame;
	
	
	/**
	 * @return the mygame
	 */
	public char[][] getMygame() {
		return mygame;
	}

	
	/**
	 * @param mygame the mygame to set
	 */
	public void setMygame(char[][] mygame) {
		this.mygame = mygame;
	}

	private void mycall() {
		

		char[][] mygame = { { '-', '|', '+', '|', '-' }, { '-', '|', '+', '|', '-' }, { '-', '|', '+', '|', '-' } };
		for (char[] cs : mygame) {
			for (char cx : cs) {
				System.out.print(cx);
			}
			System.out.println();
		}
	}
	
	public void call() {
		this.mycall();
	}
}
