import java.util.Scanner;
import java.io.*;

public class Practice_8_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		try {
			fw = new FileWriter("\\temp\\phone.txt");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String line = sc.nextLine();
				if (line.equals("�׸�")) {
					break;
				}
				fw.write(line, 0, line.length());
				fw.write("\r\n", 0, 2);
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		System.out.println("\\temp\\phone.txt�� �����Ͽ����ϴ�.");
		sc.close();
	}
}
