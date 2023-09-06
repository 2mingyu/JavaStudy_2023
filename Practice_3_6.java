import java.util.Scanner;

public class Practice_3_6 {
	
	public static void main(String[] args) {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int n = scanner.nextInt();
		for (int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + "원 짜리 : " + n / unit[i] + "개");
			n %= unit[i];
		}
		
		scanner.close();
	}
	
}
