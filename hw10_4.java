import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class hw10_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		str = scanner.nextLine();
		int len = str.length();

        Vector<Integer> vInt = new Vector<Integer>();
        Vector<String> vCal = new Vector<String>();

        StringTokenizer strToken = new StringTokenizer(str, "-+", true);

        while (strToken.hasMoreTokens()) {
            String tmp = strToken.nextToken();
            if (tmp.equals("+") || tmp.equals("-")) {
                vCal.add(tmp);
            } else {
                vInt.add(Integer.parseInt(tmp));
            }
        }

        int result = vInt.elementAt(0);
        for(int i = 0; i < vCal.size(); i++){
            int tmp = 1;
            if(vCal.elementAt(i).equals("-")){
                tmp = -1;
            }
            result += tmp * vInt.elementAt(i + 1);
        }

        System.out.println("수식 :" + str);
        System.out.println("결과 :" + result);
 
		scanner.close();
	}
}
