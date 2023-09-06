import java.io.*;
import java.util.*;

public class Practice_8_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("***** 파일 탐색기입니다. *****");
			ArrayList<String> fileNames = new ArrayList<String>(1);
			fileNames.add("C:\\");
			while (true) {
				String fileName = "";
				for (int i = 0; i < fileNames.size(); i++) {
					fileName += fileNames.get(i);
				}
				File f = new File(fileName);
				System.out.println("[" + fileName + "]");
				File[] subFiles = f.listFiles();
				for (int i = 0; i < subFiles.length; i++) {
					if (subFiles[i].isFile())
						System.out.print("file\t");
					else if (subFiles[i].isDirectory())
						System.out.print("dir\t");
					System.out.print(subFiles[i].length() + "바이트\t");
					System.out.print(subFiles[i].getName() + "\n");
				}
				System.out.print(">>");
				String s = sc.next();
				if (s.equals("그만"))
					break;
				else if (s.equals("rename")) {
					String s1 = sc.next();
					String s2 = sc.next();
					File f1 = new File(fileName + s1);
					f1.renameTo(new File(fileName + s2));
				} else if (s.equals("mkdir")) {
					String s1 = sc.next();
					File f1 = new File(fileName + s1);
					f1.mkdir();
				} else if (s.equals(".."))
					fileNames.remove(fileNames.size() - 1);
				else
					fileNames.add(s + "\\");
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
