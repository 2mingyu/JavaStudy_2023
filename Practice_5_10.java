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
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}
	
}
