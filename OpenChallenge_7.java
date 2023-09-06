import java.util.*;

class Word {
	String kor, eng;
	public Word(String eng, String kor) { this.kor = kor; this.eng = eng; }
	public String getKor() { return kor; }
	public String getEng() { return eng; }
}

public class OpenChallenge_7 {
	public static void main(String[] args) {
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다.");
		Scanner sc = new Scanner(System.in);
		Vector<Word> vw = new Vector<Word>();
		while (true) {
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3 >> ");
			int a = sc.nextInt();
			if (a==1) {
				while (true) {
					System.out.println("현재 " + vw.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
					int b = (int)(Math.random() * vw.size());
					System.out.print(vw.get(b).getEng() + "?");
					int answer = (int)(Math.random() * 4);
					for (int i=0;i<4;i++) {
						System.out.print(" (" + i + ")");
						if (answer==i) System.out.print(vw.get(b).getKor());
						else System.out.print(vw.get((int)(Math.random() * vw.size())).getKor());
					}
					System.out.print(" >> ");
					int c = sc.nextInt();
					if (c == -1) break;
					else if (c == answer)
						System.out.println("Excellent !!");
					else
						System.out.println("No. !!");
				}
			}
			else if (a==2) {
				System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
				while (true) {
					System.out.print("영어 한글 입력 " + (vw.size()+1) + " >> ");
					String s1 = sc.next();
					if (s1.equals("그만")) break;
					String s2 = sc.next();
					vw.add(new Word(s1, s2));
				}
			}
			else if (a==3) {
				System.out.println("\"명품영어\"를 종료합니다.");
				break;
			}
		}
	}
}
