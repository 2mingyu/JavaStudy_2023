class Point3D extends Point {
	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void moveUp() {this.z++;}
	public void moveDown() {this.z--;}
	public void move(int x, int y, int z) {
		this.move(x, y);
		this.z = z;
	}
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + "," + z + ")의 점"; 
	}
}
public class Practice_5_7 {
	
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		p.moveDown();
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}
	
}
