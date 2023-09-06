class Point {
	private int x,y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) {this.x = x; this.y = y; }
}
class ColorPoint extends Point {
	private String color;
	public ColorPoint() {
		super(0, 0);
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		this.move(x, y);
	}
	public void setColor(String c) {
		this.color = c;
	}
	public String toString() {
		return color + "색의 (" + this.getX() + "," + this.getY() + ")의 점"; 
	}
}
public class Practice_5_5 {
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
	
}
