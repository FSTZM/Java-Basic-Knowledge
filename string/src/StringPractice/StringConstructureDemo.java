package StringPractice;

public class StringConstructureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringConstructorDemo2();
	}

	private static void stringConstructorDemo2() {
		char[] arr = {'a','b','c'};
		String s2 = new String(arr);
		System.out.println("s2 = " + s2); //s2 = abc
		/*
		 * String(byte[] bytes,int offset,int length)  �������е�һ���ֱ���ַ���   
		 * String(char[] bytes,int offset,int length)
		 *                     �˴���ʼ		ȡ����
		 * ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ����byte�����飬����һ���µ�String
		 * 
		 */
		String s3 = new String(arr,1,1);
		System.out.println("s3 = " + s3); //���Ϊs3 = b
	}

	public static void stringConstructorDemo() {
		String s = new String();//String s == ""; ����ЧString s = null
		
		byte[] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println("s1 = " + s1);
		
	}


}
