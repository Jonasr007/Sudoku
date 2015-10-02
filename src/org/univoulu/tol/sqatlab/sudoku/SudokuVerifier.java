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
		
		
		String tmp = candidateSolution.substring(0, 9);
		if(!unityCorrect(tmp.toCharArray()))
			return -3;
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
			if((int)(tmp[i])<48 || (int)(tmp[i])>56) {
				return false;
			}
		}				
		return true;
	}
}