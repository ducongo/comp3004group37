package group37_demo;

import java.util.ArrayList;

public class Aiplayer3 extends Player implements Observer{
	
	private Board board;
	private Deck deck;
	
	public Aiplayer3(ArrayList<Tile> tiles, String name, Board board, Deck deck) {
		
		
		super(tiles, name);
		this.board = board;
		this.deck = deck;
	}
	
	public void play() {
		
		System.out.println("Player p3's turn ");
		this.hand.addTile(deck.dealTile());
		
		this.hand.createMeld(null);
		/*
		if (initValue >= 30) {
			
			//board.add();
		} else {
			//ai3 draw a card
		}
		*/
		
	}
	
	

	public void update(Board b) {
		this.board = b;
		
	}

	public void update(Deck d) {
		
		this.deck = d;
	}

}
