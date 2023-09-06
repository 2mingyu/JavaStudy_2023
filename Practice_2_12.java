import java.util.Scanner;

public class Practice_2_12 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("����>>");
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
				System.out.println("0���� ���� �� �����ϴ�.");
				scanner.close();
				return;
			}
			else
				r = n1 / n2;
		}
		else {
			System.out.println("������ ����");
			scanner.close();
			return;
		}
		System.out.println(n1 + a + n2 + "�� ��� ����� " + r);
		
		switch(a) {
		case "+":
			r = n1 + n2; break;
		case "-":
			r = n1 - n2; break;
		case "*":
			r = n1 * n2; break;
		case "/":
			if (n2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				scanner.close();
				return;
			}
			else
				r = n1 / n2; break;
		default:
			System.out.println("������ ����");
			scanner.close();
			return;
		}
		System.out.println(n1 + a + n2 + "�� ��� ����� " + r);
		scanner.close();
	}
	
}
