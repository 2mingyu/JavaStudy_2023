import java.util.Vector;
import java.util.Collections;

public class hw10_5 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(7);
		// 1) ���� 6���� �������� ����
		for (int i=0;i<6;i++) {
			while (true) {
				int n = (int)(Math.random() * 45 + 1);
				if(!v.contains(n)) {
					v.add(n);
					break;
				}
			}
		}
		// 2) ����� ���� �������� ����
		Collections.sort(v);
		// 3) ������ ���ʽ� ���ڵ� ���� ����
		while (true) {
			int n = (int)(Math.random() * 45 + 1);
			if(!v.contains(n)) {
				v.add(n);
				break;
			}
		}
		// 4) ��ü �ζǹ�ȣ ���
		for (int i=0;i<6;i++) {
			System.out.print(" " + v.get(i));
		}
		System.out.print(" + " + v.get(6));
	}
}
