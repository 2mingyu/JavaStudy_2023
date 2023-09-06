import java.util.Scanner;

public class Practice_2_10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		float c1x = scanner.nextFloat();
		float c1y = scanner.nextFloat();
		float r1 = scanner.nextFloat();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		float c2x = scanner.nextFloat();
		float c2y = scanner.nextFloat();
		float r2 = scanner.nextFloat();
		
		if (Math.sqrt(Math.pow(c2x-c1x, 2) + Math.pow(c2y-c1y, 2)) < r1 + r2)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("겹지지 않는다.");
		
		
		scanner.close();
	}
	
}
