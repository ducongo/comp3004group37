package group37_demo;
import java.util.ArrayList;

public class Board implements Subject{
	

	protected ArrayList<ArrayList<Tile>> board = new ArrayList<ArrayList<Tile>>();
	private ArrayList<Observer> observers;
	public Board() {
		observers = new ArrayList<Observer>();
		observers = new ArrayList<Observer>();
		
		
	}
	
	public void addGroup(ArrayList<Tile> group) {
		board.add(group);
		this.notifyObservers();
		this.highlightTiles(group, "*");
		this.boardChanged();
	}
	
	
	public void split(int indexX, int indexY) {
		
		ArrayList<Tile> newGroup = new ArrayList<Tile>();
		
		for (int i = indexX; i < board.get(indexY).size(); i++) {
			newGroup.add(board.get(indexY).get(i));
		}
		
		board.add(newGroup);
		this.highlightTiles(newGroup, "!");
		this.boardChanged();
		
	}
	
	public void splitRemove(int indexX, int indexY, ArrayList<Tile> newGroup) {
		
		this.highlightTiles(newGroup, "*");
				
		ArrayList<Tile> tempGroup = new ArrayList<Tile>();
		
		for (int i = indexX; i < board.get(indexY).size(); i++) {
			tempGroup.add(board.get(indexY).remove(i));
		}
		
		this.highlightTiles(tempGroup, "!");
		
		newGroup.add(tempGroup.remove(0));
		
		board.add(tempGroup);
		board.add(newGroup);
		this.boardChanged();
		
	}
	
	public void move(int indexX, int indexY, int numElementToMove, int newX, int newY) {
		
		ArrayList<Tile> newGroup = new ArrayList<Tile>();
		
		for(int i = indexX; i < (indexX + numElementToMove); i++) {
			
			newGroup.add(this.board.get(indexY).remove(i));
			
		}
		
		if(newX > this.board.get(newY).size()) {
			
			for (int i = 0; i < numElementToMove; i++) {
				
				this.board.get(newY).add(newGroup.get(i));
			}
		}else {
			for (int i = newX; i < (newX + numElementToMove); i++) {
				
				this.board.get(newY).add(i, newGroup.get(i));
				
			}
		}
		
	}
	
	
	
	private void highlightTiles(ArrayList<Tile> tiles, String state) {
		
		for (int i = 0; i < tiles.size(); i++) {
			tiles.get(i).changeState(state);
		}
	}
	
	private void unHighlightTiles() {
		
		for (int i = 0; i < board.size(); i++) {
			
			for (int j = 0; j < board.get(i).size(); j++) {
				board.get(i).get(j).changeState(" ");
			}
		}
	}
	
	
	@Override
	 public String toString() { 
		
		String s = "";
		int biggestSet = 0; //this variable will hold the biggest set size for matrix formatting
		
		for (int i = 0; i < board.size(); i++) {
			
			if(i < 10) {
				s += "0" + Integer.toString(i) + "| ";//+1
			}else {
				s += Integer.toString(i) + "| ";
			}
			
			if (board.get(i).size() > biggestSet){
				biggestSet = board.get(i).size();
			}
			
			for (int j = 0; j < board.get(i).size(); j++) {
				
				s += board.get(i).get(j).toString() + "  ";//+2
			}
			s += "\n";
		}
		
		for(int i = 0; i < ((biggestSet * 7) + (biggestSet * 2) + 1); i++) {
			s+="_";
		}
		
		for(int i = 0; i < ((biggestSet * 7) + (biggestSet * 2) + 1); i++) {
			s+="_";
		}
			//00 | [07 BL]  [10 BK]  [10 BK]  [10 BK]
			//01 | [07 BL]  [10 BK]  [10 BK]  [10 BK]
			//---------------------------------------
			//   | [  01 ]  [10 BK]  [10 BK]  [10 BK]  
		this.unHighlightTiles();
		return s; 
		 
	 }


	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		if(o != null){
			 
			observers.add(o);
		}
	}


	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		
		if (i >= 0) {
			observers.remove(i);
		}
		
	}


	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this);
		}
		
	} 
	
	 private void boardChanged() {
		 notifyObservers();
	 } 
	
}












