
public class Practice_3_7 {
	
	public static void main(String[] args) {
		int[] n = new int[10];
		float sum = 0;
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for (int i=0; i<n.length; i++) {
			n[i] = (int)(Math.random()*10 + 1);
			System.out.print(n[i] + " ");
			sum += n[i];
		}
		System.out.println("\nÆò±ÕÀº " + sum / n.length);
	}
	
}
