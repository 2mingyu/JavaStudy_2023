import java.util.Scanner;
public class Practice_6_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"����", "����", "��"};
		int a, b;
		while (true) {
			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
			a = sc.nextInt();
			if (a==4) break;
			else {
				b = (int)(Math.random()*3+1);
				System.out.println("ö��(" + s[a-1] + ") : ��ǻ��(" + s[b-1] + ")");
				if (b-a==1 || b-a==-2)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if(b-a==-1 || b-a==2)
					System.out.println("ö���� �̰���ϴ�.");
				else	// b-a==0
					System.out.println("�����ϴ�.");
			}
		}
		sc.close();
	}
}
