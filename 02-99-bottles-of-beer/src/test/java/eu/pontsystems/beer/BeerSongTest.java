package eu.pontsystems.beer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BeerSongTest {
	
	@Test
	public void sing_NotEnoughBeer_DoesntSingReturnsZero() {
		BeerSong bs = new BeerSong();
		assertEquals(0,bs.sing(1));
		assertEquals(0,bs.sing(0));
	}
	
	@Test
	public void sing_EnoughBeer_SingsAndReturnsOne() {
		BeerSong bs = new BeerSong();
		assertEquals(1,bs.sing(3));
	}

}
