import java.util.Scanner;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
class StackApp implements Stack {
	private int size;
	private int cnt;
	private String[] stack;
	public StackApp(int size) {
		cnt = 0;
		this.size = size;
		stack = new String[size];
	}
	public int length() {
		return stack.length;
	}
	public int capacity() {
		return size - cnt;
	}
	public String pop() {
		return stack[--cnt];
	}
	public boolean push(String val) {
		if(capacity() <= 0) {
			return false;
		}
		else {
			stack[cnt] = val;
			cnt++;
			return true;
		}
	}
}
public class Practice_5_9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = sc.nextInt();
		StackApp sa = new StackApp(size);
		while(true) {
			System.out.print("���ڿ� �Է� >>");
			String tmp = sc.next();
			if(tmp.equals("�׸�")) break;
			else {
				boolean s = sa.push(tmp);
				if(!s) {
					System.out.println("������ �� ���� Ǫ�� �Ұ�!");
				}
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� ��:");
		int cntTmp = sa.capacity();
		for(int i=0; i<sa.length()-cntTmp; i++) {
			System.out.print(sa.pop() + " ");
		}
		sc.close();
	}
	
}
