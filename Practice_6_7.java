import java.util.StringTokenizer;
import java.util.Scanner;
public class Practice_6_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = sc.nextLine();
			if (s.equals("그만")) {
				System.out.println("종료합니다....");
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println("어절 개수는 " + st.countTokens());
			String str[] = s.split(" ");
			System.out.println("어절 개수는 " + str.length);
		}
		sc.close();
	}
}
