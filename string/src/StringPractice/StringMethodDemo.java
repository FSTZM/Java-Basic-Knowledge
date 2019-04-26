package StringPractice;

public class StringMethodDemo {

	public static void main(String[] args) {
		
		/*
		 * 按照面向对象的思想对字符串进行功能分类。
		 * “abcd”
		 * 
		 * 1.获取：
		 * 1.1 获取字符串中字符的个数（常数）
		 * 		int length();
		 * 1.2 根据位置获取字符
		 * 		char charAT(int index);
		 * 1.3 根据一个字符获取其第一次出现的位置
		 * 		int indexOf(int ch)
		 * 		int indexOf(int ch,int fromIndex)  //从指定的位置查找ch第一次出现的位置
		 * 		int indexOf(String str)
		 * 		int indexOf(String str,int fromIndex)
		 * 	   根据一个字符串获取其第一次出现的位置
		 * 		int lastIndexOf(int ch)
		 * 		int lastIndexOf(int ch,int fromIndex)  //从指定的位置查找ch第一次出现的位置
		 * 		int lastIndexOf(String str)
		 * 		int lastIndexOf(String str,int fromIndex)
		 * 1.4  获取字符串中的一部分字符串。也叫子串。
		 * 		String substring(int beginIndex,int endIndex)
		 * 		String substring(int beginIndex) //benginIndex - 起始索引(包括)
		 * 										 //endIndex -- （不包括）
		 * 
		 * 2   转换
		 * 		2.1 将字符串变成字符串数组（字符串的切割）
		 * 			String[] split(String regex)  //涉及到正则表达式
		 * 		2.2 将字符串变成字符数组。 -- 字符
		 * 			char[] toCharArray();
		 * 		2.3 将字符串变成字节数组。 -- 字节
		 * 			byte[] getByte()
		 * 		2.4 将字符串中的字母转化成大小写。
		 * 			String toUpperCase(); 大写 
		 * 			String toLowerCase(); 小写
		 * 		2.5 将字符串中的内容进行替换
		 * 			String replace(char oldChar,char newChar)
		 * 			String replace(String s1,String s2)
		 * 		2.6 将字符串两端的空格去除
		 * 			String trim();
		 * 		2.7 将字符串进行连接。
		 * 			String concat();
		 * 
		 * 3   判断
		 * 		3.1 两个字符串内容是否相同？
		 * 			boolean equals（Object obj）
		 * 			boolean equalsIgnoreCase（string str）  忽略大写比较字符串内容
		 * 		3.2 字符串中是否包含指定字符串
		 * 			boolean contains（string str）
		 * 		3.3 字符串是否以指定的字符串开头/结尾
		 * 			boolean startWith(string)
		 * 			boolean endsWith(string)
		 * 4  比较
		 * 		4.1 
		 * 			
		 * 			
		 */
		stringMethodDemo_4();

	}

	private static void stringMethodDemo_4() {
		
		System.out.println("abc".compareTo("ABC"));  //32
		System.out.println("abc".compareTo("acd"));  //-1
		
	}

	private static void stringMethodDemo_3() {
		
		String s = "abc";
		System.out.println(s.equals("ABC"));  //false
		System.out.println(s.equals("ABC".toLowerCase()));  //true
		System.out.println(s.equalsIgnoreCase("ABC"));   //true 等效上一行代码
		
		System.out.println(s.contains("a"));  //true
		
		String str = "Arraydemo.java";
		System.out.println(str.startsWith("Array"));
		System.out.println(str.endsWith("java"));
		System.out.println(str.concat("test"));
		
	}

	private static void stringMethodDemo_2() {
		
		String s = "张三.李四.王五";
		//String[] arr = s.split(",");  //字符串中的 ， 是中文的就拿中文的切
									    //split中要拿双引号括起来，不是单引号
		//String[] arr = s.split(".");  //不可以，因为.是正则表达式中的一个规则，如果想要用. 切割，要进行转义
		String[] arr = s.split("\\.");
		
		for(int i = 0;i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		String s1 = "a,b,c";
		char[] chs = s1.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);  //输出为a , b , c 五个字符
		}
		
		String s2 = "ab你";
		byte[] bytes = s2.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);   //输出为 97 98 -60 -29
		}
		
		System.out.println("Abc".toUpperCase());  //ABC
		
		System.out.println("java".replace('a', 'b'));  //jbvb
		String s3 = "java";
		String s4 = s3.replace('q', 'z');
		System.out.println(s3 == s4);  //true
		
		System.out.println("-"+" a b  c   d  ".trim()+"-"); // -a b  c   d-  去掉输出字符串首尾的空格
		
		System.out.println("abc".concat(s4)); //abcjava
		
		System.out.println(String.valueOf(4)+1); //41
		System.out.println(""+4+1);
	
		
	}

	private static void stringMethodDemo_1() {
		
		String s = "abcdae";
		
		System.out.println("length：" + s.length()); //6
		System.out.println("char:" + s.charAt(2)); //c
		//System.out.println("char:" + s.charAt(10)); //java.lang.StringIndexOutOfBoundsException
		System.out.println("index:" + s.indexOf('b')); //1
		System.out.println("index:" + s.indexOf('m')); //index:-1   可以根据是否为-1 来判断该字符或者字符串是否存在。
		System.out.println("lastIndex:" + s.lastIndexOf('a')); //4
		
		System.out.println("substring = " + s.substring(1, 3)); //substring = bc 不包含3角标对应的d
		
		
	}

}
