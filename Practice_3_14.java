import java.util.Scanner;

public class Practice_3_14 {
	
	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score [] = {95, 88, 76, 62, 55};
		Scanner scanner = new Scanner(System.in);
		String s = "";
		int i = 0;
		while (true) {
			System.out.print("���� �̸�>>");
			s = scanner.next();
			if (s.equals("�׸�"))
				break;
			for (i=0; i<course.length; i++) {
				if (s.equals(course[i])) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					break;
				}
			}
			if (i == course.length)
				System.out.println("���� �����Դϴ�.");
		}
		
		
		scanner.close();
	}
	
}
