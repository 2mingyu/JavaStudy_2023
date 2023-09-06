import java.io.*;

public class Practice_8_3 {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("\\windows\\system.ini");
			int c;
			char C;
			while((c = fin.read()) != -1) {
				C = (char)c;
				if (C>='a' && C<='z') {
					C = Character.toUpperCase(C);
				}
				System.out.print(C);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
