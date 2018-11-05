package group37_demo;

import java.util.ArrayList;

public class Aiplayer extends Player implements Observer{
	
	private Board board;
	private Deck deck;
	/*private ArrayList<Integer> indexes;
	private ArrayList<Tile> group;
	*/
	
	
	public Aiplayer(ArrayList<Tile> tiles, String name, Board board, Deck deck) {
		
		
		super(tiles, name);
		this.board = board;
		this.deck = deck;
	}
	
	public void play(ArrayList<Integer> indexes, ArrayList<Tile> group, Tile tile) {
		
		System.out.println("Player p1's turn ");
		this.hand.addTile(deck.dealTile());
		
		this.hand.createMeld(indexes);
		if(this.hand.getMeldValue() >= 30) {
			board.addGroup(group);
		}else {
			this.hand.addTile(tile);
		}
		
	}
	
	public void Ai1Win() {
		if (this.hand.isEmpty()) {
			System.out.println("AI 1 is winner");
		}
	}
	
	

	public void update(Board b) {
		this.board = b;
		
	}

	public void update(Deck d) {
		
		this.deck = d;
	}

}
