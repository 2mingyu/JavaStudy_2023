import java.util.Scanner;

public class Practice_3_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		int [] n = new int[10];
		for (int i=0; i<n.length; i++) {
			n[i] = scanner.nextInt();
		}
		System.out.print("3�� ����� ");
		for (int i=0; i<n.length; i++) {
			if (n[i] % 3 == 0) {
				System.out.print(n[i] + " ");
			}
		}
		
		scanner.close();
	}
	
}
