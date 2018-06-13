package morsecoder;

import java.util.HashMap;

public class MorseTranslator {
	
	private HashMap<String,String> dictionary = new HashMap<String, String>();
	
	private IDictionaryService ds;
	
	public MorseTranslator(IDictionaryService ds, String fileName) {
		this.ds = ds;
		this.dictionary = ds.getDictionary(fileName);
	}
	
	public String translate(String line) {

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
		
		return morseLine;
	}
}
