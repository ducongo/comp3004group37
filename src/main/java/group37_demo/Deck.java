
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
			
			for (int i = 1; i < 14; i++) {
				
				Tile tile = new Tile(i, colors[j]);
				//System.out.println(tile.toString());
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

		return tileOfDeck.remove(0);
	}
	
	public void shuffleTiles() {
		Collections.shuffle(tileOfDeck);
	}
}



