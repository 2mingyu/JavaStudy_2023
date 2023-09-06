import java.util.Scanner;

public class OpenChallenge_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String p1 = scanner.next();
		System.out.print("영희 >> ");
		String p2 = scanner.next();
		String win = "";
		if(p1.equals("가위")) {
			if(p2.equals("가위"))
				win = "비김";
			else if(p2.equals("바위"))
				win = "영희";
			else if(p2.equals("보"))
				win = "철수";
		}
		else if(p1.equals("바위")) {
			if(p2.equals("가위"))
				win = "철수";
			else if(p2.equals("바위"))
				win = "비김";
			else if(p2.equals("보"))
				win = "영희";
		}
		else if(p1.equals("보")) {
			if(p2.equals("가위"))
				win = "영희";
			else if(p2.equals("바위"))
				win = "철수";
			else if(p2.equals("보"))
				win = "비김";
		}
		
		switch (win) {
		case "비김":
			System.out.println("비겼습니다.");
		case "영희":
			System.out.println("영희가 이겼습니다.");
		case "철수":
			System.out.println("철수가 이겼습니다.");
		}
		scanner.close();
	}

}
