import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class myPractice {
	public static void main(String[] args) {
		String marketlist[] = {"BTC", "ETH", "XRP"};
		for (int j=0; j<marketlist.length; j++) {
			String u = "https://api.upbit.com/v1/ticker?markets=KRW-" + marketlist[j];
			try {
				URL url = new URL(u);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				int responseCode = connection.getResponseCode();
				System.out.println(responseCode);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		        StringBuffer stringBuffer = new StringBuffer();
		        String inputLine;
		        while ((inputLine = bufferedReader.readLine()) != null)  {
		            stringBuffer.append(inputLine);
		        }
		        bufferedReader.close();
		        String response = stringBuffer.toString();
		        System.out.println(response);
		        
		        response = response.replace("[{", "");
		        response = response.replace("}]", "");
		        response = response.replace(":", " ");
		        response = response.replace(",", " ");
		        response = response.replace("\"", "");
		        String responses[] = response.split(" ");
		        for (int i=0; i<responses.length; i++) {
		        	if (responses[i].equals("trade_price")) {
		        		System.out.println(responses[i + 1]);
		        		break;
		        	}
		        }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
