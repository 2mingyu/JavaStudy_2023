
public class Practice_3_10 {
	
	public static void main(String[] args) {
		int[][] n = new int [4][4];
		int r1, r2, r3;
		for (int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				n[i][j] = 0;
			}
		}
		for (int k=0; k<10; k++) {
			r1 = (int)(Math.random()*10 + 1);
			while(true) {
				r2 = (int)(Math.random()*4);
				r3 = (int)(Math.random()*4);
				if (n[r2][r3] == 0) {
					n[r2][r3] = r1;
					break;
				}
			}
			
		}
		for (int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
