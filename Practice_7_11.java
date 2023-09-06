import java.util.*;

class Nation {
	String country;
	String capital;
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	public String getCountry() {return country;}
	public String getCapital() {return capital;}
}

public class Practice_7_11 {
	public static void main(String[] args) {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		Scanner sc = new Scanner(System.in);
		Vector<Nation> vn = new Vector<Nation>();
		while (true) {
			System.out.print("�Է�:1 ����:2 ����:3 >> ");
			int a = sc.nextInt();
			if (a==1) {
				System.out.println("���� " + vn.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while (true) {
					System.out.print("����� ���� �Է� " + (vn.size()+1) + " >> ");
					String s1 = sc.next();
					if (s1.equals("�׸�")) break;
					String s2 = sc.next();
					vn.add(new Nation(s1, s2));
				}
			}
			if (a==2) {
				while (true) {
					int b = (int)(Math.random() * vn.size());
					System.out.print(vn.get(b).getCountry() + "�� ������?");
					String s3 = sc.next();
					if (s3.equals("�׸�")) break;
					else if (s3.equals(vn.get(b).getCapital()))
						System.out.println("����!!");
					else
						System.out.println("�ƴմϴ�!!");
				}
			}
			if (a==3) {
				break;
			}
		}
		sc.close();
	}
}
