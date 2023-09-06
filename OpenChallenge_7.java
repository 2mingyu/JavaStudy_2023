import java.util.*;

class Word {
	String kor, eng;
	public Word(String eng, String kor) { this.kor = kor; this.eng = eng; }
	public String getKor() { return kor; }
	public String getEng() { return eng; }
}

public class OpenChallenge_7 {
	public static void main(String[] args) {
		System.out.println("**** ���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ����\" �Դϴ�.");
		Scanner sc = new Scanner(System.in);
		Vector<Word> vw = new Vector<Word>();
		while (true) {
			System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����:3 >> ");
			int a = sc.nextInt();
			if (a==1) {
				while (true) {
					System.out.println("���� " + vw.size() + "���� �ܾ ��� �ֽ��ϴ�. -1�� �Է��ϸ� �׽�Ʈ�� �����մϴ�.");
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
				System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
				while (true) {
					System.out.print("���� �ѱ� �Է� " + (vw.size()+1) + " >> ");
					String s1 = sc.next();
					if (s1.equals("�׸�")) break;
					String s2 = sc.next();
					vw.add(new Word(s1, s2));
				}
			}
			else if (a==3) {
				System.out.println("\"��ǰ����\"�� �����մϴ�.");
				break;
			}
		}
	}
}
