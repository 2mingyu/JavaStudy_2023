import java.util.Scanner;
import java.util.Vector;

public class Practice_7_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vi = new Vector<Integer>();
		System.out.print("����(-1�� �Է� �� �� ����)>>");
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
		System.out.println("���� ū ���� " + max);
		sc.close();
	}
}
