
public class Practice_3_11 {
	
	public static void main(String[] args) {
		double sum = 0;
		for (int i=0; i<args.length; i++)
			sum += Integer.parseInt(args[i]);
		double avg = sum / args.length;
		
		System.out.println(avg);
		// java Practice_3_11.java 2 3 4
	}
	
}
