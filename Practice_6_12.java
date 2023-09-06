import java.util.Scanner;
public class Practice_6_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		int n = sc.nextInt();
		String s;
		Boolean b;
		Person[] p = new Person[n];
		for (int i=0;i<n;i++) {
			System.out.print(i+1 + "번째 선수 이름>>");
			s = sc.next();
			p[i] = new Person(s);
		}
		while (true) {
			for (int i=0;i<n;i++) {
				System.out.print("["+p[i].getName()+"]:<Enter>");
				s = sc.nextLine();
				b = p[i].makeNumber();
				if (b) {
					System.out.println(p[i].getName() + "님이 이겼습니다!");
					sc.close();
					return;
				}
				else
					System.out.println("아쉽군요!");	
			}
		}
	}
}
