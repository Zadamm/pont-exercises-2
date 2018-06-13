package morsecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputService implements IUserInputService{
	public String readLine() {

    	InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String line = "";
		
		try {
			line = br.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return line;
	}
}
