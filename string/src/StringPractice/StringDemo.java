package StringPractice;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *String����ص㣺
		 * �ַ�������һ��һ������ʼ���Ͳ��ᱻ�ı�
		 * 
		 */
		stringDemo2();

	}

	private static void stringDemo2() {
		// TODO Auto-generated method stub
		
		String s = "abc";  //�������д���һ���ַ�������
		String s1 = new String("abc"); //�����洴����������һ��newһ���ַ�������
		
		System.out.println(s == s1); //false
		System.out.println(s.equals(s1)); 	//true
											//string���е�equals��д��object�е�equals
										    //��ʵ���ǱȽ��ַ����е�����
//		System.out.println("s = " + s);
//		System.out.println("s1 = " + s1);
	}
	

	/**
	 * ��ʾ�ַ�������ĵ�һ�ַ�ʽ������ȷ�ַ��������ص��ص�
	 * ����û�оͽ�����������
	 */
	private static void stringDemo1() {
		String s = "abc";  //�洢���ַ����������У����û�оʹ������о������á�
//		s = "nba";
		String s1 = "abc";
//		System.out.println("s = " + s);  //true
		System.out.println(s == s1);
	}

}
