package Day22;

import java.io.Serializable;

public class Point implements Serializable{
	
	private int x;
	private int y;
	
	public Point() {
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Point ["+ (x + y )+ "]";
	}
	
	
}
