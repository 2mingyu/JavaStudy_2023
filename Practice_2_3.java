import java.util.Scanner;

public class Practice_2_3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�ݾ��� �Է��Ͻÿ�");
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
		System.out.println("�������� " + a + "��");
		System.out.println("������ " + b + "��");
		System.out.println("õ���� " + c + "��");
		System.out.println("��� " + d + "��");
		System.out.println("���ʿ� " + e + "��");
		System.out.println("�ʿ�" + f + "��");
		System.out.println("�Ͽ� " + g + "��");
		
		scanner.close();
	}
	
}
