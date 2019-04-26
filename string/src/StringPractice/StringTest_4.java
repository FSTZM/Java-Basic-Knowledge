package StringPractice;
/*
 * 模拟一个trim功能一致的方法。去除字符串两端的空白
 * 1 定义两个角标  一个从头开始判断字符串空格的角标，不断++
 * 				  一个从尾开始判断字符串空格的角标，不断--
 * 2 判断到不是空格为止，取从头到尾之间的字符串即可。
 */
public class StringTest_4 {

	public static void main(String[] args) {
		
		String s = "    asa ddaw    d   ";
		s = myTrim(s);
		System.out.println("-" + s + "-");

	}

	public static String myTrim(String s) {
		
		int start = 0;
		int end = s.length()-1;
		
		while(start <= end && s.charAt(start) == ' '){
			start++;
		}
		while(start <= end && s.charAt(end) == ' '){
			end--;
		}
		
		return s.substring(start, end+1);
		
	}

}
