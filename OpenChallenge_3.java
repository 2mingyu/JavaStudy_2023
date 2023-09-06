import java.util.Scanner;
import java.util.Random;

public class OpenChallenge_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String re = "y";
		Random r= new Random();
		int guess, k, min, max;
		while (re.equals("y")) {
			guess = -1;
			k = r.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			min = 0;
			max = 99;
			while (guess != k) {
				System.out.println(min + "~" + max);
				guess = scanner.nextInt();
				if (k > guess) {
					min = guess;
					System.out.println("더 높게");
				}
				else if (k < guess) {
					max = guess;
					System.out.println("더 낮게");
				}
				else {
					System.out.println("맞았습니다.");
				}
			}
			System.out.print("다시하시겠습니까(y/n)>> ");
			re = scanner.next();
		}
		
		scanner.close();
	}

}
