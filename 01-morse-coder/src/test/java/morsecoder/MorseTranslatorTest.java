package morsecoder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MorseTranslatorTest {
	
	@Test
	public void translate_WithOutFileDictionary_Works() {
		MorseTranslator mt = new MorseTranslator(new FakeDictionaryService(),"");
		
		assertEquals(" B C D", mt.translate("abc"));
		
	}
	
	@Test 
	public void tranlate_EmptyLineParam_ReturnsUserInstructions() {
		MorseTranslator mt = new MorseTranslator(new FakeDictionaryService(),"");
		
		assertEquals("Kerem gepeljen be szoveget", mt.translate(""));
		
	}
}
