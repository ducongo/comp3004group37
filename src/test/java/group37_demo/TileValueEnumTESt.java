package group37_demo;

import static org.junit.Assert.*;


import org.junit.Test;

public class TileValueEnumTESt {

	@Test
	public void testRed() {
		
		String value = TileValue.RED.toString();
		System.out.println(value);
		assertEquals("RED", value);
	}
	
	@Test
	public void testGreen() {
		
		String value = TileValue.GREEN.toString();
		System.out.println(value);
		assertEquals("GREEN", value);
	}
	
	@Test
	public void testBlue() {
		
		String value = TileValue.BLUE.toString();
		System.out.println(value);
		assertEquals("BLUE", value);
	}
	
	@Test
	public void testBlack() {
		
		String value = TileValue.BLACK.toString();
		System.out.println(value);
		assertEquals("BLACK", value);
	}

}






