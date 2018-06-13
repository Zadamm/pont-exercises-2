package morsecoder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MorseTranslatorTest {
	
	@Test
	public void translate_WithOutFileDictionary_Works(){
		
		FakeOutputService fos = new FakeOutputService();
				
		MorseTranslator mt = new MorseTranslator(new FakeDictionaryService(),"", new FakeUserInputService(), fos);
		
		String translated = mt.translate();
		
		assertEquals(fos.lastLine, translated);
		
	}
	
	@Test 
	public void translate_EmptyLineParam_ReturnsUserInstructions(){
		
		FakeOutputService fos = new FakeOutputService();
		FakeUserInputService fuis = new FakeUserInputService();
		fuis.line = "";
		
		MorseTranslator mt = new MorseTranslator(new FakeDictionaryService(),"", fuis, fos);
		
		String translated = mt.translate();
		
		assertEquals("Kerem gepeljen be szoveget", translated);		
	}
	
	@Test
	public void translate_ExitLineParam_ReturnsEXITLine(){
		FakeOutputService fos = new FakeOutputService();
		FakeUserInputService fuis = new FakeUserInputService();
		fuis.line = "exit";
		
		MorseTranslator mt = new MorseTranslator(new FakeDictionaryService(),"", fuis, fos);
		
		String translated = mt.translate();		
		assertEquals("EXIT", translated);		
	}	
	
	@Test
	public void translate_NormalInputNormalDictionary_ReturnsNormalOutput(){
		FakeOutputService fos = new FakeOutputService();
		FakeUserInputService fuis = new FakeUserInputService();
		fuis.line = "hello world";
		String expected = " .... . .-.. .-.. ---/ .-- --- .-. .-.. -..";
		
		MorseTranslator mt = new MorseTranslator(new DictionaryService(),"morse.in", fuis, fos);
		
		String translated = mt.translate();		
		assertEquals(expected, translated);		
	}
}
