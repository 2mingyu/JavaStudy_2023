import java.util.Scanner;

public class Practice_2_10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		float c1x = scanner.nextFloat();
		float c1y = scanner.nextFloat();
		float r1 = scanner.nextFloat();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		float c2x = scanner.nextFloat();
		float c2y = scanner.nextFloat();
		float r2 = scanner.nextFloat();
		
		if (Math.sqrt(Math.pow(c2x-c1x, 2) + Math.pow(c2y-c1y, 2)) < r1 + r2)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("������ �ʴ´�.");
		
		
		scanner.close();
	}
	
}
