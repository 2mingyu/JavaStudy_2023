abstract class PairMap {
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}
class Dictionary59 extends PairMap {
	private int len;
	private int cnt;
	public Dictionary59(int l) {
		this.len = l;
		keyArray = new String[len];
		valueArray = new String[len];
		cnt = 0;
	}
	public String get(String key) {
		for(int i=0;i<cnt;i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return "null";
	}
	public void put(String key, String value) {
		int index = cnt;
		for(int i=0; i<cnt; i++) {
			if(key.equals(keyArray[i])) {
				index = i;
				break;
			}
		}
		keyArray[index] = key;
		valueArray[index] = value;
		cnt++;
	}
	public String delete(String key) {
		String temp = get(key);
		int index = cnt;
		for(int i=0;i<cnt;i++) {
			if(key.equals(keyArray[i])) {
				index=i;
				break;
			}
		}
		keyArray[index] = "";
		valueArray[index] = "";
		cnt--;
		return temp;
	}
	int length() {
		return cnt;
	}
}
public class Practice_5_10 {
	
	public static void main(String[] args) {
		Dictionary59 dic = new Dictionary59(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
	
}
