import java.util.Scanner;

public class Practice_3_6 {
	
	public static void main(String[] args) {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int n = scanner.nextInt();
		for (int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + "�� ¥�� : " + n / unit[i] + "��");
			n %= unit[i];
		}
		
		scanner.close();
	}
	
}
