import java.util.Scanner;
public class Practice_3_16 {
	public static void main(String[] args) {
		String str[] = {"����", "����", "��"};
		String u;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {
			System.out.print("���� ���� ��!>>");
			u = scanner.next();
			n = (int)(Math.random()*3); // 0 ���� 1 ���� 2 ��
			System.out.print("����� = " + u + " , ��ǻ�� = " + str[n] + " , ");
			if (u.equals("����")) {
				if (str[n].equals("����"))
					System.out.println("�����ϴ�.");
				else if (str[n].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("����ڰ� �̰���ϴ�.");
			}
			else if (u.equals("����")) {
				if (str[n].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (str[n].equals("����"))
					System.out.println("�����ϴ�.");
				else
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if (u.equals("��")) {
				if (str[n].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if (str[n].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else
					System.out.println("�����ϴ�.");
			}
			else if (u.equals("�׸�"))
				break;
			else
				System.out.println("�Է� ����");
		}
		scanner.close();
	}
	
}
