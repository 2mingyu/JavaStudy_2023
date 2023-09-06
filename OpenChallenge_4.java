import java.util.Scanner;

class WordGameApp {
	public static void run(Player[] p, Scanner scanner) {
		System.out.println("시작하는 단어는 아버지입니다");
		String word = "아버지";
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
				System.out.println(p[i].name + "이 졌습니다.");
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
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int n = scanner.nextInt();
		Player[] p = new Player[n];
		for(int i=0; i<n; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scanner.next();
			p[i] = new Player(name);
		}	
		WordGameApp.run(p, scanner);
		scanner.close();
	}

}
