import java.util.Scanner;

class WordGameApp {
	public static void run(Player[] p, Scanner scanner) {
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�");
		String word = "�ƹ���";
		int i = 0;
		while (true) {
			String next = p[i].getWordFromUser(scanner);
			if (p[i].checkSuccess(word, next)) {
				word = next;
				i++;
				if (i == p.length)
					i = 0;
			}
			else {
				System.out.println(p[i].name + "�� �����ϴ�.");
				return;
			}
		}
	}
}
class Player {
	String name;
	public Player(String name) {
		this.name = name;
	}
	public String getWordFromUser(Scanner scanner) {
		System.out.print(name + ">>");
		String next = scanner.next();
		return next;
	}
	public boolean checkSuccess(String word, String next) {
		int lastIndex = word.length() - 1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = next.charAt(0);
		if (lastChar == firstChar)
			return true;
		else
			return false;
	}
}
public class OpenChallenge_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����ձ� ������ �����մϴ�...");
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int n = scanner.nextInt();
		Player[] p = new Player[n];
		for(int i=0; i<n; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = scanner.next();
			p[i] = new Player(name);
		}	
		WordGameApp.run(p, scanner);
		scanner.close();
	}

}
