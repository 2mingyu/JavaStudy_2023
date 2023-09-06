import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
	public int getr() { return radius; }
}
public class Practice_4_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		Circle biggest = c[0];
		for(int i=1; i<c.length; i++) {
			if (c[i].getr() > biggest.getr()) {
				biggest = c[i];
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		biggest.show();
		scanner.close();
	}
	
}
