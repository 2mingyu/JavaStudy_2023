import java.util.Scanner;
public class Practice_6_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�׺� ���ӿ� ������ ���� ����>>");
		int n = sc.nextInt();
		String s;
		Boolean b;
		Person[] p = new Person[n];
		for (int i=0;i<n;i++) {
			System.out.print(i+1 + "��° ���� �̸�>>");
			s = sc.next();
			p[i] = new Person(s);
		}
		while (true) {
			for (int i=0;i<n;i++) {
				System.out.print("["+p[i].getName()+"]:<Enter>");
				s = sc.nextLine();
				b = p[i].makeNumber();
				if (b) {
					System.out.println(p[i].getName() + "���� �̰���ϴ�!");
					sc.close();
					return;
				}
				else
					System.out.println("�ƽ�����!");	
			}
		}
	}
}
