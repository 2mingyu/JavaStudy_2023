import java.util.Vector;
import java.util.Collections;

public class hw10_5 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(7);
		// 1) 숫자 6개를 랜덤으로 추출
		for (int i=0;i<6;i++) {
			while (true) {
				int n = (int)(Math.random() * 45 + 1);
				if(!v.contains(n)) {
					v.add(n);
					break;
				}
			}
		}
		// 2) 추출된 수는 오름차순 정렬
		Collections.sort(v);
		// 3) 마지막 보너스 숫자도 랜덤 추출
		while (true) {
			int n = (int)(Math.random() * 45 + 1);
			if(!v.contains(n)) {
				v.add(n);
				break;
			}
		}
		// 4) 전체 로또번호 출력
		for (int i=0;i<6;i++) {
			System.out.print(" " + v.get(i));
		}
		System.out.print(" + " + v.get(6));
	}
}
