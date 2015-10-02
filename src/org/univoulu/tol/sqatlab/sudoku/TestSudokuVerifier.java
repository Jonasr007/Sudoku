package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {
	SudokuVerifier sV;
	
	@Test
	public void test() {
		String s= 	"123456789" +
					"406789123" +
					"789123056" +
					"891234567" +
					"234067091" + 
					"567891234" +
					"678012345" +
					"912345678" +
					"345678012";
		sV= new SudokuVerifier(); 
		System.out.println(sV.verify(s));
		//fail("Not yet implemented");
	    //assertEquals();
		
	}

}
