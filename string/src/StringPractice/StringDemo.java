package StringPractice;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *String类的特点：
		 * 字符串对象一般一旦被初始化就不会被改变
		 * 
		 */
		stringDemo2();

	}

	private static void stringDemo2() {
		// TODO Auto-generated method stub
		
		String s = "abc";  //常量池中创建一个字符串对象
		String s1 = new String("abc"); //堆里面创建两个对象，一个new一个字符串对象
		
		System.out.println(s == s1); //false
		System.out.println(s.equals(s1)); 	//true
											//string类中的equals覆写了object中的equals
										    //其实就是比较字符串中的内容
//		System.out.println("s = " + s);
//		System.out.println("s1 = " + s1);
	}
	

	/**
	 * 演示字符串定义的第一种方式，并明确字符串常量池的特点
	 * 池中没有就建立，池中有
	 */
	private static void stringDemo1() {
		String s = "abc";  //存储在字符串常量池中，如果没有就创建，有就拿来用。
//		s = "nba";
		String s1 = "abc";
//		System.out.println("s = " + s);  //true
		System.out.println(s == s1);
	}

}
