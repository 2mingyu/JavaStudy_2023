import java.util.Scanner;
import java.util.Random;

public class OpenChallenge_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String re = "y";
		Random r= new Random();
		int guess, k, min, max;
		while (re.equals("y")) {
			guess = -1;
			k = r.nextInt(100);
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			min = 0;
			max = 99;
			while (guess != k) {
				System.out.println(min + "~" + max);
				guess = scanner.nextInt();
				if (k > guess) {
					min = guess;
					System.out.println("�� ����");
				}
				else if (k < guess) {
					max = guess;
					System.out.println("�� ����");
				}
				else {
					System.out.println("�¾ҽ��ϴ�.");
				}
			}
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>> ");
			re = scanner.next();
		}
		
		scanner.close();
	}

}
