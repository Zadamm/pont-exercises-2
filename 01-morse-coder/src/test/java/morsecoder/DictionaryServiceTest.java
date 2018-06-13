package morsecoder;

import static org.junit.Assert.assertFalse;

import java.io.FileNotFoundException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DictionaryServiceTest {

	DictionaryService ds = new DictionaryService();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void checkFileName_IncorrectFileName_ReturnsFalse() {
		assertFalse(ds.checkNameFile("askdfkajsdfkjkasdfkklajsd"));
		assertFalse(ds.checkNameFile("a"));
		assertFalse(ds.checkNameFile("a.exe"));
	}
	
	@Test
	public void getDictionary_NonExistentFile_ReturnsException() throws Exception {

	    thrown.expect(FileNotFoundException.class);
	    thrown.expectMessage("valami.in (A rendszer nem találja a megadott fájlt)");
	    
	    ds.getDictionary("valami.in");
	}
}
