package eu.pontsystems.beer;

public class Song {
	
	private SongAttributes sa;
	
	public Song(String bottleType, String liquidtype) {
		sa = new SongAttributes(bottleType,liquidtype);
	}
	
	public Song() {
		sa = new SongAttributes();
	}
	
	public String sing() {
	    	
		return verses(99, 0);
	}
	
	public String verse(int verseNumber) {		
		
		if(verseNumber < 0) {
			return "NO NEGATIVE NUMBERS!";			
		}		
			
		return	capitalize(sa.getQuantity(verseNumber)) + " " + sa.getContainer(verseNumber) + " of "+ sa.getLiquidType() + " on the wall, "
				+ sa.getQuantity(verseNumber) + " " + sa.getContainer(verseNumber) + " of " + sa.getLiquidType() + "."+"\n"
				+ sa.getAction(verseNumber) 
				+ sa.getQuantity(verseNumber-1) + " " + sa.getContainer(verseNumber-1) + " of " + sa.getLiquidType() + " on the wall."+"\n";
		
	}
	
	public String capitalize(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	public String verses(int from, int to) {
		if(from < 0 || to < 0) {
			return "NO NEGATIVE NUMBERS!"; 
		}
		
		String verseString = "";
		
		for(int i=from; i>=to; i--) {
			verseString += verse(i);
		}
		
		return verseString;
	}
}
