package eu.pontsystems.beer;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class SongTest {

	Song bs = new Song();
	
	@Test	
	public void sing_FunctionAndIteration_ReturnsSame() {
		String functionSing = bs.sing();
		String interationSing = "";
		
		for(int i=99; i>=0; i--) {
			interationSing += bs.verse(i);
		}
		
		assertEquals(interationSing, functionSing);
	}
	
	@Test
	public void verse_ParamOne_ReturnsNormalVerse() {
		String verseOne =	"1 bottle of beer on the wall, 1 bottle of beer."+"\n"+ 
							"Take one down and pass it around, no more bottles of beer on the wall."+"\n";
		
		assertEquals(verseOne, bs.verse(1));
	}
	
	@Test
	public void verse_ParamZeroAnd99_ReturnsNormalVerse() {
		String verseZero =	"No more bottles of beer on the wall, no more bottles of beer." +"\n"+  
							"Go to the store and buy some more, " + 99 + " bottles of beer on the wall."+"\n";
		
		assertEquals(verseZero, bs.verse(0));
	}
	
	
	@Test
	public void verses_Param34to31_ReturnsNormalVerse() {
		String verse34to31 = 	34 + " bottles of beer on the wall, "	+ 34 + " bottles of beer."+"\n"+ 		
								"Take one down and pass it around, " + 33 + " bottles of beer on the wall."+"\n"+
								33 + " bottles of beer on the wall, "	+ 33 + " bottles of beer."+"\n"+ 		
								"Take one down and pass it around, " + 32 + " bottles of beer on the wall."+"\n"+
								32 + " bottles of beer on the wall, "	+ 32 + " bottles of beer."+"\n"+ 		
								"Take one down and pass it around, " + 31 + " bottles of beer on the wall."+"\n"+
								31 + " bottles of beer on the wall, "	+ 31 + " bottles of beer."+"\n"+ 		
								"Take one down and pass it around, " + 30 + " bottles of beer on the wall."+"\n";
		
		assertEquals(verse34to31, bs.verses(34, 31));
	}
	
	@Test 
	public void songConstructor_WithParams_ReturnsNormalVerse() {
		Song s = new Song("jug", "milk");
		
		String verse3 = "3 jugs of milk on the wall, 3 jugs of milk.\n"+ 
						"Take one down and pass it around, 2 jugs of milk on the wall.\n";
		
		assertEquals(verse3, s.verse(3));
	}
}
