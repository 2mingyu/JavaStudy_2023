import java.io.*;
import java.util.Scanner;

public class Practice_8_6 {
	public static void main(String[] args) {
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 파일 이름을 입력하세요>>");
			String fileName1 = sc.nextLine();
			System.out.print("두번째 파일 이름을 입력하세요>>");
			String fileName2 = sc.nextLine();
			FileReader fr1 = new FileReader(fileName1);
			FileReader fr2 = new FileReader(fileName2);
			FileWriter fw3 = new FileWriter("appended.txt");
			int c1 = 0;
			while(true) {
				c1 = fr1.read();
				if (c1 == -1)
					break;
				fw3.write(c1);
			}
			c1 = 0;
			while(c1 != -1) {
				c1 = fr2.read();
				if (c1 == -1)
					break;
				fw3.write(c1);
			}
			fw3.close();
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
		}
		catch (IOException e) {
			System.out.println(e);
			System.out.println("입출력 오류");
		}
	}
}
