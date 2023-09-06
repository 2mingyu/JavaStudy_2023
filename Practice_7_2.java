import java.util.Scanner;
import java.util.ArrayList;

public class Practice_7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		int sum = 0;
		for(int i=0;i<6;i++) {
			String s = sc.next();
			arr.add(s);
		}
		for(int i=0;i<6;i++) {
			String s = arr.get(i);
			if (s.equals("A"))
				sum+=4;
			else if (s.equals("B"))
				sum+=3;
			else if (s.equals("C"))
				sum+=2;
			else if (s.equals("D"))
				sum+=1;
		}
		System.out.println((double)sum/(double)arr.size());
		sc.close();
	}
}
