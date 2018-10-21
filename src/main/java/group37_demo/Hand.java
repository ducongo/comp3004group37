package group37_demo;
import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	protected ArrayList<Tile> tiles = new ArrayList<Tile>();
	
	public Hand(ArrayList<Tile> tiles) {
		Collections.copy(this.tiles,tiles);
	}
	
	public int getSize() {
		return tiles.size();
	}
	
	public void addTile(Tile tile) {
		this.tiles.add(tile);
	}
	
	public boolean isEmpty() {
		
		if (tiles.size() < 1) {
			return true;
		}
		return false;
	}
	
	public ArrayList<Tile> createMeld(ArrayList<Integer> indexes){
		ArrayList<Tile> meld = new ArrayList<Tile>();
				
		for (int i = 0; i < meld.size(); i++) {
			meld.add(tiles.get(indexes.get(i)));
		}
			
		return meld;
	}
	
	public void sort() {
		Collections.sort(tiles);
	}
	
	
	@Override
	 public String toString() { 
		
		String s = "";
		
		for (int i = 0; i < tiles.size(); i++) {
			s += tiles.get(i).toString() + "  ";			
		}
		
		 return s;
	 } 
	
}


























