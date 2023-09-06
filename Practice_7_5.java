import java.util.Scanner;
import java.util.ArrayList;

class Student{
	private String name, major, id, grade;
	public Student(String name, String major, String id, String grade) {
		this.name=name; this.major=major; this.id=id; this.grade=grade;
	}
	public String getName() {return name;}
	public String getMajor() {return major;}
	public String getId() {return id;}
	public String getGrade() {return grade;}
}
public class Practice_7_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> as = new ArrayList<Student>(4);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i=0;i<4;i++) {
			System.out.print(">> ");
			String name = sc.next();
			String major = sc.next();
			String id = sc.next();
			String grade = sc.next();
			as.add(new Student(name, major, id, grade));
		}
		for (int i=0;i<4;i++) {
			System.out.println("----------------------");
			System.out.println("이름:"+as.get(i).getName());
			System.out.println("학과"+as.get(i).getMajor());
			System.out.println("학번:"+as.get(i).getId());
			System.out.println("학점평균:"+as.get(i).getGrade());
		}
		System.out.println("----------------------");
		while(true) {
			System.out.print("학생 이름 >> ");
			String s = sc.next();
			if (s.equals("그만")) break;
			for (int i=0;i<as.size();i++) {
				if (as.get(i).getName().equals(s)) {
					System.out.println(as.get(i).getName() + ", " + as.get(i).getMajor() + ", " + as.get(i).getId() + ", " + as.get(i).getGrade());
				}
			}
		}
		sc.close();
	}
}
