package eu.pontsystems.collatz;

import java.util.ArrayList;
import java.util.List;

/**
 * The class to hold the function of the Collatz Conjecture
 * @author boroczadam
 *
 */
public class Collatz {
	
	/**
	 * Return the number of steps to reach 1 from the input number with the Collatz Conjeture
	 * @param number the number to do the Conjecture on
	 * @return number of steps to reach 1
	 */
	
	public static int getNumberOfStepsInConjecture(int number) {
		return getListOfConjecture(number).size();
	}
	
	
	/**
	 * Does the Collatz Conjecture with an input number and returns a list of the steps in the Conjecture
	 * 
	 * @param number the number to do the Conjecture on
	 * @return List of the steps in the Conjecture
	 */
	private static List<Integer> getListOfConjecture(int number) {
		
		List<Integer> steps = new ArrayList();
    	
    	while(number != 1) {
    		number = oneStepInConjecture(number);
			steps.add(number);
    	}    	
    	return steps;
		
	}	
	
	/**
	 * Does one step in the Collatz Conjecture: if even divides by 2, if odd it triples the number and add one
	 * @param number the input number
	 * @return the next number in the Conjecture
	 */
	private static int oneStepInConjecture(int number) {
		
		if(number % 2 == 0) {
			number /= 2;
		} else {
			number *= 3;
			number += 1;
		}
		
		return number;
	}
	
	/**
	 * Decides where two number meet in the Collatz Conjecture
	 * @param number1 the first number to compare
	 * @param number2 the second number to compare
	 * @return the number where the two numbers meet
	 */
	public static int calculateWhereTwoNumbersMeet(int number1, int number2) {
		
		int meetingpoint = 0;
		List<Integer> number1Steps = new ArrayList<Integer>();
		List<Integer> number2Steps = new ArrayList<Integer>();
		
		//fills up the two list with the Conjecture steps
		number1Steps = getListOfConjecture(number1);
		number2Steps = getListOfConjecture(number2);
		
		//compares the two list for the meeting point a breaks the cycles when it's found
		for(int i = 0; number1Steps.size() > i; i++) {
			for (int j = 0; j < number2Steps.size(); j++) {
				if(number1Steps.get(i) == number2Steps.get(j)) {
					meetingpoint = number1Steps.get(i);
					break;
				}				
			}
			if(meetingpoint > 0) break;
		}
		
		return meetingpoint;		
	}
}
