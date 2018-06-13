package morsecoder;

import java.util.HashMap;

public class FakeDictionaryService implements IDictionaryService{

	public HashMap<String, String> getDictionary(String fileName) {

		HashMap<String,String> dictionary = new HashMap<String, String>();
		
		dictionary.put("A", "B");
		dictionary.put("B", "C");
		dictionary.put("C", "D");		
		return dictionary;
	}

}
