import java.util.Scanner;

public class Practice_2_4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int m;
		if (n1 > n2) {
			if (n2 > n3) m = n2;
			else if (n1 > n3) m = n3;
			else m = n1;
		}
		else {
			if (n1 > n3) m = n1;
			else if (n2 > n3) m = n3;
			else m = n2;
		}
		
		System.out.println("중간 값은 " + m);
		
		scanner.close();
	}
	
}
