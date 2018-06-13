package morsecoder;

import java.util.HashMap;

public class MorseTranslator implements ITranslator{
	
	private HashMap<String,String> dictionary = new HashMap<String, String>();
	
	private IUserInputService input;
	
	private IOutputService output;
	
	public MorseTranslator(IDictionaryService ds, String fileName, IUserInputService input, IOutputService output) {
		this.dictionary = ds.getDictionary(fileName);
		this.input = input;
		this.output = output;
	}
	
	public String translate() {
		
		String line = input.readLine();		

		String morseLine = "";
	
		if(line.length() != 0) {
			line = line.toUpperCase();
			String letters [] = line.split("");
						
			for(int i = 0; i< letters.length; i++ ) {
				if(letters[i].equals(" ")) {
					morseLine += "/";
				} else {
					morseLine += " ";
					morseLine += dictionary.get(letters[i]);
				}			
			}
		} else {
			morseLine = "Kerem gepeljen be szoveget";
		}
		
		if(line.equals("EXIT")) {
			return line;
		}else {
			output.writeOut(morseLine);
			return morseLine;
		}
	}
}
