class MyPoint{
	private int x, y;
	public MyPoint(int x, int y) {this.x = x; this.y = y;}
	public String toString() {
		return "Point("+x+", "+y+")";
	}
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint)obj;
		if(x==p.x && y==p.y)
			return true;
		else
			return false;
	}
}
public class Practice_6_1 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");
	}
}
