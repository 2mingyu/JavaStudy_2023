import java.util.*;

abstract class Shape710 {

	protected abstract void print();
	
}
class Line710 extends Shape710 {
	public void print() { System.out.println("Line"); }
}
class Rect710 extends Shape710 {
	public void print() { System.out.println("Rect"); }
}
class Circle710 extends Shape710 {
	public void print() { System.out.println("Circle"); }
}
public class Practice_7_10 {
	public static void main(String[] args) {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		Scanner sc = new Scanner(System.in);
		Vector<Shape710> vs = new Vector<Shape710>();
		while (true) {
			System.out.print("삽입(1) 삭제(2) 모두 보기(3) 종료(4) >> ");
			int a = sc.nextInt();
			if (a==1) {
				System.out.print("Line(1) Rect(2) Circle(3) >> ");
				int b = sc.nextInt();
				if (b==1) vs.add(new Line710());
				else if (b==2) vs.add(new Rect710());
				else if (b==3) vs.add(new Circle710());
			}
			else if (a==2) {
				System.out.print("삭제할 도형의 위치 >> ");
				int b = sc.nextInt();
				if (b >= vs.size()) System.out.println("삭제할 수 없습니다.");
				else vs.remove(b);
			}
			else if (a==3) {
				for (int i=0;i<vs.size();i++) vs.get(i).print();
			}
			else if (a==4)
				break;
		}
	}
}
