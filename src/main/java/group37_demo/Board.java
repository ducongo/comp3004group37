package group37_demo;
import java.util.ArrayList;

public class Board {
	

	protected ArrayList<ArrayList<Tile>> board = new ArrayList<ArrayList<Tile>>();
	
	
	public void addGroup(ArrayList<Tile> group) {
		board.add(group);
	}
	
	
	public void split(int indexX, int indexY) {
		
		ArrayList<Tile> newGroup = new ArrayList<Tile>();
		
		for (int i = indexX; i < board.get(indexY).size(); i++) {
			newGroup.add(board.get(indexY).get(i));
		}
		
		board.add(newGroup);
		
	}
	
	public void splitRemove(int indexX, int indexY, ArrayList<Tile> newGroup) {
		
		newGroup.add(board.get(indexY).remove(indexX));
		
		board.add(newGroup);
		
	}
	
	
	@Override
	 public String toString() { 
		System.out.println("PRINTING BOARD");
		System.out.println("Board.size() = " + board.size());
		//stem.out.println("Board.get(0).size() = " + board.get(0));
		String s = "";
		int biggestSet = 0; //this variable will hold the biggest set size for matrix formatting
		
		for (int i = 0; i < board.size(); i++) {
			System.out.println("INNER LOOP 1");
			if(i < 10) {
				s += "0" + Integer.toString(i) + "| ";//+1
			}else {
				s += Integer.toString(i) + "| ";
			}
			
			if (board.get(i).size() > biggestSet){
				biggestSet = board.get(i).size();
			}
			
			for (int j = 0; j < board.get(i).size(); j++) {
				System.out.println("INNER LOOP 1");
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
		 return s; 
		 
	 } 
	
}












