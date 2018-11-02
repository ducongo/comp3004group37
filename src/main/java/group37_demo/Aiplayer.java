package group37_demo;

import java.util.ArrayList;

public class Aiplayer extends Player implements Observer{
	
	private Board board;
	private Deck deck;
	
	public Aiplayer(ArrayList<Tile> tiles, String name, Board board, Deck deck) {
		
		
		super(tiles, name);
		this.board = board;
		this.deck = deck;
	}
	
	public void play() {
		
		this.hand.addTile(deck.dealTile());
	}
	
	

	public void update(Board b) {
		this.board = b;
		
	}

	public void update(Deck d) {
		
		this.deck = d;
	}

}
