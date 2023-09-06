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
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		scanner.close();
	}
	
}
