import java.util.*;

class Nation {
	String country;
	String capital;
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	public String getCountry() {return country;}
	public String getCapital() {return capital;}
}

public class Practice_7_11 {
	public static void main(String[] args) {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		Scanner sc = new Scanner(System.in);
		Vector<Nation> vn = new Vector<Nation>();
		while (true) {
			System.out.print("입력:1 퀴즈:2 종료:3 >> ");
			int a = sc.nextInt();
			if (a==1) {
				System.out.println("현재 " + vn.size() + "개 나라와 수도가 입력되어 있습니다.");
				while (true) {
					System.out.print("나라와 수도 입력 " + (vn.size()+1) + " >> ");
					String s1 = sc.next();
					if (s1.equals("그만")) break;
					String s2 = sc.next();
					vn.add(new Nation(s1, s2));
				}
			}
			if (a==2) {
				while (true) {
					int b = (int)(Math.random() * vn.size());
					System.out.print(vn.get(b).getCountry() + "의 수도는?");
					String s3 = sc.next();
					if (s3.equals("그만")) break;
					else if (s3.equals(vn.get(b).getCapital()))
						System.out.println("정답!!");
					else
						System.out.println("아닙니다!!");
				}
			}
			if (a==3) {
				break;
			}
		}
		sc.close();
	}
}
