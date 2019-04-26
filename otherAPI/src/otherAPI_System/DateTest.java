package otherAPI_System;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 练习：
 * “1995-2-27”到“2018-2-22”有多少天
 * 
 * 思路：
 * 两个日期相减！
 * 必须要有两个可以进行减法运算的数  --- 能相减的可以使毫秒值
 * 如何获取毫秒值？ --- 通过date对象！
 * 如何获取date对象？可以将字符串转化成date对象
 * 
 * 1.将日期格式的字符转成date对象
 * 2.将date对象转化成毫秒值
 * 3.相减，变成天数。
 * 
 */


public class DateTest {

	public static void main(String[] args) throws ParseException {
		
		String str_date1 = "1995-2-27";
		String str_date2 = "2018-2-22";
		
		test(str_date1,str_date2);

	}

	public static void test(String str_date1,String str_date2) throws ParseException {
		
		DateFormat dateFormat = DateFormat.getInstance();//DateFormat 的作用是 格式化并解析“日期/时间”。
														//实际上，它是Date的格式化工具，它能帮助我们格式化Date
														//进而将Date转换成我们想要的String字符串供我们使用
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");//SimpleDateFormat 是一个格式化Date 以及 解析日期字符串 的工具。
														//它的最常用途是，能够按照指定的格式来对Date进行格式化
														//然后我们使用可以格式化Date后得到的字符串
		
		Date date1 = dateFormat.parse(str_date1);
		Date date2 = dateFormat.parse(str_date2);
		
//		System.out.println(date1); //Mon Feb 27 00:00:00 CST 1995
		
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		
		long time = Math.abs(time1 - time2);
		
		int year = getDay(time);
		
		System.out.println(year);
	}

	public static int getDay(long time) {
		
		int year = (int)(time/1000/60/60/24/365);
		
		return year;
		
	}

}
