package group37_demo;

public class Tile {
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

		 return String.format("[" + this.value + " " + this.color + "]"); // [10 REd]

	 } 
}
