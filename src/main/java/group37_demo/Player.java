package group37_demo;
import java.util.ArrayList;



public class Player {
	
	protected Hand hand;
	
	public Player(ArrayList<Tile> tiles) {
		hand = new Hand(tiles);
	}
	
	public boolean handIsEmpty() {
		
		return hand.isEmpty();
	}
	
	public void hitMe(Tile newCard) {
		hand.addTile(newCard);
	}
	
	public void sortHand() {
		hand.sort();
	}
	
	
	//this function is
	public ArrayList<Tile>  createSet(ArrayList<Integer> indexes) {
		
		return this.hand.createMeld(indexes);
	}
	
	@Override
	 public String toString() { 
		
		 return hand.toString();
	 } 
	
}
