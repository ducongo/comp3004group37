package group37_demo;
import java.util.Comparator;

public class Tile implements Comparable<Tile>{
	private int value;
	private TileValue color;
	private String state = " ";
	
	public Tile(int value, TileValue color) {
		this.value = value;
		this.color = color;
	}
	
	public int getValue() {return this.value;}
	
	public TileValue getColor() {return this.color;}
	
	
	public void changeState(String state) {
		
		this.state = state;
	}
	
	
	 @Override
	 public String toString() { 
			 
		 String color = "";
		 if (this.color.toString() == "_0RED"){
			 color = "RE";
		 }else if (this.color.toString() == "_1BLUE"){
			 color = "BL";
		 }else if (this.color.toString() == "_2GREEN"){
			 color = "GR";
		 }else{
			 color = "BK";
		 }
		 
		 
		 if (this.value < 10) {
			 
			 return String.format(this.state +"{0" + this.value + " " + color + "}");
		 }
		 return String.format("{" + this.value + " " + color + "}"); // [10 REd]

	 }

	public int compareTo(Tile that) {
		// TODO Auto-generated method stub
		Integer thisValue = value;
		Integer thatValue = value;
		int compared = thisValue.compareTo(thatValue);
		if(compared == 0) {
			return this.color.toString().compareTo(that.color.toString());
		}
		return compared;
		
	}

	
}




















