import java.util.Scanner;

public class Practice_2_9 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� �߽ɰ� ������ �Է�>>");
		float cx = scanner.nextFloat();
		float cy = scanner.nextFloat();
		float r = scanner.nextFloat();
		System.out.print("�� �Է�>>");
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		
		if (Math.sqrt(Math.pow(x-cx, 2) + Math.pow(y-cy, 2)) < r)
			System.out.println("�� (" + x + ", " + y + ")�� �� �ȿ� �ִ�.");
		else
			System.out.println("�� ��");
		
		
		scanner.close();
	}
	
}
