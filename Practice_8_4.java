import java.io.*;
import java.util.Scanner;

public class Practice_8_4 {
	public static void main(String[] args) {
		int lineNumber = 1;
		try {
			Scanner fScanner = new Scanner(new FileReader("\\windows\\system.ini"));
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				System.out.print(lineNumber + " : ");
				System.out.println(line);
				lineNumber++;
			}
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
