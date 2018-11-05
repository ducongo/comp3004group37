package group37_demo;
import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	protected ArrayList<Tile> tiles;
	
	public Hand(ArrayList<Tile> tiles) {
		this.tiles = new ArrayList<Tile>(tiles);
		//Collections.copy(this.tiles,tiles);
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
				
		for (int i = 0; i < indexes.size(); i++) {
			//tiles.get(indexes.get(i))
			meld.add(tiles.remove(indexes.get(i).intValue()));
		}
			
		return meld;
	}
	
	public void sort() {
		Collections.sort(tiles);
	}
	
	public int getMeldValue() {
		
		int value = 0;
		
		if(this.tiles.isEmpty())
			return value;
		else {
			for(int i = 0; i < this.tiles.size(); i++) {
				value += this.tiles.get(i).getValue();
			}
			return value;
		}		
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


























