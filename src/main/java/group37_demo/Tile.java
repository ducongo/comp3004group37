package group37_demo;
import java.util.Comparator;

public class Tile implements Comparable<Tile>{
	private int value;
	private TileValue color;
	
	public Tile(int value, TileValue color) {
		this.value = value;
		this.color = color;
	}
	
	public int getValue() {return this.value;}
	
	public TileValue getColor() {return this.color;}
	
	 @Override
	 public String toString() { 
		 
		 if (this.value < 10) {
			 return String.format("[0" + this.value + " " + this.color + "]");
		 }
		 return String.format("[" + this.value + " " + this.color + "]"); // [10 REd]

	 }

	public int compareTo(Tile that) {
		Integer thisValue = value;
		Integer thatValue = value;
		int compared = thisValue.compareTo(thatValue);
		if(compared == 0) {
			return this.color.toString().compareTo(that.color.toString());
		}
		return compared;
	} 
}




















