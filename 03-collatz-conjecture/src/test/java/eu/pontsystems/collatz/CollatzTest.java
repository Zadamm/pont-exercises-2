package eu.pontsystems.collatz;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CollatzTest {
	
	/**
	 * Tests 3 cases:
	 * 27 requires 111 steps
	 * 871 requires 178 steps
	 * 6171 requires 261 steps
	 */
	@Test
	public void doConjecture_InputNumber_OutputCorrectValue() {
		
		assertEquals(111,Collatz.getNumberOfStepsInConjecture(27));
		assertEquals(178,Collatz.getNumberOfStepsInConjecture(871));
		assertEquals(261,Collatz.getNumberOfStepsInConjecture(6171));
		
	}
	
	/**
	 * Tests 3 cases:
	 * 18,25 meet at 22
	 * 30,29 meet at 40
	 * 24,26 meet at 10
	 */
	@Test
	public void calculateWhereTwoNumbersMeet_InputNumber_OutputCorrectValue() {
		
		assertEquals(22,Collatz.calculateWhereTwoNumbersMeet(18,25));
		assertEquals(40,Collatz.calculateWhereTwoNumbersMeet(30,29));
		assertEquals(10,Collatz.calculateWhereTwoNumbersMeet(24,26));
		
	}
	
}
