import java.util.Scanner;
public class Practice_3_16 {
	public static void main(String[] args) {
		String str[] = {"가위", "바위", "보"};
		String u;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			System.out.print("가위 바위 보!>>");
			u = scanner.next();
			n = (int)(Math.random()*3); // 0 가위 1 바위 2 보
			System.out.print("사용자 = " + u + " , 컴퓨터 = " + str[n] + " , ");
			if (u.equals("가위")) {
				if (str[n].equals("가위"))
					System.out.println("비겼습니다.");
				else if (str[n].equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자가 이겼습니다.");
			}
			else if (u.equals("바위")) {
				if (str[n].equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else if (str[n].equals("바위"))
					System.out.println("비겼습니다.");
				else
					System.out.println("컴퓨터가 이겼습니다.");
			}
			else if (u.equals("보")) {
				if (str[n].equals("가위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if (str[n].equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else
					System.out.println("비겼습니다.");
			}
			else if (u.equals("그만"))
				break;
			else
				System.out.println("입력 오류");
		}
		scanner.close();
	}
	
}
