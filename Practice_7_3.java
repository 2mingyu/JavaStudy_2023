import java.util.Scanner;
import java.util.HashMap;

public class Practice_7_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(�� : Korea 5000)");
		while(true) {
			System.out.print("���� �̸�, �α� >>");
			String temp1 = sc.next();
			if(temp1.equals("�׸�")) break;
			int temp2 = sc.nextInt();
			nations.put(temp1,  temp2);
		}
		while(true) {
			System.out.print("�α� �˻�>>");
			String temp = sc.next();
			if(temp.equals("�׸�")) break;
			if(nations.get(temp) == null) {
				System.out.println(temp + " ����� �����ϴ�.");
			}
			else {
				System.out.println(temp + "�� �α��� " + nations.get(temp));
			}
		}
		sc.close();
	}
}
