package eu.pontsystems.collatz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The place of the main function
 * @author boroczadam
 *
 */

public class App 
{
	/**
	 * Asks for a number on the console and writes back the number of steps required to reach 1 with the <code>{@link Collatz}</code> Conjecture.
	 * After that asks for two number on the console and calculate where and if they meet on the Collatz Conjecture.
	 * @param args arguments read from the console
	 */
    public static void main( String[] args )
    {
    	InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String line = "";
		String line2 = "";	

    	System.out.println("Adj meg egy szamot");
		try {
			line = br.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}		
    	System.out.println("Lépések szama: " + Collatz.getNumberOfStepsInConjecture(Integer.parseInt(line)));
    	
    	System.out.println("Add meg az elso szamot:");    	
		try {
			line = br.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Add meg a masodik szamot:");
		try {
			line2 = br.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		int meetingpoint = Collatz.calculateWhereTwoNumbersMeet(Integer.parseInt(line), Integer.parseInt(line2));
		System.out.println("Találkozási pontjuk: " + meetingpoint);
		
    }

}
