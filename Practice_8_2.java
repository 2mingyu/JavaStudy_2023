import java.io.*;

public class Practice_8_2 {
	public static void main(String[] args) {
		System.out.println("c:\\temp\\phone.txt를 출력합니다.");
		FileReader fin = null;
		try {
			fin = new FileReader("\\temp\\phone.txt");
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
