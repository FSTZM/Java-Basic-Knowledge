package StringPractice;

/*
 * 1. 给定一个字符串数组。按照字典顺序进行从大到小的排序
 * 		{"nba","abc","cba","zz","haha"}
 * 
 * 思路：
 * 1. 对数组排序 --- 选择 冒泡
 * 2. for嵌套 比较 换位
 * 3. 问题：以前排的是整数，用的是比较运算符，可是现在是字符串对象
 * 		字符串怎么用于比较呢？---对象中提供了用于字符串比较的功能
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
