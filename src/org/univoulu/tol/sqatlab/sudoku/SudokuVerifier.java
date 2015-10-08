package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		
		// returns -1 if an incorrect digit 				
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
				int leftTopCorner=27*j+i*3;
				String tmp= candidateSolution.substring(leftTopCorner,leftTopCorner+3) 
					+ candidateSolution.substring(leftTopCorner+9,leftTopCorner+3+9) 
					+ candidateSolution.substring(leftTopCorner+18,leftTopCorner+3+18); 
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
		
		// Verify lenght
		//if(candidateSolution.length()!=81)
		//	return -5;				
		
		return 0;		
	}
	
	// im compares every digit in the array with every digit in the array (really ineffective but with so array tenable)
	// return false if the is the same number to times on different places in the array
	public boolean unityCorrect(char [] tmp) {
		for (int i=0; i<tmp.length; i++) {
			for (int j=0; j<tmp.length; j++) {
				if(tmp[i]==tmp[j]&&i!=j) {
					return false;
				}
			}
		}		
		return true;
	}
	
	//check if every digit in the array is between 1 and 9 
	public boolean correctNumbers(char [] tmp) {	
		for (int i=0; i<tmp.length; i++) {
			if((int)(tmp[i])<49 || (int)(tmp[i])>57) {
				return false;
			}
		}				
		return true;
	}
}