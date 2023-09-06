import java.util.Scanner;

public class Practice_3_4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		char c = s.charAt(0);
		for (int i = c; i >= 'a'; i--) {
			for (int j = 'a'; j <= i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		scanner.close();
	}
	
}
