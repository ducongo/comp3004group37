package group37_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TileTest {

	@Test
	public void test() {
		TileValue color = TileValue._0RED;
		Tile t = new Tile(1, color);//
		System.out.println("TOSTRING(): "+ t.toString());
		assertEquals(t.toString(), t.toString());
	}

}
