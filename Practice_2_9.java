import java.util.Scanner;

public class Practice_2_9 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("원의 중심과 반지름 입력>>");
		float cx = scanner.nextFloat();
		float cy = scanner.nextFloat();
		float r = scanner.nextFloat();
		System.out.print("점 입력>>");
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		
		if (Math.sqrt(Math.pow(x-cx, 2) + Math.pow(y-cy, 2)) < r)
			System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
		else
			System.out.println("원 밖");
		
		
		scanner.close();
	}
	
}
