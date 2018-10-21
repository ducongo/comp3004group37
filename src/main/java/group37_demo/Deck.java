
package group37_demo;


import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private int size;
	private ArrayList<Tile> tileOfDeck;
	
	public Deck() {
		tileOfDeck = new ArrayList<Tile>();
		TileValue[] colors = {TileValue.GREEN, TileValue.RED, TileValue.BLACK, TileValue.BLUE};
		
		
		for (int j = 0; j < 4; j++) {	
			
			for (int i = 0; i < 13; i++) {
				
				Tile tile = new Tile(i, colors[j]);
				tileOfDeck.add(tile);
			}
		}
		
		this.shuffleTiles();
		
	}
	
	public ArrayList<Tile> getTileOfDeck(){return tileOfDeck;}
	
	public int getTotalTilesInDeck() {
		size = tileOfDeck.size();
		return size;
	}
	
	public Tile dealTile() {

		return tileOfDeck.get(0);
	}
	
	public void shuffleTiles() {
		Collections.shuffle(tileOfDeck);
	}
}
=======


