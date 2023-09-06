
public class Practice_3_13 {
	
	public static void main(String[] args) {
		int j = 0;
		for (int i=0; i<=99; i++) {
			j = 0;
			if ((i >= 10) && (i/10%3 == 0))
				j += 1;
			if (i%10%3 == 0)
				j += 1;
			if (j == 1)
				System.out.println(i + "¹Ú¼ö Â¦");
			else if (j == 2)
				System.out.println(i + "¹Ú¼ö Â¦Â¦");
		}
	}
	
}
