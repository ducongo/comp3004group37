
package group37_demo;

import static org.junit.Assert.*;

public class GameTest{
	
	@Test
	public void testGameInitialization() {
		Game g = new Game();
		assertTrue(g.isRunning());
	}
	
	@Test
	public void testDeck() {
		Game g = new Game();
		assertNotNull(g.getDeck());
	}
}

