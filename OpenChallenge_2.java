import java.util.Scanner;

public class OpenChallenge_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String p1 = scanner.next();
		System.out.print("���� >> ");
		String p2 = scanner.next();
		String win = "";
		if(p1.equals("����")) {
			if(p2.equals("����"))
				win = "���";
			else if(p2.equals("����"))
				win = "����";
			else if(p2.equals("��"))
				win = "ö��";
		}
		else if(p1.equals("����")) {
			if(p2.equals("����"))
				win = "ö��";
			else if(p2.equals("����"))
				win = "���";
			else if(p2.equals("��"))
				win = "����";
		}
		else if(p1.equals("��")) {
			if(p2.equals("����"))
				win = "����";
			else if(p2.equals("����"))
				win = "ö��";
			else if(p2.equals("��"))
				win = "���";
		}
		
		switch (win) {
		case "���":
			System.out.println("�����ϴ�.");
		case "����":
			System.out.println("���� �̰���ϴ�.");
		case "ö��":
			System.out.println("ö���� �̰���ϴ�.");
		}
		scanner.close();
	}

}
