import java.util.Scanner;

public class Practice_2_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = scanner.nextInt();
		float dollar = won / 1100;
		System.out.println(won + "���� $" + dollar + "�Դϴ�.");
		scanner.close();
	}
	
}
