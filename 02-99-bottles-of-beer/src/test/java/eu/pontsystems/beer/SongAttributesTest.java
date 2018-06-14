package eu.pontsystems.beer;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class SongAttributesTest {

	SongAttributes sa = new SongAttributes();
	
	@Test
	public void getQuantity_Param0_returnsNoMore() {
				
		assertEquals("no more", sa.getQuantity(0));
		
	}
	
	@Test
	public void getQuantity_Param1_returnsNormalValues() {
				
		assertEquals("1", sa.getQuantity(1));
		
	}
	
	@Test
	public void getQuantity_Param12_returnsNormalValues() {
				
		assertEquals("12", sa.getQuantity(12));
		
	}
	
	@Test
	public void getContainer_Param1_returnsSingularValue() {
				
		assertEquals("bottle", sa.getContainer(1));
		
	}
	
	@Test
	public void getContainer_Param2_returnsMultiValue() {
				
		assertEquals("bottles", sa.getContainer(2));
		
	}
	
	@Test
	public void getContainer_Param0_returnsMultiValue() {
				
		assertEquals("bottles", sa.getContainer(0));
		
	}
}
