package morsecoder;

public class App 
{
    public static void main( String[] args )
    { 	    	    	
    	
		System.out.println("G�peljen be egy sz�veget es leforditom morse szovegre: ");
		
		ITranslator mt = new MorseTranslator(new DictionaryService(), "morse.in", new UserInputService(), new SysoOutputService());
		
		String exitSign;
		do {
			exitSign = mt.translate();
		}while(!exitSign.equals("EXIT"));
		
		System.out.println("G�peljen be egy sz�veget es leforditom braille szovegre: ");
		
		ITranslator bt = new BrailleTranslator(new DictionaryService(), "braille.in", new UserInputService(), new HtmlOutputService());
		
		do {
			exitSign = bt.translate();
		}while(!exitSign.equals("exit"));
    }

}
