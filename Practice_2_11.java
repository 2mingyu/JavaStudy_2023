import java.util.Scanner;

public class Practice_2_11 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���(1~12)>>");
		int m = scanner.nextInt();
		
		if ((3 <= m) && (m <= 5))
			System.out.println("��");
		else if ((6 <= m) && (m <= 8))
			System.out.println("����");
		else if ((9 <= m) && (m <= 11))
			System.out.println("����");
		else if ((m == 12) || (m == 1) || (m == 2))
			System.out.println("�ܿ�");
		else
			System.out.println("�߸��Է�");
		
		switch(m) {
		case 3:
		case 4:
		case 5:
			System.out.println("��"); break;
		case 6:
		case 7:
		case 8:
			System.out.println("����"); break;
		case 9:
		case 10:
		case 11:
			System.out.println("����"); break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�"); break;
		default:
			System.out.println("�߸��Է�");
		}
		
		
		scanner.close();
	}
	
}
