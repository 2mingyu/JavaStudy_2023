import java.util.StringTokenizer;
import java.util.Scanner;
public class Practice_6_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = sc.nextLine();
			if (s.equals("�׸�")) {
				System.out.println("�����մϴ�....");
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println("���� ������ " + st.countTokens());
			String str[] = s.split(" ");
			System.out.println("���� ������ " + str.length);
		}
		sc.close();
	}
}
