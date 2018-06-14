package eu.pontsystems.beer;

public class App 
{
    public static void main( String[] args )
    {
    	Song bs = new Song();
    	System.out.println(bs.sing());
    	System.out.println("-----42. verse-----");
    	System.out.println(bs.verse(42, 0));
    	System.out.println(bs.verse(0, 0));
    	System.out.println("-----from 19. to 10. verses------");
    	System.out.println(bs.verses(19, 10));
    	System.out.println("-----from 10. to 0. verses------");
    	System.out.println(bs.verses(10, 0));
    	System.out.println("-----from 1. to 1. verses------");
    	System.out.println(bs.verses(1, 1));
    }

}
