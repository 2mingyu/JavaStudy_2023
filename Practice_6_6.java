import java.util.Calendar;
import java.util.Scanner;
public class Practice_6_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String names[] = {"Ȳ����" , "���繮"};
		int time1, time2;
		int times[] = new int[2];
		String enter;
		Calendar now;
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		for (int i=0;i<2;i++) {
			System.out.print(names[i] + " ���� <Enter>Ű >>");
			enter = sc.nextLine();
			now = Calendar.getInstance();
			time1 = now.get(Calendar.SECOND);
			System.out.println("\t���� �� �ð� = " + time1);
			System.out.print(" 10�� ���� �� <Enter>Ű >>");
			enter = sc.nextLine();
			now = Calendar.getInstance();
			time2 = now.get(Calendar.SECOND);
			System.out.println("\t���� �� �ð� = " + time2);
			if (time1 > time2)
				times[i] = 60 - (time2 - time1);
			else
				times[i] = time2 - time1;
		}
		for (int i=0;i<2;i++)
			System.out.println(names[i] + "�� ���" + times[i]);
		if (Math.abs(10-times[0]) < Math.abs(10-times[1])) {
			System.out.println(names[0] + " ��");
		}
		else {
			System.out.println(names[1] + " ��");
		}
	}
}
