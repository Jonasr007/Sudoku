package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		
		// Verify lenght
		if(candidateSolution.length()!=81)
			return -5;
		
		char[] solluctionArray = candidateSolution.toCharArray();
		
		return 0;		
	}
	
	public boolean compare() {
		
		
		return true;
	}
}
