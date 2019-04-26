package otherAPI_System;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {


	public static void main(String[] args) {
		
		/*
		 * System:类中的方法和属性都是静态的
		 * 
		 * 常见方法：
		 * long currentTimeMillis(); 返回以毫秒为单位的当前时间
		 * 
		 * 
		 */
		
//		long l1 = System.currentTimeMillis();
//		System.out.println(l1);  //1519130881963
//		
//		//code...
//		
//		long l2 = System.currentTimeMillis();
//		System.out.println(l2-l1);
		
		
		//行分隔符line.separtor
		
		System.out.println("hello" + System.lineSeparator() + "world");
		
		
		//demo_1();
		
	}
	
	public static void demo_1(){
		
		//获取系统的属性信息并存储到了Properties
		//Properties 没有泛型，取出有两种方法Map方法中的 keySet enteySet，但是这两种方法都有泛型
		
		/*
		 * properties集合中存储的都是String类型的键和值
		 * 最好使用它自己的存储和取出的方法来完成元素的操作
		 * 
		 */
		
		Properties prop = System.getProperties();
		
		Set<String> nameSet = prop.stringPropertyNames();
		
		for(String name : nameSet){
			String value = prop.getProperty(name);
			
			System.out.println(name + ":" + value);
		}
		
	}
	

}
