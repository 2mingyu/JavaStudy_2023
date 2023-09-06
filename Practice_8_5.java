import java.io.*;
import java.util.Scanner;

public class Practice_8_5 {
	public static void main(String[] args) {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
			String fileName1 = sc.nextLine();
			System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
			String fileName2 = sc.nextLine();
			File f1 = new File(fileName1);
			File f2 = new File(fileName2);
			System.out.println(fileName1 + "�� " + fileName2 + "�� ���մϴ�.");
			FileReader fr1 = new FileReader(fileName1);
			FileReader fr2 = new FileReader(fileName2);
			int c1 = 0;
			int c2 = 0;
			while(c1 != -1) {
				c1 = fr1.read();
				c2 = fr2.read();
				if (c1 != c2) {
					break;
				}
			}
			if (c1 == -1 && c2 == -1)	System.out.println("������ �����ϴ�");
			else System.out.println("������ �ٸ��ϴ�.");
		}
		catch (IOException e) {
			System.out.println(e);
			System.out.println("����� ����");
		}
	}
}
