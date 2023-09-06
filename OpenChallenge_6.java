import java.util.Scanner;

public class OpenChallenge_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		StringBuffer sb = new StringBuffer();
		int[] az = new int[26];
		for (int i=0;i<az.length;i++)
			az[i] = 0;
		int tmp;
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		while (!s.equals(";")) {
			s = sc.next();
			sb.append(s);
		}
		// A=65 Z=90 a=97 z=125
		for(int i=0;i<sb.length();i++) {
			tmp = (int)sb.charAt(i);
			if (tmp>=65 && tmp<=90)
				tmp -= 65;
			else if (tmp>=97 && tmp<=125)
				tmp -= 97;
			else
				continue;
			az[tmp] += 1;
		}
		System.out.print("\n히스토그램을 그립니다.");
		for (int i=0;i<az.length;i++) {
			System.out.print("\n" + (char)(i+65));
			for (int j=0;j<az[i];j++) {
				System.out.print("-");
			}
		}
		
		sc.close();
	}
}
