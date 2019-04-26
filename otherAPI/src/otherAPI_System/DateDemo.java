package otherAPI_System;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		method_3();

	}

	/**
	 * 将日期对象进行格式化
	 * 将日期对象 ---> 日期格式的字符串
	 * 		使用的是DateFormat类中的format方法。
	 * 
	 * 将日期格式的字符串--->日期对象
	 * 		使用的是DateFormat类中的prase方法。
	 * @throws ParseException 
	 */
	
	public static void method_3() throws ParseException {
		
		String str_date = "2018-2-22";
		str_date = "2018---2---27";
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		dateFormat = new SimpleDateFormat("yyyy---MM---dd");
		
		Date date = dateFormat.parse(str_date);
		
		System.out.println(date);
	}
	
	public static void method_2() {
	
		Date date = new Date();
		
		//获取日期格式 默认格式
//		DateFormat dateFormat = DateFormat.getDateInstance();
//		String str_date = dateFormat.format(date);
//		System.out.println(str_date); //2018-2-22
		
		//2018-2-22 20:25:30
//		DateFormat dateFormat = DateFormat.getDateTimeInstance();
//		String str_date = dateFormat.format(date);
//		System.out.println(str_date); //2018-2-22 20:25:30
		
		//FULL LONG可以指定风格
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		String str_date = dateFormat.format(date);
		System.out.println(str_date); //2018年2月22日 星期四
		
	
	}

	/**
	 * 对日期对象进行格式化
	 * 
	 * 
	 */
	
	
	public static void method_1() {
		/**
		 * 日起对象和毫秒值之间的转换。
		 * 
		 * 毫秒值->日期对象
		 * 		1.通过Date对象的构造方法 new Date(timeMillis);
		 * 		2.还可以通过setTime设置。
		 * 		因为可以通过Date对象的方法对该日期中的各个字段(年月日等)进行操作
		 * 
		 * 日期对象->毫秒值
		 * 		1.getTime方法
		 * 		因为可以通过具体的数值进行运算。
		 * 
		 * 
		 * parse()返回的是一个Date类型数据，format返回的是一个StringBuffer类型的数据
		 * //SimpleDateFormat中的parse方法可以  
		 * //把String型的字符串转换成特定格式的date类型 
		 * 
		 */
		
		
		long time = System.currentTimeMillis();//将当前日期和时间封装成Date对象
		System.out.println(time); //1519224107402
		
		Date date = new Date();
		System.out.println(date); //Wed Feb 21 22:41:47 CST 2018
		
		Date date2 = new Date(1519224107402l);  //将指定毫秒值封装成Date对象
		/*
		 * Date date2 = new Date(1519224107402); 长度会超出范围，在数据后面加一个“l/L”
		 */
		System.out.println(date2);
	}

}
