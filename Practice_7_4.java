import java.util.Scanner;
import java.util.Vector;

public class Practice_7_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vi = new Vector<Integer>();
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int g = sc.nextInt();
			if (g==0) break;
			vi.add(g);
			int sum=0;
			for(int i=0;i<vi.size();i++) {
				System.out.print(vi.get(i) + " ");
				sum += vi.get(i);
			}
			System.out.println("\n���� ��� " + sum / vi.size());
		}
		sc.close();
	}
}
