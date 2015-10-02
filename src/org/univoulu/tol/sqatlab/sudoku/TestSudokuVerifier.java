package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {
	SudokuVerifier sV;
	
	@Test
	public void test() {
		String s= 	"123456789" +
					"234567891" +
					"345678912" +
					"456789123" +
					"567891234" + 
					"678912345" +
					"789123456" +
					"891234567" +
					"912345678";
		
		String s1 = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		sV= new SudokuVerifier(); 
		System.out.println(sV.verify(s1));
		//fail("Not yet implemented");
	    //assertEquals();
		
	}

}
