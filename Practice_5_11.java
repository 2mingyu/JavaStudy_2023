import java.util.Scanner;

abstract class Calc {
	protected int a;
	protected int b;
	void setValue(int a, int b) {this.a=a; this.b=b;}
	abstract int calculate();
}
class Add511 extends Calc{
	public Add511() {}
	int calculate() {return a+b;}
}
class Sub511 extends Calc{
	public Sub511() {}
	int calculate() {return a-b;}
}
class Mul511 extends Calc{
	public Mul511() {}
	int calculate() {return a*b;}
}
class Div511 extends Calc{
	public Div511() {}
	int calculate() {return a/b;}
}
public class Practice_5_11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		
		if(c == '+') {
			Add511 add = new Add511();
			add.setValue(a, b);
			System.out.println(add.calculate());
		}
		else if(c == '-' ) {
			Sub511 sub = new Sub511();
			sub.setValue(a,  b);
			System.out.println(sub.calculate());
		}
		else if(c == '*' ) {
			Mul511 mul = new Mul511();
			mul.setValue(a,  b);
			System.out.println(mul.calculate());
		}
		else if(c == '/' ) {
			Div511 div = new Div511();
			div.setValue(a,  b);
			System.out.println(div.calculate());
		}
		sc.close();
	}
	
}
