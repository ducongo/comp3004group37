package group37_demo;
import java.util.ArrayList;



public class Player {
	
	protected Hand hand;
	protected String name;
	
	
	public Player(ArrayList<Tile> tiles, String name) {
		hand = new Hand(tiles);
		this.name = name;
	}
	

	public boolean handIsEmpty() {
		
		return hand.isEmpty();
	}
	
	public void addCardToHand(Tile newCard) {
		hand.addTile(newCard);
	}
	
	
	
	public void sortHand() {
		hand.sort();
	}
	
	public int getHandSize(){
		return hand.getSize();
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
