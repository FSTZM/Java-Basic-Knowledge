package StringPractice;


/*
 * 一个子串在整串中出现的次数
 * "abcusdabcojkabctfabcubsd"
 * 
 * 1 要找的子串是否存在 如果存在确定其出现的位置，可以使用indexOf
 * 2 如果找到了，记录出现的位置，并且在剩余的子串中继续寻找
 * 3 以此类推，通过循环完成查找，如果找不到就是-1，并对找到的用计数器记录
 * 
 */
public class StringTest_2 {

	public static void main(String[] args) {

		String str = "abcusdabcojkabctfabcubsd";
		String key = "abc";
		int count = getKeyCount(str,key);
		System.out.println("count = " + count);
	}

	public static int getKeyCount(String str, String key) {
		
		int count = 0;
		int index = 0;
		
		while((index = str.indexOf(key)) != -1){
			
			str = str.substring(index + key.length());
			count++;
		}
		return count;		
	
	}

}
