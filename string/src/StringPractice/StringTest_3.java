package StringPractice;

/*
 * Ѱ�������ַ�������������ͬ�Ӵ�
 * "sjdhsjsnuisuyuqindadjdcan"
 * "asjnsuyuqinuidadosjfa"
 * 
 * 1 �ȿ��Ƕ̵��Ǹ��Ƿ��ڳ����Ǹ��ַ����У�������ڣ��̵ľ�������Ӵ�
 * 2 ������ǣ��ͽ��̵��Ǹ��ִ����ȵݼ��ķ�ʽȥ�Ӵ���ȥ�������ж��Ƿ���ڣ�������ڣ��ͽ���
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
