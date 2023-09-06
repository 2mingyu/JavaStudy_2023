import java.util.Scanner;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.Iterator;

class Location{
	String city;
	int x, y;
	public Location(String city, int x, int y) {
		this.city = city;
		this.x = x;
		this.y = y;
	}
	public void find_location(String city) {
		System.out.println(city + " " + x + " " + y);
	}
}
public class Practice_7_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> hmsl = new HashMap<String, Location>(4);
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s, ",");
			String city = st.nextToken();
			int x = Integer.parseInt(st.nextToken().trim());
			int y = Integer.parseInt(st.nextToken().trim());
			hmsl.put(city, new Location(city,x,y));
		}
		System.out.println("-----------------");
		Set<String> key = hmsl.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			Location s = hmsl.get(temp);
			s.find_location(temp);
		}
		System.out.println("-----------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String city = sc.next();
			if(city.equals("그만"))
				break;
			Location s = hmsl.get(city);
			if(s==null)
				System.out.println(city+"는 없습니다.");
			else
				s.find_location(city);
		}
		sc.close();
	}
}
