import java.util.Scanner;
import java.io.*;

public class Practice_8_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		System.out.println("전화번호 입력 프로그램입니다.");
		try {
			fw = new FileWriter("\\temp\\phone.txt");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = sc.nextLine();
				if (line.equals("그만")) {
					break;
				}
				fw.write(line, 0, line.length());
				fw.write("\r\n", 0, 2);
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		System.out.println("\\temp\\phone.txt에 저장하였습니다.");
		sc.close();
	}
}
