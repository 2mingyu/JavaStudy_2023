import java.io.*;
import java.util.Scanner;

public class Practice_8_8 {
	public static void main(String[] args) {
		File f;
		File sub[];
		try {
			f = new File("C:\\");
			sub = f.listFiles();
			
			long max = -1;
			int maxi = -1;
			for(int i=0; i<sub.length;i++) {
				// System.out.println(sub[i].getPath());
				if (max<sub[i].length()) {
					max = sub[i].length();
					maxi = i;
				}
			}
			System.out.println("가장 큰 파일은 " + sub[maxi].getPath() + " " + sub[maxi].length() + "바이트");
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
