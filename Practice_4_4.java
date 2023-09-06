class Rectangle {
	int x;
	int y;
	int width;
	int height;
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	public int square() { return width * height; }
	public void show() {
		System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}
	public boolean contains(Rectangle r) {
		if ((this.x < r.x) && (this.x + this.width > r.x + r.width)) {
			if ((this.y < r.y) && (this.y + this.height > r.y + r.height)) {
				return true;
			}
		}
		return false;
	}
}
public class Practice_4_4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
	
}
