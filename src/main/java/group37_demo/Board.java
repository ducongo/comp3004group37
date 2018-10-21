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
		String s = "";
		
		for (int i = 0; i < board.size(); i++) {
			for (int j = 0; j < board.get(i).size(); j++) {
				s += Integer.toString(i) + "|" + board.get(i).get(j).toString() + " ";
			}
			s += "\n";
		}
		s += "______________________________________________________________________________________________________________________";
		
		for(int i = 0; i < board.size(); i++) {
			s += Integer.toString(i) + "[       ]";
		}
		
		 return s; 
		 
	 } 
	
}












