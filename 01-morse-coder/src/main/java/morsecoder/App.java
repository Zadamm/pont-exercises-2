package morsecoder;

public class App 
{
    public static void main( String[] args )
    { 	    	    	
    	
		System.out.println("Gépeljen be egy szöveget es leforditom morse szovegre: ");
		
		ITranslator mt = new MorseTranslator(new DictionaryService(), "morse.in", new UserInputService(), new SysoOutputService());
		
		String exitSign;
		do {
			exitSign = mt.translate();
		}while(!exitSign.equals("EXIT"));
		
		System.out.println("Gépeljen be egy szöveget es leforditom braille szovegre: ");
		
		ITranslator bt = new BrailleTranslator(new DictionaryService(), "braille.in", new UserInputService(), new HtmlOutputService());
		
		do {
			exitSign = bt.translate();
		}while(!exitSign.equals("exit"));
    }

}
