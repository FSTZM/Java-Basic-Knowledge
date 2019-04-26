package StringBuffer;
import java.util.Arrays;

/*
 * 对一个字符串中的数值进行从小到大的排序
 * 
 * “20 78 -7 88 36 29”
 * 
 * 思路：
 * 1. 将字符串变成字符串数组
 * 2. 将字符串数组变成int数组
 * 3. 对int数组排序
 * 4. 将排序后的int数组变成字符串
 * 
 */

public class StringBufferTest {

	public static void main(String[] args) {
		
		String str = "20 78 -7 88 36 29";
		
		System.out.println(str);
		
		String[] str_arr = toStringArray(str);
		int[] arr = toIntArray(str_arr);
		sortArray(arr);
		
		String str1 = printArray(arr);
		
		System.out.println(str1);
		

	}


	public static String printArray(int[] arr) {
		
		StringBuilder sb = new StringBuilder();
//		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) 
				sb.append(arr[i] + " ");
			
			else
				sb.append(arr[i]);
			
		}
		
		return sb.toString();
		
	}

	private static void sortArray(int[] arr) {
		
		Arrays.sort(arr);
		
	}

	public static int[] toIntArray(String[] str_arr) {
		
		int[] arr = new int[str_arr.length];
		
		for (int i = 0; i < str_arr.length; i++) {
			arr[i]  = Integer.parseInt(str_arr[i]);  //必须加Integer.parseInt，否则String类的无法转换成int类的
			
		}
		
		return arr;
		
	}

	public static String[] toStringArray(String str) {
		
		String[] str_arr = str.split(" ");
		
		return str_arr;
		
	}

}
