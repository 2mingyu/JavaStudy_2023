class Song {
	String title;
	String artist;
	int year;
	String country;
	public Song() {	}
	public Song(String t, String a, int y, String c) {
		this.title = t;
		this.artist = a;
		this.year = y;
		this.country = c;
	}
	public void show() {
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
	}
}
public class Practice_4_3 {
	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "������");
		s.show();
	}
	
}
