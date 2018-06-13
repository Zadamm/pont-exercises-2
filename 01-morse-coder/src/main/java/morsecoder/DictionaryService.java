package morsecoder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class DictionaryService implements IDictionaryService {
	
	public boolean checkNameFile(String fileName) {
		if(fileName.length() < 14 
			&& fileName.length() > 4 
			&& fileName.endsWith(".in")) {
				return true;			
		}
		return false;
	}

	public HashMap<String, String> getDictionary(String fileName) throws Exception {

		HashMap<String,String> dictionary = new HashMap<String, String>();
		
		if(checkNameFile(fileName)) {
			try {
				
				FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);
							
				while(br.ready()) {
					String line = br.readLine();
					String splittedLine [] = line.split("\\s+");
					//System.out.println(splittedLine[0] + " jelentese: " + splittedLine[1]);
					dictionary.put(splittedLine[0], splittedLine[1]);
				}			
				br.close();			
			} catch (Exception e) {
				e.printStackTrace();				
				throw e;
			}
		}
		return dictionary;
	}	

}
