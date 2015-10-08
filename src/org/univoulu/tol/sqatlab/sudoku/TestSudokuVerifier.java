package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {
	SudokuVerifier sV;
	
	@Test
	public void test() {
		// incorrect example
		String s= 	"123456789" +
					"234567891" +
					"345678912" +
					"456789123" +
					"567891234" + 
					"678912345" +
					"789123456" +
					"891234567" +
					"912345678";
		// correct example
		String t = "417369825" +
				"632158947" +
				"958724316" +
				"825437169" +
				"791586432" +
				"346912758" +
				"289643571" +
				"573291684" +
				"164875293";

		sV= new SudokuVerifier(); 
	    //assertEquals();
		
		// Tests for case 1:
		
		// a Letter in a line
		s= 	"12345678i" +
				"234567891" +
				"345678912" +
				"456789123" +
				"567891234" + 
				"678912345" +
				"789123456" +
				"891234567" +
				"912345678";		
		assertEquals(sV.verify(s), -1);
		
		// a 0 in a line
		s= 	"123456780" +
				"234567891" +
				"345678912" +
				"456789123" +
				"567891234" + 
				"678912345" +
				"789123456" +
				"891234567" +
				"912345678";
		assertEquals(sV.verify(s), -1);
		
		// Tests for case 2:
		
		// 2x 1 in the first grid
		t = 	"417369825" +
				"632158947" +
				"951724316" +
				"825437169" +
				"791586432" +
				"346912758" +
				"289643571" +
				"573291684" +
				"164875293";
		assertEquals(sV.verify(t), -2);
		
		// 2x 4 in the five grid
				t = 	"417369825" +
						"632158947" +
						"958724316" +
						"825437169" +
						"791546432" +
						"346912758" +
						"289643571" +
						"573291684" +
						"164875293";
		assertEquals(sV.verify(t), -2);
		
		// 2x 8 in the nine grid
		t = 	"417369825" +
				"632158947" +
				"958724316" +
				"825437169" +
				"791546432" +
				"346912758" +
				"289643571" +
				"573291684" +
				"164875298";
		assertEquals(sV.verify(t), -2);
		
		// Tests for case 3:
		// Column and Grid rule are correct but in every row are just 3 different number (every number 3 times)
		t = 	"147147147" +
				"258258258" +
				"369369369" +
				
				"471471471" +
				"582582582" +
				"639639639" +
				
				"714714714" +
				"825825825" +
				"936936936";
		assertEquals(sV.verify(t), -3);
		
		// Tests for case 4:
		// Line and Grid rule are correct but in every column are just 3 different number (every number 3 times)
		t = 	"123456789" +
				"456789123" +
				"789123456" +
				"123456789" +
				"456789123" +
				"789123456" +
				"123456789" +
				"456789123" +
				"789123456";
		assertEquals(sV.verify(t), -4);
		
		// Test with a correct soduko 
		t = "417369825" +
				"632158947" +
				"958724316" +
				"825437169" +
				"791586432" +
				"346912758" +
				"289643571" +
				"573291684" +
				"164875293";
		assertEquals(sV.verify(t), 0);

	}
}