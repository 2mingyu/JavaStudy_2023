import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Calendar;
public class hw10_2 {
	public static void main(String[] args) {
		System.out.print("문자열 입력 : ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		StringTokenizer st = new StringTokenizer(s, "/");
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(year,  month - 1, day);
		System.out.println(cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.DAY_OF_MONTH));
		scanner.close();
	}
}
