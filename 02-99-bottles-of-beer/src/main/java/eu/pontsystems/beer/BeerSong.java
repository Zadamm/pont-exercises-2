package eu.pontsystems.beer;

public class BeerSong {
	
	public String sing() {
	    	
		return verses(99, 0);
	}
	
	public String verse(int verseNumber, int maxVerse) {
		
		if(verseNumber < 0 || maxVerse < 0) {
			return "NO NEGATIVE NUMBERS!";			
		}	
		
		if(verseNumber == 1) {
			return 	"1 bottle of beer on the wall, 1 bottle of beer. "+"\n"+ 
					"Take one down and pass it around, no more bottles of beer on the wall."+"\n";			
		}
		if(verseNumber == 0) {
			return 	"No more bottles of beer on the wall, no more bottles of beer." +"\n"+  
					"Go to the store and buy some more, " + maxVerse + " bottles of beer on the wall."+"\n";
		}
		
		return 	verseNumber + " bottles of beer on the wall, "	+ verseNumber + " bottles of beer."+"\n"+ 		
				"Take one down and pass it around, " + (verseNumber-1) + " bottles of beer on the wall."+"\n";		
	}
	
	public String verses(int from, int to) {
		if(from < 0 || to < 0) {
			return "NO NEGATIVE NUMBERS!"; 
		}
		
		String verseString = "";
		
		for(int i=from; i>=to; i--) {
			verseString += verse(i, from);
		}
		
		return verseString;
	}
}
