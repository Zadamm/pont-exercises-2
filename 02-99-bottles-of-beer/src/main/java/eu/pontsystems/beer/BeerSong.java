package eu.pontsystems.beer;

public class BeerSong {
	
	public int sing(int max) {
	    	
		int maxBeerBottles = max;
		int currentBeerBottle = maxBeerBottles;
		
		if(max>2) {
			do {
				System.out.println(currentBeerBottle + " bottles of beer on the wall, " 
									+ currentBeerBottle + " bottles of beer.");
				currentBeerBottle--;
				System.out.println("Take one down and pass it around, " + currentBeerBottle + " bottles of beer on the wall.");
			}while(currentBeerBottle > 1);
			
			System.out.println("1 bottle of beer on the wall, 1 bottle of beer. "+"\n"+ 
							"Take one down and pass it around, no more bottles of beer on the wall." +"\n"+
							"No more bottles of beer on the wall, no more bottles of beer." +"\n"+  
							"Go to the store and buy some more, " + maxBeerBottles + " bottles of beer on the wall.");
			return currentBeerBottle;
		} else {
			System.out.println("There are not enough beers on the wall to sing!");
			return 0;
		}
	}

}
