import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		for(int i=0;i<kor.length;i++) {
			if (word.equals(kor[i])) {
				return eng[i];
			}
		}
		return "���� ������ �����ϴ�.";
	}
}
public class Practice_4_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while (true) {
			System.out.print("�ѱ� �ܾ�?");
			String a = scanner.next();
			if (a.equals("�׸�")) {
				break;
			}
			System.out.println(a + "��(��)" + Dictionary.kor2Eng(a));
		}
		
		
		scanner.close();
	}
}
