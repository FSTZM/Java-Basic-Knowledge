package StringPractice;
/*
 * ģ��һ��trim����һ�µķ�����ȥ���ַ������˵Ŀհ�
 * 1 ���������Ǳ�  һ����ͷ��ʼ�ж��ַ����ո�ĽǱ꣬����++
 * 				  һ����β��ʼ�ж��ַ����ո�ĽǱ꣬����--
 * 2 �жϵ����ǿո�Ϊֹ��ȡ��ͷ��β֮����ַ������ɡ�
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
