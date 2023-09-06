import java.util.Scanner;

public class Practice_2_3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액을 입력하시오");
		int n = scanner.nextInt();
		int a, b, c, d, e, f, g;
		a = n / 50000;
		n -= 50000 * a;
		b = n / 10000;
		n -= 10000 * b;
		c = n / 1000;
		n -= 1000 * c;
		d = n / 100;
		n -= 100 * d;
		e = n / 50;
		n -= 50 * e;
		f = n / 10;
		n -= 10 * f;
		g = n;
		System.out.println("오만원권 " + a + "매");
		System.out.println("만원권 " + b + "매");
		System.out.println("천원권 " + c + "매");
		System.out.println("백원 " + d + "매");
		System.out.println("오십원 " + e + "매");
		System.out.println("십원" + f + "매");
		System.out.println("일원 " + g + "매");
		
		scanner.close();
	}
	
}
