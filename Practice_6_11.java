import java.util.Scanner;
public class Practice_6_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		
		while(true) {
			System.out.print("��� :");
			String cmd = sc.nextLine();
			if(cmd.equals("�׸�")) {
				System.out.print("�����մϴ�");
				sc.close();
				break;
			}
			String [] tokens = cmd.split("!");
			if(tokens.length != 2) {
				System.out.println("�߸��� ����Դϴ�!");
			}
			else {
				if (tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("�߸��� ����Դϴ�!");
					continue;
				}
				int index = sb.indexOf(tokens[0]);
				if(index == -1) {
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				sb.replace(index, index+tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}
	}
}
