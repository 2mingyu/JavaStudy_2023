import java.util.Scanner;

public class Practice_3_3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		int n = scanner.nextInt();
		for (int i = n; i > 0; i--) {
			System.out.println("*".repeat(i));
		}
		scanner.close();
	}
	
}
