package morsecoder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrailleTranslatorTest {
	@Test
	public void translate_WithOutFileDictionary_Works() {
		
		FakeOutputService fos = new FakeOutputService();
				
		BrailleTranslator bt = new BrailleTranslator(new FakeDictionaryService(),"", new FakeUserInputService(), fos);
		
		String translated = bt.translate();
		
		assertEquals(fos.lastLine, translated);
		
	}
	
	@Test 
	public void translate_EmptyLineParam_ReturnsUserInstructions() {
		
		FakeOutputService fos = new FakeOutputService();
		FakeUserInputService fuis = new FakeUserInputService();
		fuis.line = "";
		
		BrailleTranslator bt = new BrailleTranslator(new FakeDictionaryService(),"", fuis, fos);
		
		String translated = bt.translate();		
		assertEquals("Kerem gepeljen be szoveget", translated);		
	}
	
	@Test
	public void translate_ExitLineParam_ReturnsEXITLine() {
		FakeOutputService fos = new FakeOutputService();
		FakeUserInputService fuis = new FakeUserInputService();
		fuis.line = "exit";
		
		BrailleTranslator bt = new BrailleTranslator(new FakeDictionaryService(),"", fuis, fos);
		
		String translated = bt.translate();		
		assertEquals("exit", translated);		
	}
	
	@Test
	public void translate_NormalInputNormalDictionary_ReturnsNormalOutput() {
		FakeOutputService fos = new FakeOutputService();
		FakeUserInputService fuis = new FakeUserInputService();
		fuis.line = "hello world";
		String expected = "&#10259&#10257&#10247&#10247&#10261&#10240&#10298&#10261&#10263&#10247&#10265";
		
		BrailleTranslator bt = new BrailleTranslator(new DictionaryService(),"braille.in", fuis, fos);
		
		String translated = bt.translate();		
		assertEquals(expected, translated);		
	}
}
