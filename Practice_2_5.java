import java.util.Scanner;

public class Practice_2_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int m = 0;
		
		if (n1 > n2) {
			if (n1 > n3) {
				if (n1 < n2 + n3) m = 1;
			}
			else {
				if (n3 < n1 + n2) m = 1;
			}
				
		}
		else {
			if (n2 > n3) {
				if (n2 < n1 + n3) m = 1;
			}
			else {
				if (n3 < n1 + n2) m = 1;
			}
		}
		if (m == 1) System.out.println("�ﰢ���� �˴ϴ�");
		else System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		
		scanner.close();
	}
	
}
