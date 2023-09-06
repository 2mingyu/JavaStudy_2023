import java.io.*;
import java.util.Scanner;

public class Practice_8_7 {
	public static void main(String[] args) {
		File src = new File("a.jpg");
		File dest = new File("b.jpg");
		int c;
		long n = 0;
		long l = src.length();
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest); 
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
				n++;
				if (n == l/10) {
					System.out.print("*");
					n = 0;
				}
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
		}
		catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
