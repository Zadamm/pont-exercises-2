package morsecoder;

public class App 
{
    public static void main( String[] args )
    { 	    	
    	MorseTranslator mt = new MorseTranslator(new DictionaryService(), "morse.in");
    	
    	IUserInputService input = new UserInputService();    	
    	
		System.out.println("G�peljen be egy sz�veget es leforditom morse szovegre: ");
		
		Translator t = new Translator(mt, input);
		
		String exitSign;
		do {
			exitSign = t.startTranslate();
		}while(!exitSign.equals("exit"));
    }

}
