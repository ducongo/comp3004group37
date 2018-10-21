package group37_demo;
import java.util.ArrayList;



public class Player {
	
	protected ArrayList<Tile> hand = new ArrayList<Tile>();
	
	public boolean handIsEmpty() {
		
		if (hand.size() < 1) {
			return true;
		}
		return false;
	}
	
	public void hitMe(Tile newCard) {
		hand.add(newCard);
	}
	
	
	//this function is
	public ArrayList<Tile>  createSet(ArrayList<Integer> indexes) {
		ArrayList<Tile> set = new ArrayList<Tile>();
		
		for (int i = 0; i < set.size(); i++) {
			set.add(hand.get(indexes.get(i)));
		}
		
		return set;
	}
	
}
