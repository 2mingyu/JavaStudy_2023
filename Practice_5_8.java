class PositivePoint extends Point {
	public PositivePoint() {
		super(0, 0);
	}
	public PositivePoint(int x, int y) {
		super(x, y);
		int tmpx, tmpy;
		if (x<0) tmpx=0;
		else tmpx=x;
		if (y<0) tmpy=0;
		else tmpy=y;
		this.move(tmpx, tmpy);
	}
	public void move(int x, int y) {
		int tmpx, tmpy;
		if (x<0) tmpx=getX();
		else tmpx=x;
		if (y<0) tmpy=getY();
		else tmpy=y;
		super.move(tmpx, tmpy);
	}
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")�� ��"; 
	}
}
public class Practice_5_8 {
	
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5, -5);
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}
	
}
