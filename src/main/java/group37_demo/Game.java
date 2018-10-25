package group37_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private boolean gameRunning = false;
	private Deck deck;
	Player player1, player2;
	Board board;
	
	public Game() {

		startGame(null);
	}
	private ArrayList<Player> players = new ArrayList<Player>();
	private void startGame(ArrayList<Tile> group) {
		gameRunning = true;
		
		deck = new Deck();
		deck.shuffleTiles();
		
		board = new Board();

		board.addGroup(group);
		
		// add player
		player1 = new Player(group, "human");
		player2 = new Player(group, "AI1");

		int turnIndex = 0;
		
		while(!this.isGameOver()) {
			if (turnIndex == 0) {
				
				while(true) {
					board.toString();
					//display number of tiles remaining for each players starting with player 1
					
					player1.getHandSize();
					player2.getHandSize();
					
					Scanner scan = new Scanner(System.in);
					System.out.println("It’s your turn, what do you want to do?");
					System.out.println("Enter 1 to add to board, 2 to split, 3 to split and add, 4 to display board, 5 to end turn: ");
					int n = scan.nextInt();
					
					if(n == 1){
						player1.toString();
						//call getPlayrsindex
						}else if (n == 2){
							player1.toString();
						}else if (n == 3){
							player1.toString();
						//call getPlayrsindex
						}else if (n == 4){
							board.toString();
						}else if (n == 5){
							break;
						}else{
							System.out.println("Please enter a valid option");
						}
					}
			}else {
				//computer
				//function will be called play(Board board)	
			}
			/*
			if (turnIndex + 1 >= players.size()){
					turnIndex = 0;
			}else{
					turnIndex +=1;
			}
			*/
		}
	}
		
	
	
	public boolean isGameOver(){
		for (int i = 0; i < players.size(); i ++){
			if(players.get(i).handIsEmpty()){
				return true;
			}
		}
		return false;
	}

	public boolean isRunning() {return this.gameRunning;}
	
	public Deck getDeck() {return this.deck;}
	

	

	
	
}
