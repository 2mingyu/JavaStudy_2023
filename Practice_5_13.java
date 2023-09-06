import java.util.Scanner;

interface Shape513 {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
class Circle513 implements Shape513 {
	private int radius;
	public Circle513(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	public double getArea() {
		return PI*radius*radius;
	}
}
class Oval implements Shape513 {
	private int a, b;
	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void draw() {
		System.out.println(a + "x" + b + "에 내접하는 타원입니다.");
	}
	public double getArea() {
		return PI * a * b;
	}
}
class Rect513 implements Shape513 {
	private int a, b;
	public Rect513(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void draw() {
		System.out.println(a+"x"+b+"크기의 사각형.");
	}
	public double getArea() {
		return a*b;
	}
}
public class Practice_5_13 {
	
	public static void main(String[] args) {
		Shape513[] list = new Shape513[3];
		list[0] = new Circle513(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect513(10, 40);
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 "+list[i].getArea());
	}
	
}
