import java.util.Scanner;

public class Practice_3_8 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int m = scanner.nextInt();
		int[] n = new int[m];
		int i=0, j=0;
		for (i=0; i<n.length; i++) {
			while (true) {
				n[i] = (int)(Math.random()*100 + 1);
				for (j=0; j<i; j++) {
					if (n[i] == n[j]) {
						break;
					}
				}
				if (i==j)
					break;
			}
			System.out.print(n[i] + " ");
		}
		
		scanner.close();
	}
	
}
