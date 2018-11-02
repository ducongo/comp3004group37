package group37_demo;

import static org.junit.Assert.*;


import org.junit.Test;

public class TileValueEnumTESt {

	@Test
	public void testRed() {
		
		String value = TileValue._0RED.toString();
		System.out.println(value);
		assertEquals("RED", value);
	}
	
	@Test
	public void testGreen() {
		
		String value = TileValue._2GREEN.toString();
		System.out.println(value);
		assertEquals("GREEN", value);
	}
	
	@Test
	public void testBlue() {
		
		String value = TileValue._1BLUE.toString();
		System.out.println(value);
		assertEquals("BLUE", value);
	}
	
	@Test
	public void testBlack() {
		
		String value = TileValue._3BLACK.toString();
		System.out.println(value);
		assertEquals("BLACK", value);
	}

}






