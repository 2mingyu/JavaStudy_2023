import java.util.*;



public class Practice_7_13 {
	public static boolean isFloat(String str) {
		try {
			Float.parseFloat(str);
			return true;
		}
		catch (NumberFormatException ex){
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("�������� �۵��մϴ�. ���α׷��� �Է����ּ���. GO�� �Է��ϸ� �۵��մϴ�.");
		Scanner sc = new Scanner(System.in);
		Vector<String[]> vs = new Vector<String[]>();	// ��ɾ� ����
		HashMap<String, Float> hmsi = new HashMap<String, Float>();	// ���� ����
		while (true) {
			vs.removeAllElements(); // ��� ��ɾ� ����
			// ��ɾ� �Է�
			while (true) {
				System.out.print(">> ");
				String s1 = sc.next();
				if (s1.equals("go")) break;
				else if(s1.equals("stop")) {
					sc.close();
					return;
				}
				String s2 = sc.next();
				String s3 = sc.next();
				vs.add(new String[] {s1, s2, s3});
			}
			// ��ɾ� ����
			int i = 0; // ����Ǵ� ��ɾ� ��
			while (i < vs.size()) {
				if (vs.get(i)[0].equals("mov")) {
					hmsi.put(vs.get(i)[1], Float.parseFloat(vs.get(i)[2]));
					i++;
				}
				else if (vs.get(i)[0].equals("add")) {
					float tmp;
					if (isFloat(vs.get(i)[2])) {	// ���ϴ� ����� ���ڸ�
						tmp = Float.parseFloat(vs.get(i)[2]);	// ���ڷ� �ٲ�
					}
					else {	// ���ϴ� ����� ������
						tmp = hmsi.get(vs.get(i)[2]);	// ���� ������
					}
					hmsi.put(vs.get(i)[1], hmsi.get(vs.get(i)[1]) + tmp);
					i++;
				}
				else if (vs.get(i)[0].equals("sub")) {
					float tmp;
					if (isFloat(vs.get(i)[2])) {	// ���� ����� ���ڸ�
						tmp = Float.parseFloat(vs.get(i)[2]);	// ���ڷ� �ٲ�
					}
					else {	// ���� ����� ������
						tmp = hmsi.get(vs.get(i)[2]);	// ���� ������
					}
					hmsi.put(vs.get(i)[1], hmsi.get(vs.get(i)[1]) - tmp);
					i++;
				}
				else if (vs.get(i)[0].equals("jn0")) {
					if (hmsi.get(vs.get(i)[1]) != 0)
						i = 3;
					else
						i++;
				}
				else if (vs.get(i)[0].equals("prt")) {
					System.out.println("[prt " + vs.get(i)[1] + " " + vs.get(i)[2] + "]");
					Set<String> keys = hmsi.keySet();
					Iterator<String> it = keys.iterator();
					while(it.hasNext()) {
						String key = it.next();
						Float value = hmsi.get(key);
						System.out.print(key+":"+value+" ");
					}
					System.out.println("\n����� ����� " + hmsi.get(vs.get(i)[1]) + ". ���α׷� ���� ��");
					i++;
				}
			}
		}
	}
}
