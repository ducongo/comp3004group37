
package group37_demo;

import org.junit.Test;

import junit.framework.TestCase;

public class DeckTest extends TestCase{
	
	@Test
	public void testDeck() {
		Deck d = new Deck();
		assertNotNull(d);
	}
	
	@Test
	public void testNumberofTile() {
		Deck d = new Deck();
		assertEquals(104, d.getTotalTilesInDeck());
	}
	
}

2
