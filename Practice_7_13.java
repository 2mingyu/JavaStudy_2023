import java.util.*;



public class Practice_7_13 {
	public static boolean isFloat(String str) {
		try {
			Float.parseFloat(str);
			return true;
		}
		catch (NumberFormatException ex){
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("수퍼컴이 작동합니다. 프로그램을 입력해주세요. GO를 입력하면 작동합니다.");
		Scanner sc = new Scanner(System.in);
		Vector<String[]> vs = new Vector<String[]>();	// 명령어 저장
		HashMap<String, Float> hmsi = new HashMap<String, Float>();	// 변수 저장
		while (true) {
			vs.removeAllElements(); // 모든 명령어 삭제
			// 명령어 입력
			while (true) {
				System.out.print(">> ");
				String s1 = sc.next();
				if (s1.equals("go")) break;
				else if(s1.equals("stop")) {
					sc.close();
					return;
				}
				String s2 = sc.next();
				String s3 = sc.next();
				vs.add(new String[] {s1, s2, s3});
			}
			// 명령어 실행
			int i = 0; // 실행되는 명령어 줄
			while (i < vs.size()) {
				if (vs.get(i)[0].equals("mov")) {
					hmsi.put(vs.get(i)[1], Float.parseFloat(vs.get(i)[2]));
					i++;
				}
				else if (vs.get(i)[0].equals("add")) {
					float tmp;
					if (isFloat(vs.get(i)[2])) {	// 더하는 대상이 숫자면
						tmp = Float.parseFloat(vs.get(i)[2]);	// 숫자로 바꿈
					}
					else {	// 더하는 대상이 변수면
						tmp = hmsi.get(vs.get(i)[2]);	// 변수 꺼내옴
					}
					hmsi.put(vs.get(i)[1], hmsi.get(vs.get(i)[1]) + tmp);
					i++;
				}
				else if (vs.get(i)[0].equals("sub")) {
					float tmp;
					if (isFloat(vs.get(i)[2])) {	// 빼는 대상이 숫자면
						tmp = Float.parseFloat(vs.get(i)[2]);	// 숫자로 바꿈
					}
					else {	// 빼는 대상이 변수면
						tmp = hmsi.get(vs.get(i)[2]);	// 변수 꺼내옴
					}
					hmsi.put(vs.get(i)[1], hmsi.get(vs.get(i)[1]) - tmp);
					i++;
				}
				else if (vs.get(i)[0].equals("jn0")) {
					if (hmsi.get(vs.get(i)[1]) != 0)
						i = 3;
					else
						i++;
				}
				else if (vs.get(i)[0].equals("prt")) {
					System.out.println("[prt " + vs.get(i)[1] + " " + vs.get(i)[2] + "]");
					Set<String> keys = hmsi.keySet();
					Iterator<String> it = keys.iterator();
					while(it.hasNext()) {
						String key = it.next();
						Float value = hmsi.get(key);
						System.out.print(key+":"+value+" ");
					}
					System.out.println("\n출력할 결과는 " + hmsi.get(vs.get(i)[1]) + ". 프로그램 실행 끝");
					i++;
				}
			}
		}
	}
}
