import java.util.Calendar;
import java.util.Scanner;
public class Practice_6_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String names[] = {"황기태" , "이재문"};
		int time1, time2;
		int times[] = new int[2];
		String enter;
		Calendar now;
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		for (int i=0;i<2;i++) {
			System.out.print(names[i] + " 시작 <Enter>키 >>");
			enter = sc.nextLine();
			now = Calendar.getInstance();
			time1 = now.get(Calendar.SECOND);
			System.out.println("\t현재 초 시간 = " + time1);
			System.out.print(" 10초 예상 후 <Enter>키 >>");
			enter = sc.nextLine();
			now = Calendar.getInstance();
			time2 = now.get(Calendar.SECOND);
			System.out.println("\t현재 초 시간 = " + time2);
			if (time1 > time2)
				times[i] = 60 - (time2 - time1);
			else
				times[i] = time2 - time1;
		}
		for (int i=0;i<2;i++)
			System.out.println(names[i] + "의 결과" + times[i]);
		if (Math.abs(10-times[0]) < Math.abs(10-times[1])) {
			System.out.println(names[0] + " 승");
		}
		else {
			System.out.println(names[1] + " 승");
		}
	}
}
