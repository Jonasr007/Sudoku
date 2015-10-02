package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		
		// Verify lenght
		//if(candidateSolution.length()!=81)
		//	return -5;
		
		System.out.println(candidateSolution);
		
		char[] solluctionArray = candidateSolution.toCharArray();		
		if(!correctNumbers(solluctionArray)) {
			return -1;
		}
		
		String [] subgrids = new String[9];
		for (int i=0; i<subgrids.length; i++) {
			subgrids[i]= candidateSolution.substring(0+i*3,2+i*3); 
		}
		
		for (int i=0; i<subgrids.length; i++) {
			String tmp = candidateSolution.substring(0,8);
			System.out.println(tmp);
			if(!unityCorrect(tmp.toCharArray()))
				return -3;
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