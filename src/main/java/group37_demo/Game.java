package group37_demo;

import java.util.ArrayList;

public class Game {
	private boolean gameRunning = false;
	private Deck deck;
	Player player1;
	Board board;
	
	public Game() {

		startGame();
	}
	
	private void startGame() {
		gameRunning = true;
		
		deck = new Deck();
		deck.shuffleTiles();
		
		board = new Board();
		// need add initBoard in board class
		board.initBoard();
		
		
		// add player
		Player player1 = new Player();

		
		
		//deck.dealTile();
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

