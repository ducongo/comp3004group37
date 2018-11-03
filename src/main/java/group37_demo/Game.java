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
	private ArrayList<Aiplayer> aiplayers = new ArrayList<Aiplayer>();
	public void startGame() {
		gameRunning = true;
		
		deck = new Deck();
		deck.shuffleTiles();
		
		board = new Board();

		
		
		// add player
		
		for (int i = 0; i < 3; i++){
			ArrayList<Tile> group = new ArrayList<Tile>();
			for (int j = 0; j < 14; j++){
				group.add(deck.dealTileInit());
			}
			
			if (i == 0) {
				Player p = new Player(group, "human");
				players.add(p);
			}else {
				Aiplayer p = new Aiplayer(group, "Strategy " + String.valueOf(i - 1), this.board, this.deck);
				
				
				if (p != null){
					System.out.println("AI IS NOT NULL");
				}else{
					System.out.println("AI IS NULL");
				}
				players.add(p);
				aiplayers.add(p);
				this.deck.registerObserver(aiplayers.get(i - 1));
				this.board.registerObserver(aiplayers.get(i - 1));
			}
			
			
		}
		
		
		int turnIndex = 0;
		Scanner scan = new Scanner(System.in);
		
		while(!this.isGameOver()) {
			
			if (turnIndex == 0) {
				boolean shoudDraw = true;//if the payer doesn't make a move then draw a card by default before ending their turn
				
				while(true) {
					System.out.println(board.toString());
					System.out.println("Your tile(s): " + players.get(turnIndex).toString());
					//display number of tiles remaining for each players starting with player 1
					for (int i = 1; i < players.size(); i++){
						System.out.println("Player: " + players.get(i).getName() + " Number of remaining tiles: " + players.get(i).getHandSize());
					}				
									
					
					System.out.println("It’s your turn, what do you want to do?");
					System.out.println("Enter (1) to add to board, (2) to split, (3) to split and add, (4) to display board, (5) Get a tile from the deck and (6) to end your turn: ");
					int n = scan.nextInt();
					
					
					
					
					if(n == 1){
						shoudDraw = false;				
													
						//create a set of tiles from the players hand and return it and add to the game board
						this.board.addGroup(this.players.get(turnIndex).createSet(this.addToBoard()));
						
						}else if (n == 2){
							shoudDraw = false;
							
							this.board.split(this.splitBoard().get(0).intValue(), this.splitBoard().get(1).intValue());
							
						}else if (n == 3){
							shoudDraw = false;
							System.out.println(board.toString());
							//players.get(turnIndex).toString();
						//call getPlayrsindex
							this.board.splitRemove(this.splitBoard().get(0).intValue(), this.splitBoard().get(1).intValue(), this.players.get(turnIndex).createSet(this.addToBoard()));
							
							
						}else if (n == 4){
							shoudDraw = false;
							System.out.println(board.toString());
							
						}else if (n == 5){
							shoudDraw = false;
							players.get(0).addCardToHand(this.deck.dealTile());
							break;
							
						}else if (n == 6){
							if (shoudDraw == true){
								players.get(0).addCardToHand(this.deck.dealTile());
							}
							break;
							
						}else{
							System.out.println("Please enter a valid option");
						}
					}
			}else {
				System.out.println("STRATEGIES ARE PLAYING");
				
				players.get(turnIndex).play();
			}
			
			if (turnIndex + 1 >= players.size()){
					turnIndex = 0;
			}else{
					turnIndex +=1;
			}
			System.out.println("***********************************************: " + turnIndex);
			
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
		//String[] indexStrings = new String[13];
				//call getPlayrsindex
		System.out.println("Enter index(s) of the tiles you want to group and separate them by a single 'space ': ");
		String[] indexStrings = mainScan.nextLine().split(" ");
		System.out.println("YOU ENTERED : " + indexStrings[0] + " " + indexStrings[1]);
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		int i = 0;
		//indexStrings[i] != null find a better way to say this expression
		//System.out.println("**************************************************************************************************************************************");
		//System.out.println("ARRAY LENGTH: "+ indexStrings.length);
		while (i < indexStrings.length){
			System.out.println("Iteration: " + i);
			indexes.add(Integer.valueOf(indexStrings[i]));
			i++;
		}
		return indexes;
	}
	
	private ArrayList<Integer> splitBoard(){
//		String[] indexStrings = new String[13];
		board.toString();
		
		System.out.println("Enter X index and the Y index separated by a single 'space ' of where you want to split: ");
		String[] indexStrings = mainScan.nextLine().split(" ");
		
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		int i = 0;
		
		//System.out.println("ARRAY LENGTH: "+ indexStrings.length);
		while (i < indexStrings.length){
			indexes.add(Integer.valueOf(indexStrings[i]));
			i++;
		}
		
		return indexes;
	}

	

	
	
}
