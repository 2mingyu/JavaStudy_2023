import java.util.Scanner;

class Add {
	int a;
	int b;
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() { return a + b; }
}
class Sub {
	int a;
	int b;
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() { return a - b; }
}
class Mul {
	int a;
	int b;
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() { return a * b; }
}
class Div {
	int a;
	int b;
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() { return a / b; }
}
public class Practice_4_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시요>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String c = scanner.next();
		if (c.equals("+")) {
			Add d = new Add();
			d.SetValue(a, b);
			System.out.println(d.calculate());
		}
		else if (c.equals("-")) {
			Sub d = new Sub();
			d.SetValue(a, b);
			System.out.println(d.calculate());
		}
		else if (c.equals("*")) {
			Mul d = new Mul();
			d.SetValue(a, b);
			System.out.println(d.calculate());
		}
		else if (c.equals("/")) {
			Div d = new Div();
			d.SetValue(a, b);
			System.out.println(d.calculate());
		}
		
		scanner.close();
	}
}
