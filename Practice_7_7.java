import java.util.*;


public class Practice_7_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Float> hmsf = new HashMap<String, Float>(5);
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		for(int i=0;i<5;i++) {
			System.out.print("�̸��� ����>> ");
			String name = sc.next();
			float grade = sc.nextFloat();
			hmsf.put(name, grade);
		}
		System.out.print("���л� ���� ���� ���� �Է�>> ");
		float g = sc.nextFloat();
		Set<String> keys = hmsf.keySet();
		Iterator<String> it = keys.iterator();
		System.out.print("���л� ��� : ");
		while(it.hasNext()) {
			String name = it.next();
			float grade = hmsf.get(name);
			if (grade > g) {
				System.out.print(name + " ");
			}
		}
		sc.close();
	}
}
