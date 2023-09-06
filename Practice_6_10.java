import java.util.Scanner;
class Person {
	int[] n;
	String name;
	public Person(String name) {
		n = new int[3];
		this.name = name;
	}
	public boolean makeNumber() {
		System.out.print("\t");
		for(int i=0;i<3;i++) {
			n[i] = (int)(Math.random()*3+1);
			System.out.print(n[i] + " ");
		}
		System.out.print("\t");
		if (n[0]==n[1] && n[1]==n[2])
			return true;
		else
			return false;
	}
	public String getName() {
		return name;
	}
}
public class Practice_6_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		Boolean b;
		Person[] p = new Person[2];
		for (int i=0;i<2;i++) {
			System.out.print(i+1 + "번째 선수 이름>>");
			s = sc.next();
			p[i] = new Person(s);
		}
		while (true) {
			for (int i=0;i<2;i++) {
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
