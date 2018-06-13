package morsecoder;

import java.util.HashMap;

public class BrailleTranslator implements ITranslator{
	
	private HashMap<String,String> dictionary = new HashMap<String, String>();	
	
	private IUserInputService input;
	
	private IOutputService output;
	
	public BrailleTranslator(IDictionaryService ds, String fileName, IUserInputService input, IOutputService output) {
		this.dictionary = ds.getDictionary(fileName);
		this.input = input;
		this.output = output;
	}
	
	public String translate() {
		
		String line = input.readLine();		

		String brailleLine = "";			
	
		if(line.length() != 0) {
			String letters [] = line.split("");
						
			for(int i = 0; i< letters.length; i++ ) {	
				if(letters[i].equals(" ")) {				
					brailleLine += "&#10240";
				} else {			
					brailleLine += "&#";
					brailleLine += dictionary.get(letters[i]);
				}
			}			
			
		} else {
			brailleLine = "Kerem gepeljen be szoveget";
		}
		
		if(line.equals("exit")) {
			return line;
		}else {
			output.writeOut(brailleLine);
			return brailleLine;
		}
	}

}
