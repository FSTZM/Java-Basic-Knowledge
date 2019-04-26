package p2_regexFunction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexFunctionDemo_1 {

	public static void main(String[] args) {
		
		/*
		 * 正则表达式对字符串的常见操作
		 * 
		 * 1.匹配
		 * 		其实使用的是String类中的matches方法
		 * 
		 * 2.切割
		 * 		其实使用的是String类中的split方法
		 * 
		 * 3.替换
		 * 		其实使用的是String类中replaceAll()方法
		 * 
		 * 4.获取
		 * 		//将正则规则进行对象的封装
		 * 		Pattern p = Pattern.compile("a*b");
		 * 		//通过正则对象的matcher方法字符串相关联，获取要对字符串操作的匹配其对象
		 * 		Matcher m = p.matcher("aaaaab");
		 * 		//通过Matcher匹配器对象的方法对字符串进行操作
		 * 		boolean b = m.matches();
		 * 
		 */
		
		demo4();

	}

	public static void demo4() {
		
		String str = "da jia hao,ming tian zhou yi!";
		
		String regex = "\\b[a-z]{3}\\b"; //单词边界\\b
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		//使用Matcher对象的方法对字符串进行操作
		//既然要获取三个字母组成的单词
		//查找     find();
		
		while(m.find()){ //寻找有没有满足正则表达式的单词
			System.out.print(m.group());
			
			System.out.print("   " + m.start() + ":" + m.end());
			
			System.out.println();
		}
		
	}

	public static void demo3() {
		
		String str = "zhangsantttlisihhhwangwuwwwwwwsu";
		
		String tel = "15691958875";
		
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1*_*$2");
		
//		str = str.replaceAll("(.)\\1+", "$1"); //后面的使用前面的字符 用美元符号
//		str = str.replaceAll("(.)\\1+", "#");//zhangsan#lisi#wangwu#su
		
		System.out.println(tel);
		
	}

	public static void demo2() {
		
		String str = "zhangsan     lisi      wangwu  su";
		
		String[] names = str.split("(.)\\1+");//(.)  .代表任意字符，(.)代表一组，\\1代表第一组，+代表不止一组
				str.split("\\.");//用.来切
				str.split(" +");  //不止一个空格 
		
		
		for(String name : names){
			System.out.println(name);
		}
		
//		String[] names = str.split(" ");
//		
//		for(String name : names){
//			System.out.println(name);
//		}
		
	}

	/*
	 * 演示匹配
	 */
	public static void demo1(){
		
		//匹配手机号码是否正确
		String tel = "15691958875";
		
		String regex = "1[356789][1-9]{9}";  //[0-9]可以简化成\d
		
		boolean b = tel.matches(regex);
		System.out.println(tel+":" +b);
		
	}
	
}
