class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int i=0;
		int[] newArray = new int[a.length + b.length];
		for(int j=0;j<a.length;j++) {
			newArray[i] = a[j];
			i++;
		}
		for(int j=0;j<b.length;j++) {
			newArray[i] = b[j];
			i++;
		}
		return newArray;
	}
	public static void print(int[] a) {
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println(" ]");
	}
}
public class Practice_4_9 {
	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1,  array2);
		ArrayUtil.print(array3);
	}
	
}
