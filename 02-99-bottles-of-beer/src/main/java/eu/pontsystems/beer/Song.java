package eu.pontsystems.beer;

public class Song {
	
	public String sing() {
	    	
		return verses(99, 0);
	}
	
	public String verse(int verseNumber, int maxVerse) {
		
		if(verseNumber < 0 || maxVerse < 0) {
			return "NO NEGATIVE NUMBERS!";			
		}
		
		String firstVerseNumber = Integer.toString(verseNumber) +" bottles";
		String secondVerseNumber = Integer.toString(verseNumber) +" bottles";
		String thirdVerseNumber = Integer.toString(verseNumber-1) +" bottles";
		String secondLineStart = "Take one down and pass it around, ";
		
		if(verseNumber == 1) {
			firstVerseNumber = "1 bottle";
			secondVerseNumber = "1 bottle";
			thirdVerseNumber = "no more bottles";		
		}
		
		if(verseNumber == 0) {
			firstVerseNumber = "No more bottles";
			secondVerseNumber = "no more bottles";
			thirdVerseNumber = Integer.toString(maxVerse) + " bottles";
			secondLineStart = "Go to the store and buy some more, ";
		}	
		
		return	firstVerseNumber + " of beer on the wall, "	+ secondVerseNumber + " of beer."+"\n"+
				secondLineStart + thirdVerseNumber +" of beer on the wall."+"\n";				
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
