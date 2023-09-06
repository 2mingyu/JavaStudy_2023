import java.util.Scanner;

public class Practice_2_12 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("연산>>");
		float n1 = scanner.nextFloat();
		String a = scanner.next();
		float n2 = scanner.nextFloat();
		float r;
		
		if(a.equals("+"))
			r = n1 + n2;
		else if(a.equals("-"))
			r = n1 - n2;
		else if(a.equals("*"))
			r = n1 * n2;
		else if(a.equals("/")) {
			if(n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return;
			}
			else
				r = n1 / n2;
		}
		else {
			System.out.println("연산자 오류");
			scanner.close();
			return;
		}
		System.out.println(n1 + a + n2 + "의 계산 결과는 " + r);
		
		switch(a) {
		case "+":
			r = n1 + n2; break;
		case "-":
			r = n1 - n2; break;
		case "*":
			r = n1 * n2; break;
		case "/":
			if (n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return;
			}
			else
				r = n1 / n2; break;
		default:
			System.out.println("연산자 오류");
			scanner.close();
			return;
		}
		System.out.println(n1 + a + n2 + "의 계산 결과는 " + r);
		scanner.close();
	}
	
}
