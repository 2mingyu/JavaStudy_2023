import java.util.Scanner;

public class Practice_2_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int n = scanner.nextInt();
		int ten = n / 10;
		int one = n % 10;
		System.out.println("10�� �ڸ� " + ten + ", 1�� �ڸ�" + one);
		if (ten == one) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("No");
		}
		scanner.close();
	}
	
}
