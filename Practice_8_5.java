import java.io.*;
import java.util.Scanner;

public class Practice_8_5 {
	public static void main(String[] args) {
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 파일 이름을 입력하세요>>");
			String fileName1 = sc.nextLine();
			System.out.print("두번째 파일 이름을 입력하세요>>");
			String fileName2 = sc.nextLine();
			File f1 = new File(fileName1);
			File f2 = new File(fileName2);
			System.out.println(fileName1 + "와 " + fileName2 + "를 비교합니다.");
			FileReader fr1 = new FileReader(fileName1);
			FileReader fr2 = new FileReader(fileName2);
			int c1 = 0;
			int c2 = 0;
			while(c1 != -1) {
				c1 = fr1.read();
				c2 = fr2.read();
				if (c1 != c2) {
					break;
				}
			}
			if (c1 == -1 && c2 == -1)	System.out.println("파일이 같습니다");
			else System.out.println("파일이 다릅니다.");
		}
		catch (IOException e) {
			System.out.println(e);
			System.out.println("입출력 오류");
		}
	}
}
