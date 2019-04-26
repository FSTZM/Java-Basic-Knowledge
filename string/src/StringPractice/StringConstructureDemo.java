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
		 * String(byte[] bytes,int offset,int length)  把数组中的一部分变成字符串   
		 * String(char[] bytes,int offset,int length)
		 *                     此处开始		取几个
		 * 通过使用平台的默认字符集解码指定的byte子数组，构造一个新的String
		 * 
		 */
		String s3 = new String(arr,1,1);
		System.out.println("s3 = " + s3); //输出为s3 = b
	}

	public static void stringConstructorDemo() {
		String s = new String();//String s == ""; 不等效String s = null
		
		byte[] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println("s1 = " + s1);
		
	}


}
