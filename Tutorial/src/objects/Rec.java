package objects;

public class Rec {
	//instance variables or attributes
	private int x;
	private int y;
	private int width;
	private int height;
	//constructor
	public Rec() {
		x = 10;
		y = 10;
		width = 50;
		height = 100;
	}//end Rec
	public Rec(int x , int y , int w , int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}//end Rec(int x , int y , int w , int h)
	public int getx() {
		return x;
	}//end getx
	public void setx(int x) {
		this.x = x;
	}//end setx
	public void translate(int moveX , int moveY) {
		x += moveX;
		y += moveY;
	}//end translate
	
	}//end toString
}//end Rec
