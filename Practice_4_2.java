import java.util.Scanner;

class Grade {
	int a;
	int b;
	int c;
	public Grade(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public float average() {
		return (a + b + c) / 3;
	}
}
public class Practice_4_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scanner.close();
	}
	
}
