import java.util.Scanner;
public class Practice_6_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"가위", "바위", "보"};
		int a, b;
		while (true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			a = sc.nextInt();
			if (a==4) break;
			else {
				b = (int)(Math.random()*3+1);
				System.out.println("철수(" + s[a-1] + ") : 컴퓨터(" + s[b-1] + ")");
				if (b-a==1 || b-a==-2)
					System.out.println("컴퓨터가 이겼습니다.");
				else if(b-a==-1 || b-a==2)
					System.out.println("철수가 이겼습니다.");
				else	// b-a==0
					System.out.println("비겼습니다.");
			}
		}
		sc.close();
	}
}
