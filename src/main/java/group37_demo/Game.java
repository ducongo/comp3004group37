package group37_demo;

import java.util.ArrayList;

public class Game {
	private boolean gameRunning = false;
	private Deck deck;
	Player player1, player2;
	Board board;
	
	public Game() {

		startGame(null);
	}
	
	private void startGame(ArrayList<Tile> group) {
		gameRunning = true;
		
		deck = new Deck();
		deck.shuffleTiles();
		
		board = new Board();
		// need add initBoard in board class
		//board.initBoard();
		board.addGroup(group);
		
		// add player
		player1 = new Player(group, "human");
		player2 = new Player(group, "AI1");

		
		
		
		
	}
	
	/*
	public void switchTurn() {
		for (Player p : players) {
			p.toggleTurn();
		}
		whoseTurn();
	}
	
	public void whoseTurn() {
		for (Player p : players) {
			if (p.isMyTurn()){
				System.out.println(p.getName() + "'s Turn");
			}
	}
	*/
	
	public void displayHands() {
		player1.toString();
		player2.toString();
	}
	public boolean isRunning() {return this.gameRunning;}
	
	public Deck getDeck() {return this.deck;}
	
	public boolean isGameOver() {
		return player1.handIsEmpty();
	}
	
	public void displayBoard() {
		board.toString();
	}
	
	
}
