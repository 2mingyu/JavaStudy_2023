import java.util.*;


public class Practice_7_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hmsi = new HashMap<String, Integer>();
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ�. **");
		while (true) {
			System.out.print("�̸��� ����Ʈ �Է� >> ");
			String name = sc.next();
			if (name.equals("�׸�")) break;
			int score = sc.nextInt();
			if (hmsi.get(name) == null) {
				hmsi.put(name, score);
			}
			else {
				hmsi.put(name,  score + hmsi.get(name));
			}
			Set<String> key = hmsi.keySet();
			Iterator <String> it = key.iterator();
			while (it.hasNext()) {
				String str = it.next();
				System.out.print("(" + str + "," + hmsi.get(str) + ")");
			}
			System.out.println();
		}
		sc.close();
	}
}
