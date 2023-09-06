import java.io.*;
import java.util.*;

public class Practice_8_11 {
	public static void main(String[] args) {
		try {
			FileReader fr = null;
			Vector<String> v;
			Scanner sc;
			fr = new FileReader(new File("words.txt"));
			v = new Vector<String>();
			sc = new Scanner(fr);
			String word="";
			while(sc.hasNext()) {
				word = sc.next();
				v.add(word);
			}
			System.out.println("������Ʈ ���� ���� words.txt ������ �о����ϴ�.");
			sc.close();
			sc = new Scanner(System.in);
			while (true) {
				boolean find = false;
				System.out.print("�ܾ�>>");
				word=sc.next();
				if(word.equals("�׸�")) break;
				for(int i=0; i<v.size(); i++) {
					String w = v.get(i);
					if(w.length()<word.length()) continue;
					
					String sub=w.substring(0, word.length());
					if(sub.equals(word)) {
						System.out.println(w);
						find=true;
					}
				}
				if(!find) System.out.println("�߰��� �� ����.");
			}
			System.out.println("�����մϴ�...");
			sc.close();
			fr.close();
		}
		catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
