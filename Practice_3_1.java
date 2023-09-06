
public class Practice_3_1 {
	
	public static void main(String[] args) {
		// (1) 0~98 Â¦¼ö ÇÕ
		// (2)
		int sum=0, i=0;
		while (i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
		// (3)
		sum = 0;
		i = 0;
		for (i = 0; i < 100; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
		// (4)
		sum = 0;
		i = 0;
		do {
			sum = sum + i;
			i += 2;
		} while(i < 100);
		System.out.println(sum);
	}
	
}
