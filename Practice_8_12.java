import java.io.*;
import java.util.*;

public class Practice_8_12 {
	public static void main(String[] args) {
		try {
			FileReader fr = null;
			Vector<String> v;
			Scanner fsc, sc;
			sc = new Scanner(System.in);
			System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
			System.out.print("��� ���ϸ� �Է�>> ");
			String fileN = sc.next();
			
			fr = new FileReader(new File(fileN));
			v = new Vector<String>();
			fsc = new Scanner(fr);
			String line="";
			while(fsc.hasNext()) {
				line = fsc.nextLine();
				v.add(line);
			}
			while(true) {
				System.out.print("�˻��� �ܾ ����>> ");
				String findN = sc.next();
				boolean find = false;
				if (findN.equals("�׸�")) break;
				for(int i=0; i<v.size(); i++) {
					String temp = v.get(i);
					if(temp.indexOf(findN) != -1) {
						find = true;
						System.out.println(i + ": " + temp);
					}
				}
				if(!find) System.out.println("�߰��� �� ����.");
			}
			System.out.println("���α׷��� �����մϴ�.");
			sc.close();
			fr.close();
			fsc.close();
		}
		catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
