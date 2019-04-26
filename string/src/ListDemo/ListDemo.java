package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		
		//添加元素
		list.add("abc");
		list.add("abc1");
		list.add("abc2");
		
//		System.out.println(list);//[abc, abc1, abc2]
		
		//指定位置
//		list.add(0, "su");
		
		//删除元素
//		list.remove(2);
		
		//修改元素
//		System.out.println("set：" + list.set(1, "yu"));  //注意 返回的是将要被替换的值
		
		//获取元素
//		System.out.println("get:" + list.get(0)); //abc
		
		//获取子列表
//		System.out.println("sublist:" + list.subList(1,2)); //sublist:[abc1]
		
		
		System.out.println(list);//[su, abc, abc1, abc2]
		
	}

}
