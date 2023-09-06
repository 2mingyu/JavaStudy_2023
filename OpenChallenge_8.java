import java.util.*;
import java.io.*;


public class OpenChallenge_8 {
	public static void main(String[] args) {
		try {
			Vector<String> wordVector = new Vector<String>();
			Scanner scanner = new Scanner(new FileReader("words.txt"));
			while(scanner.hasNext()) {
				String word = scanner.nextLine();
				wordVector.add(word);
			}
			scanner.close();
			System.out.println("지금부터 행맨 게임을 시작합니다.");
			while (true) {
				int n = (int)(Math.random() * wordVector.size());
				String answer = wordVector.get(n);
				int n1 = (int)(Math.random() * answer.length());
				int n2 = (int)(Math.random() * answer.length());
				int n3 = 0;	// 기회
				scanner = new Scanner(System.in);
				while (true) {
					for (int i=0; i<answer.length(); i++) {
						if (i == n1 || i == n2) 
							System.out.print("-");
						else 
							System.out.print(answer.charAt(i));
					}
					System.out.print("\n>>");
					String user = scanner.next();
					if (user.charAt(0) == answer.charAt(n1))
						n1 = -1;
					else if (user.charAt(0) == answer.charAt(n2))
						n2 = -1;
					if (n1 == -1 && n2 == -1)
						break;
					n3++;
					if (n3 == 5) {
						System.out.println("5번 실패 하였습니다.");
						break;
					}
				}
				System.out.println(answer);
				System.out.print("Next(y/n)?");
				String yn = scanner.next();
				if (yn.equals("n")) break;
			}
			scanner.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
