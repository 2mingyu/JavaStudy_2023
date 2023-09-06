import java.util.Scanner;

public class Practice_2_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt();
		float dollar = won / 1100;
		System.out.println(won + "원은 $" + dollar + "입니다.");
		scanner.close();
	}
	
}
