import java.io.*;
import java.util.*;

public class Practice_8_10 {
	public static void main(String[] args) {
		try {
			Scanner fsc = new Scanner(new File("phone.txt"), "UTF-8");
			HashMap<String, String> hmss = new HashMap<String, String>();
			while (fsc.hasNext()) {
				String s1 = fsc.next();
				String s2 = fsc.next();
				System.out.println(s1 + s2);
				hmss.put(s1, s2);
			}
			System.out.println("�� "+hmss.size()+"���� ��ȭ��ȣ�� �о����ϴ�.");
			fsc.close();
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("�̸�>> ");
				String s3 = sc.next();
				if (s3.equals("�׸�")) break;
				System.out.println(hmss.get(s3));
			}
			
		}
		catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
