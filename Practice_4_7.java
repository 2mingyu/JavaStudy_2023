import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}
public class Practice_4_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Day d[] = new Day[30];
		for (int i=0;i<d.length;i++) {
			d[i] = new Day();
		}
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int a = scanner.nextInt();
			if (a == 1) {
				System.out.print("��¥(1~30)?)");
				int b = scanner.nextInt();
				System.out.print("����(��ĭ�����Է�)?");
				String c = scanner.next();
				d[b-1].set(c);
			}
			else if (a == 2) {
				System.out.print("��¥(1~30)?)");
				int b = scanner.nextInt();
				d[b-1].show();
			}
			else if (a == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		scanner.close();
	}
	
}
