package StringPractice;

/*
 * 寻找两个字符串里面最大的相同子串
 * "sjdhsjsnuisuyuqindadjdcan"
 * "asjnsuyuqinuidadosjfa"
 * 
 * 1 先考虑短的那个是否在长的那个字符串中，如果存在，短的就是最大子串
 * 2 如果不是，就将短的那个字串长度递减的方式去子串，去长串中判断是否存在，如果存在，就结束
 * 
 */


public class StringTest_3 {

	public static void main(String[] args) {
		
		String s1 = "sjdhsjsuisuyuqindadjdcan";
		String s2 = "asjnsuyuqinui";
		String maxString = getMaxSameString(s1,s2);
		System.out.println("maxString = " + maxString);
	}

	public static String getMaxSameString(String s1, String s2) {
		
		for (int i = 0; i < s2.length(); i++) {
			for (int a = 0,b = s2.length()-i; b != s2.length()+ 1 ; a++,b++) {
				String sub = s2.substring(a, b);
				if (s1.contains(sub)) {
					return sub;
				}
			}
			
		}
		return null;
	}

}
