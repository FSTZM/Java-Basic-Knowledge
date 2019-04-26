package ArrayListDemo;

import java.util.Arrays;
import java.util.List;

/*
 * 重点：List asList(数组)将数组转化成集合
 * 好处：可以使用集合的方法操作数组中的元素
 * 
 * 注意：数组的长度是固定的，所以对于集合的增删方法时不适用的，否则会异常
 * 
 */


public class asListDemo {

	public static void main(String[] args) {
			
		demo_2();

	}

	public static void demo_2() {
		
		/*
		 * 重点：
		 * 
		 * 如果数组中的元素是 --- 对象，那么转成集合时，直接将数组中的元素作为集合中的元素进行集合存储
		 * 
		 * 如果数组中的元素是 --- 基本类型数值，那么会将该数组作为集合中的元素进行存储。
		 * 
		 */
		
		int[] arr = {31,51,11,42};
		
		List<int[]> list = Arrays.asList(arr);
		
		System.out.println(list);    //[[I@15db9742]
		System.out.println(list.size());    // 1
		
		
	}

	public static void demo_1() {
		String[] arr = {"abc", "haha", "xixi"};
		
		List<String> list = Arrays.asList(arr);
//		boolean b = list.contains("xixi");
//		System.out.println("b=" + b);
		
//		list.add("heihei");
//		System.out.println(list);   // 抛出异常 java.lang.UnsupportedOperationException
		
		
	
	}

}
