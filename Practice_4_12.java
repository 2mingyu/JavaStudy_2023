import java.util.Scanner;

class Seat {
	String[] name = new String[10];
	public Seat() {
		for (int i=0; i<10; i++) {
			name[i] = "---";
		}
	}
	public void reserve (String name, int number) {
		this.name[number-1] = name;
	}
	public void show() {
		for (int i=0; i<10; i++) {
			System.out.print(" " + name[i]);
		}
		System.out.println();
	}
	public void delete(String n) {
		for (int i=0; i<10; i++) {
			if (this.name[i].equals(n)) {
				this.name[i] = "---";
				return;
			}
		}
	}
}

public class Practice_4_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		Seat s = new Seat();
		Seat a = new Seat();
		Seat b = new Seat();
		while (true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int sc1 = scanner.nextInt();
			if (sc1 == 1) {
				System.out.print("�¼����� S(1), A(2), B(3)>>");
				int sc2 = scanner.nextInt();
				if (sc2 == 1) {
					System.out.print("S>>");
					s.show();
					System.out.print("�̸�>>");
					String sc3 = scanner.next();
					System.out.print("��ȣ>>");
					int sc4 = scanner.nextInt();
					s.reserve(sc3, sc4);
				}
				else if (sc2 == 2) {
					System.out.print("A>>");
					a.show();
					System.out.print("�̸�>>");
					String sc3 = scanner.next();
					System.out.print("��ȣ>>");
					int sc4 = scanner.nextInt();
					a.reserve(sc3, sc4);
				}
				else if (sc2 == 3) {
					System.out.print("B>>");
					b.show();
					System.out.print("�̸�>>");
					String sc3 = scanner.next();
					System.out.print("��ȣ>>");
					int sc4 = scanner.nextInt();
					b.reserve(sc3, sc4);
				}
			}
			else if (sc1 == 2) {
				System.out.print("S>>");
				s.show();
				System.out.print("A>>");
				a.show();
				System.out.print("B>>");
				b.show();
				System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
			}
			else if (sc1 == 3) {
				System.out.print("�¼� S:1, A:2, B:3>>");
				int sc2 = scanner.nextInt();
				if (sc2 == 1) {
					System.out.print("S>>");
					s.show();
					System.out.print("�̸�>>");
					String sc3 = scanner.next();
					s.delete(sc3);
				}
				else if (sc2 == 2) {
					System.out.print("A>>");
					a.show();
					System.out.print("�̸�>>");
					String sc3 = scanner.next();
					a.delete(sc3);
				}
				else if (sc2 == 3) {
					System.out.print("B>>");
					b.show();
					System.out.print("�̸�>>");
					String sc3 = scanner.next();
					b.delete(sc3);
				}
			}
			else if (sc1 == 4) {
				break;
			}
		}
		
		scanner.close();
	}
}
