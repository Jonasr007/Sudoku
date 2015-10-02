package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {
	SudokuVerifier sV;
	
	@Test
	public void test() {
		String s= "123456889";
		sV= new SudokuVerifier(); 
		System.out.println(sV.verify(s));
		//fail("Not yet implemented");
	    //assertEquals();
		
	}

}
