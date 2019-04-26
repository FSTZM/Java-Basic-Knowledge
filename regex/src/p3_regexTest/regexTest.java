package p3_regexTest;

import java.util.TreeSet;

public class regexTest {

	public static void main(String[] args) {
		
		/*
		 * 1.治疗口吃：我我我我我要学编程在在在在努力
		 * 2.对IP地址排序
		 * 3.对邮件地址校验
		 * 
		 */

		test_2();
		
	}

	public static void test_2() {
		
		/*
		 * ip地址排序
		 * 
		 * 192.168.10.34   127.0.0.1   3.3.3.3     105.70.11.55
		 */
		
		String ips = "192.168.10.34   127.0.0.1   3.3.3.3     105.70.11.55";
		
		ips = ips.replaceAll("( )\\1+", " ");//空格去掉
//		System.out.println(ips); //192.168.10.34 127.0.0.1 3.3.3.3 105.70.11.55

		ips = ips.replaceAll("(\\d+)", "00$1");//补零
//		System.out.println(ips);
		
		ips = ips.replaceAll("0*(\\d{3})", "$1");//只保留后三位
//		System.out.println(ips);
		
		TreeSet<String> ts = new TreeSet<String>();
		
		String[] IPs = ips.split(" ");
		
		for(String ip : IPs){
			ts.add(ip);
		}
		
		for(String ip : ts){
			System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
		}
		
		
	}

	public static void test_1() {
		
		String str = "我..我我..我我要学编程在在..在在在努力";
		
		str = str.replaceAll("\\.", "");
		str = str.replaceAll("(.)\\1+", "$1");
		
		System.out.println(str);
		
	}

}
