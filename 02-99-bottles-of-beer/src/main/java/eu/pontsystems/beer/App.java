package eu.pontsystems.beer;

public class App 
{
    public static void main( String[] args )
    {
    	BeerSong bs = new BeerSong();
    	System.out.println(bs.sing());
    	System.out.println("-----42. verse-----");
    	System.out.println(bs.verse(42, 0) + "hossza: " + bs.verse(42, 0).length());
    	System.out.println(bs.verse(0, 0) + "hossza: " + bs.verse(0, 0).length());
    	System.out.println("-----from 19. to 10. verses------");
    	System.out.println(bs.verses(19, 10));
    	System.out.println("-----from 999. to 0. verses------");
    	System.out.println(bs.verses(999, 0));
    	System.out.println("-----from 1. to 1. verses------");
    	System.out.println(bs.verses(1, 1) + "hossza: " + bs.verses(1, 1).length());
    }

}
