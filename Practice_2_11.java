import java.util.Scanner;

public class Practice_2_11 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("달을 입력하세요(1~12)>>");
		int m = scanner.nextInt();
		
		if ((3 <= m) && (m <= 5))
			System.out.println("봄");
		else if ((6 <= m) && (m <= 8))
			System.out.println("여름");
		else if ((9 <= m) && (m <= 11))
			System.out.println("가을");
		else if ((m == 12) || (m == 1) || (m == 2))
			System.out.println("겨울");
		else
			System.out.println("잘못입력");
		
		switch(m) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄"); break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름"); break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을"); break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울"); break;
		default:
			System.out.println("잘못입력");
		}
		
		
		scanner.close();
	}
	
}
