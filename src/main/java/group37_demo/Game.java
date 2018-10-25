package group37_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private boolean gameRunning = false;
	private Deck deck;
	
	private Board board;
	Scanner mainScan = new Scanner(System.in);
	
	public Game() {

		//this.startGame(null);
	}
	private ArrayList<Player> players = new ArrayList<Player>();
	public void startGame() {
		gameRunning = true;
		
		deck = new Deck();
		deck.shuffleTiles();
		
		board = new Board();

		
		
		// add player
		
		for (int i = 0; i < 1; i++){
			ArrayList<Tile> group = new ArrayList<Tile>();
			for (int j = 0; j < 14; j++){
				group.add(deck.dealTile());
			}
			Player p = new Player(group, "human");
			players.add(p);
			
		}
		
		//player2 = new Player(group, "AI1");
		
		//players.add(player1);
		//players.add()
		int turnIndex = 0;
		Scanner scan = new Scanner(System.in);
		
		while(!this.isGameOver()) {
			if (turnIndex == 0) {
				
				while(true) {
					System.out.println(board.toString());
					//display number of tiles remaining for each players starting with player 1
					System.out.println("player: " + players.get(turnIndex) + " Number of remaining tiles: " + players.get(turnIndex).getHandSize());
									
					
					System.out.println("It’s your turn, what do you want to do?");
					System.out.println("Enter 1 to add to board, 2 to split, 3 to split and add, 4 to display board, 5 to end turn: ");
					int n = scan.nextInt();
					
					if(n == 1){
						players.get(turnIndex).toString();
							
						//create a set of tiles from the players hand and return it and add to the game board
						this.board.addGroup(this.players.get(turnIndex).createSet(this.addToBoard()));
						
						}else if (n == 2){
							
							this.board.split(this.splitBoard().get(0).intValue(), this.splitBoard().get(1).intValue());
							
						}else if (n == 3){
							System.out.println(board.toString());
							players.get(turnIndex).toString();
						//call getPlayrsindex
							this.board.splitRemove(this.splitBoard().get(0).intValue(), this.splitBoard().get(1).intValue(), this.players.get(turnIndex).createSet(this.addToBoard()));
							
							
						}else if (n == 4){
							
							System.out.println(board.toString());
							
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
	
	
	private ArrayList<Integer> addToBoard(){
		String[] indexStrings = new String[13];
				//call getPlayrsindex
		System.out.println("Enter index(s) of the tiles you want to group and separate them by a single 'space ': ");
		indexStrings = mainScan.nextLine().split(" ");
		System.out.println("YOU ENTERED : " + indexStrings[0] + " " + indexStrings[1]);
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		int i = 0;
		//indexStrings[i] != null find a better way to say this expression
		while (i < 2){
			System.out.println("Iteration: " + i);
			indexes.add(Integer.valueOf(indexStrings[i]));
			i++;
		}
		return indexes;
	}
	
	private ArrayList<Integer> splitBoard(){
		String[] indexStrings = new String[13];
		board.toString();
		
		System.out.println("Enter X index and the Y index separated by a single 'space ' of where you want to split: ");
		indexStrings = mainScan.nextLine().split(" ");
		
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		int i = 0;
		while (i < 2){
			indexes.add(Integer.valueOf(indexStrings[i]));
			i++;
		}
		
		return indexes;
	}

	

	
	
}
