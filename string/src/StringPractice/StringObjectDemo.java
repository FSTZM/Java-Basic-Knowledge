package StringPractice;

public class StringObjectDemo {

	public static void main(String[] args) {

		//String s1 = "abc";
		//String s2 = "abc";
		
		//intern() ���Զ��ַ����ؽ��в���
		
		String s1 = new String("abc"); //new һ������
		String s2 = s1.intern(); //���е����� �ǹ�������
		
		System.out.println(s1 == s2);  //false
		
	}

}
