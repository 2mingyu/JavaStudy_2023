import java.io.*;
import java.util.Scanner;

public class Practice_8_6 {
	public static void main(String[] args) {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
			String fileName1 = sc.nextLine();
			System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
			String fileName2 = sc.nextLine();
			FileReader fr1 = new FileReader(fileName1);
			FileReader fr2 = new FileReader(fileName2);
			FileWriter fw3 = new FileWriter("appended.txt");
			int c1 = 0;
			while(true) {
				c1 = fr1.read();
				if (c1 == -1)
					break;
				fw3.write(c1);
			}
			c1 = 0;
			while(c1 != -1) {
				c1 = fr2.read();
				if (c1 == -1)
					break;
				fw3.write(c1);
			}
			fw3.close();
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�.");
		}
		catch (IOException e) {
			System.out.println(e);
			System.out.println("����� ����");
		}
	}
}
