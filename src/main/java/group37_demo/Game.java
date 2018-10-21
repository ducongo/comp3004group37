package group37_demo;


public class Game {
	private boolean gameRunning = false;
	private Deck deck;
	Player player1;
	Board board;
	
	public Game(Player p1, Deck deck, Board board) {
		this.board = new Board();
		this.player1 = p1;
		this.deck = new Deck();
		startGame();
	}
	
	private void startGame() {
		gameRunning = true;
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

