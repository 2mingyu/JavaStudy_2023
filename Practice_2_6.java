import java.util.Scanner;

public class Practice_2_6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1~99 사이의 정수를 입력하시고>>");
		int n = scanner.nextInt();
		int jj = 0;
		if ((n / 10 != 0) && (n / 10 % 3 == 0))
			jj += 1;
		if (n % 10 % 3 == 0)
			jj += 1;
		
		if (jj == 1) System.out.println("박수짝");
		else if (jj == 2) System.out.println("박수짝짝");
		
		scanner.close();
	}
	
}
