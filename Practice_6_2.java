class Circle62{
	private int x, y, radius;
	public Circle62(int x, int y, int radius) {this.x = x; this.y = y; this.radius = radius;}
	public String toString() {
		return "Circle("+x+", "+y+")반지름"+radius;
	}
	public boolean equals(Object obj) {
		Circle62 p = (Circle62)obj;
		if(x==p.x && y==p.y)
			return true;
		else
			return false;
	}
}
public class Practice_6_2 {
	public static void main(String[] args) {
		Circle62 a = new Circle62(2,3,5);
		Circle62 b = new Circle62(2,3,30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
