import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}
public class Practice_4_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Day d[] = new Day[30];
		for (int i=0;i<d.length;i++) {
			d[i] = new Day();
		}
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int a = scanner.nextInt();
			if (a == 1) {
				System.out.print("날짜(1~30)?)");
				int b = scanner.nextInt();
				System.out.print("할일(빈칸없이입력)?");
				String c = scanner.next();
				d[b-1].set(c);
			}
			else if (a == 2) {
				System.out.print("날짜(1~30)?)");
				int b = scanner.nextInt();
				d[b-1].show();
			}
			else if (a == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		scanner.close();
	}
	
}
