import java.util.Scanner;
import java.util.Vector;

public class Practice_7_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vi = new Vector<Integer>();
		System.out.print("정수(-1이 입력 될 때 까지)>>");
		int max = 0;
		while(true) {
			int n = sc.nextInt();
			if(n==-1) break;
			vi.add(n);
		}
		for (int i=0;i<vi.size();i++) {
			if (max<vi.get(i))
				max = vi.get(i);
		}
		System.out.println("가장 큰 수는 " + max);
		sc.close();
	}
}
