import java.text.SimpleDateFormat;
import java.util.Date;

public class myPractice2 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
}
