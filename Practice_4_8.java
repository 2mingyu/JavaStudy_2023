import java.util.Scanner;

class Phone {
	private String name;
	private String number;
	public Phone(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String getName() { return name; }
	public String getNumber() { return number; }
}
public class Practice_4_8 {
	public static void main(String[] args) {
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>>");
		int a = scanner.nextInt();
		Phone p[] = new Phone[a];
		for(i=0; i<a; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String b = scanner.next();
			String c = scanner.next();
			p[i] = new Phone(b, c);
		}
		System.out.println("저장되었습니다..");
		while (true) {
			System.out.print("검색할 이름>>");
			String d = scanner.next();
			if (d.equals("그만")) {
				break;
			}
			for(i=0; i<a; i++) {
				if (d.equals(p[i].getName())) {
					System.out.println(p[i].getName() + "의 번호는 " + p[i].getNumber() + " 입니다.");
					break;
				}
			}
			if (i == a) {
				System.out.println(d + "이 없습니다.");
			}
		}
		scanner.close();
	}
	
}
