package group37_demo;

import static org.junit.Assert.*;


import org.junit.Test;

public class PlayerTest {

	@Test
	public void handIsEmpty() {
		Player p = new Player();
		assertTrue(p.handIsEmpty());
		
	}
	
}
