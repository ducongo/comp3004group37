
package group37_demo;


import java.util.ArrayList;
import java.util.Collections;

public class Deck implements Subject{
	private int size;
	private ArrayList<Tile> tileOfDeck;
	
	private ArrayList<Observer> observers;
	
	public Deck() {
		tileOfDeck = new ArrayList<Tile>();
		TileValue[] colors = {TileValue._2GREEN, TileValue._0RED, TileValue._3BLACK, TileValue._1BLUE};
		
		
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
		Tile dealtTile = tileOfDeck.remove(0);
		this.deckChanged();
		return dealtTile;
	}
	
	public void shuffleTiles() {
		Collections.shuffle(tileOfDeck);
	}

	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}


	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		
		if (i >= 0) {
			observers.remove(i);
		}
		
	}


	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this);
		}
		
	} 
	
	 private void deckChanged() {
		 notifyObservers();
	 } 
}



