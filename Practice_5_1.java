class TV51 {
	private int size;
	public TV51(int size) { this.size = size; }
	protected int getSize() { return size; }
}
class ColorTV extends TV51 {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}
public class Practice_5_1 {
	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
	
}
