import java.util.Scanner;

public class Practice_2_6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1~99 ������ ������ �Է��Ͻð�>>");
		int n = scanner.nextInt();
		int jj = 0;
		if ((n / 10 != 0) && (n / 10 % 3 == 0))
			jj += 1;
		if (n % 10 % 3 == 0)
			jj += 1;
		
		if (jj == 1) System.out.println("�ڼ�¦");
		else if (jj == 2) System.out.println("�ڼ�¦¦");
		
		scanner.close();
	}
	
}
