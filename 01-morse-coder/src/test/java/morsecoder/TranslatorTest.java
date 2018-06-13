package morsecoder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TranslatorTest {
	
	private Translator t;	
	
	public TranslatorTest() {
		t = new Translator(new MorseTranslator(new FakeDictionaryService(),""), new FakeUserInputService());		
	}

	@Test
	public void startTranslate_WithFakeServices_SysoSaysBCD() {
		assertEquals("abc",t.startTranslate());
	}
}
