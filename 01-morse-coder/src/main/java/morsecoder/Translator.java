package morsecoder;

public class Translator {
	
	private MorseTranslator mt;
	
	private IUserInputService input;
	
	public Translator(MorseTranslator mt, IUserInputService input) {
		this.mt = mt;
		this.input = input;
	}

	public String startTranslate() {
		String line = input.readLine();			
		String translatedLine = mt.translate(line);		
		System.out.println(translatedLine);	
		return line;		
	}
}
