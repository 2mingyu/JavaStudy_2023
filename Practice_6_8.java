import java.util.Scanner;
public class Practice_6_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String s = sc.nextLine();
		for(int i=0; i<s.length(); i++) {
			System.out.print(s.substring(i));
			System.out.println(s.substring(0, i));
		}
		sc.close();
	}
}
