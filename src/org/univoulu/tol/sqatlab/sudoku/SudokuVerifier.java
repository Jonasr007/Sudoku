package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		
		// Verify lenght
		//if(candidateSolution.length()!=81)
		//	return -5;
		
		
		char[] solluctionArray = candidateSolution.toCharArray();		
		if(!correctNumbers(solluctionArray)) {
			return -1;
		}
		
		// Test SubGrids
		// i is the row index (grid 1 or 2 or 3 in the row)
		// j is the column index (grid 1 or 2 or 3 in the column)
		String [] subgrids = new String[9];
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
			String tmp= candidateSolution.substring(0*j+i*3,2*j+i*3) 
					+ candidateSolution.substring(9*j+i*3,9*j+2+i*3) 
					+ candidateSolution.substring(18*j+i*3,18*j+2+i*3); 
			System.out.println(tmp);
			if(!unityCorrect(tmp.toCharArray()))
				return -2;
			}
		}
		
		// Test Rows:
		for (int i=0; i<subgrids.length; i++) {
			String tmp = candidateSolution.substring(0+9*i,9+9*i);
			if(!unityCorrect(tmp.toCharArray()))
				return -3;
		}
				
		// Test Columns
		for (int i=0; i<subgrids.length; i++) {
			String tmp = ""+ candidateSolution.charAt(0+i) + candidateSolution.charAt(9+i) + candidateSolution.charAt(18+i) 
			+ candidateSolution.charAt(27+i) + candidateSolution.charAt(36+i) + candidateSolution.charAt(45+i) 
			+ candidateSolution.charAt(54+i) + candidateSolution.charAt(63+i) + candidateSolution.charAt(72+i);
			if(!unityCorrect(tmp.toCharArray())) {
				return -4;
			}
		}
		
		return 0;		
	}
	
	public boolean unityCorrect(char [] tmp) {
		for (int i=0; i<tmp.length-1; i++) {
			for (int j=0; j<tmp.length-1; j++) {
				if(tmp[i]==tmp[j]&&i!=j) {
					return false;
				}
			}
		}		
		return true;
	}
	
	public boolean correctNumbers(char [] tmp) {	
		for (int i=0; i<tmp.length; i++) {
			if((int)(tmp[i])<48 || (int)(tmp[i])>57) {
				return false;
			}
		}				
		return true;
	}
}