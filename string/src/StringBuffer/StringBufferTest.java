package StringBuffer;
import java.util.Arrays;

/*
 * ��һ���ַ����е���ֵ���д�С���������
 * 
 * ��20 78 -7 88 36 29��
 * 
 * ˼·��
 * 1. ���ַ�������ַ�������
 * 2. ���ַ���������int����
 * 3. ��int��������
 * 4. ��������int�������ַ���
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
			arr[i]  = Integer.parseInt(str_arr[i]);  //�����Integer.parseInt������String����޷�ת����int���
			
		}
		
		return arr;
		
	}

	public static String[] toStringArray(String str) {
		
		String[] str_arr = str.split(" ");
		
		return str_arr;
		
	}

}
