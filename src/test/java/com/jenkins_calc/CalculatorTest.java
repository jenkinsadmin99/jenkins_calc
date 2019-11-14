package com.jenkins_calc;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void testSum2() {
		int result = calculator.sum(3, 4);

		assertEquals(7, result);
	}
	@Test
	public void testSumAgain() {
		int result = calculator.sum(1, 5);
		assertEquals(result, 6);
	}	

	@Test
	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10, 0);
	}
    
    //@Ignore
	@Test
		public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);

		//assertFalse(result);
		assertTrue(result);
	}
	
	@Test
	public void testSubstraction() {
		int result = calculator.subtraction(10, 3);

		assertTrue(result == 7);
	}

        // Comment
        @Test
        public void testSubtraction2() {
	    int result = calculator.subtraction(10,4);
	    assertTrue(result == 6);
	}
}
