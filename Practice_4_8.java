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
		System.out.print("�ο���>>");
		int a = scanner.nextInt();
		Phone p[] = new Phone[a];
		for(i=0; i<a; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String b = scanner.next();
			String c = scanner.next();
			p[i] = new Phone(b, c);
		}
		System.out.println("����Ǿ����ϴ�..");
		while (true) {
			System.out.print("�˻��� �̸�>>");
			String d = scanner.next();
			if (d.equals("�׸�")) {
				break;
			}
			for(i=0; i<a; i++) {
				if (d.equals(p[i].getName())) {
					System.out.println(p[i].getName() + "�� ��ȣ�� " + p[i].getNumber() + " �Դϴ�.");
					break;
				}
			}
			if (i == a) {
				System.out.println(d + "�� �����ϴ�.");
			}
		}
		scanner.close();
	}
	
}
