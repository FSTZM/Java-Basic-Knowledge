package StringPractice;

/*
 * 1. ����һ���ַ������顣�����ֵ�˳����дӴ�С������
 * 		{"nba","abc","cba","zz","haha"}
 * 
 * ˼·��
 * 1. ���������� --- ѡ�� ð��
 * 2. forǶ�� �Ƚ� ��λ
 * 3. ���⣺��ǰ�ŵ����������õ��ǱȽ�������������������ַ�������
 * 		�ַ�����ô���ڱȽ��أ�---�������ṩ�������ַ����ȽϵĹ���
 * 
 */


public class StringTest_1 {

	public static void main(String[] args) {
		
		String[] arr = {"nba","abc","cba","zz","haha","qq"};
		
		printArray(arr);
		System.out.println();
		
		sortArray(arr);
		
		printArray(arr);
		
		
		//public void sortStr(String str)
		//{
			//for(int i=0; i < str.length();i++)
				//for (int j = i+1; j < str.length-1; j++) {
					//if(str[i].compare)
				//}
		//}
		
		
		
	}

	public static void sortArray(String[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i].compareTo(arr[j]) > 0)
					swap(arr,i,j);
				
			}
		}
		
	}

	private static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

	public static void printArray(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!= arr.length-1)
				System.out.print(arr[i] + ",");
			else
				System.out.print(arr[i]);
		
		}
		System.out.print("]");
	}
	

}