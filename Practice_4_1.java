class TV {
	String a;
	int b;
	int c;
	public TV(String a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void show() {
		System.out.println(a + "���� ���� " + b + "���� " + c +"��ġ TV");
	}
}
public class Practice_4_1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
	
}
