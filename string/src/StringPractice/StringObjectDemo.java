package StringPractice;

public class StringObjectDemo {

	public static void main(String[] args) {

		//String s1 = "abc";
		//String s2 = "abc";
		
		//intern() 可以对字符串池进行操作
		
		String s1 = new String("abc"); //new 一个对象
		String s2 = s1.intern(); //池中的数据 是共享数据
		
		System.out.println(s1 == s2);  //false
		
	}

}
