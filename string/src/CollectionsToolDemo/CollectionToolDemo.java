package CollectionsToolDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CollectionToolDemo {

	public static void main(String[] args) {
		
		/*
		 * Collections:是集合框架的工具类
		 * 里面的方法都是静态的。
		 * 
		 * 字符串本身实现了comparable接口。
		 * 
		 */
		
		demo_3();

	}
	
	
	public static void demo_3() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("abc");
		list.add("bcde");
		list.add("zz");
		
		
		
		System.out.println(list);
//		Collections.replaceAll(list, "abc", "su");//替换 --- 将指定元素替换
//		Collections.fill(list, "su"); //替换 --- 全部元素替换
		
		//shuffle 使用默认随机源对指定列表进行置换关系
		Collections.shuffle(list);
		
		System.out.println(list);
		
	}


	//倒序
	
	/*
	public static void demo_2()
	{
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				
				int temp = o2.compareTo(o1);

				return temp;
				
			}
		});
		
		ts.add("abc");
		ts.add("safd");
		ts.add("yrkhgs");
		ts.add("zsd");
		ts.add("idscd");
		
		System.out.println(ts);

	}
	*/
	
	

	public static void demo_2() {
		
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		//TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparaByLength()));
		
		ts.add("abc");
		ts.add("safd");
		ts.add("yrkhgs");
		ts.add("zsd");
		ts.add("idscd");
		
		System.out.println(ts);
		
		
		
	}


	public static void demo_1() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("una");
		list.add("sagj");
		list.add("dfsdgfa");
		list.add("gfd");
		list.add("zrhd");
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
