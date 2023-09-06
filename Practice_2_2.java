import java.util.Scanner;

public class Practice_2_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("2자리수 정수 입력(10~99)>>");
		int n = scanner.nextInt();
		int ten = n / 10;
		int one = n % 10;
		System.out.println("10의 자리 " + ten + ", 1의 자리" + one);
		if (ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No");
		}
		scanner.close();
	}
	
}
