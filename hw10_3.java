import java.util.Scanner;
public class hw10_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = "";
		String s1 = "";
		String s2 = "";
		int n = 1;
		int m;
		while (true) {
			System.out.print("입력) ");
			s = scanner.next();
			n = scanner.nextInt();
			if (n==0) break;
			s1 = s;
			while (!s.equals(s2)) {
				s2 = "";
				for (int i = 0; i<s1.length(); i++) {
					m = i + n;
					if (m>=s1.length())
						m = m - s1.length();
					else if (m<0) {
						m = m + s1.length();
					}
					s2 += s1.charAt(m);
				}
				System.out.println(s2);
				s1 = s2;
			}
		}
		System.out.println("종료함");
		scanner.close();
	}
}
