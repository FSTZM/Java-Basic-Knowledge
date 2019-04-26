package CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		
//		Collection coll = new ArrayList();		
//		show(coll);
		
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1,c2);
		
		
	}
	
	public static void show(Collection c1,Collection c2){
		//1. c1添加元素 add
		c1.add("su");
		c1.add("yu");
		c1.add("qin");
		//1. c2添加元素 add
		c2.add("su");
		c2.add("fu");
		c2.add("jun");
		
		
		c1.removeAll(c2);
		System.out.println("c1:" + c1);
		
		
		
		
		
	}
	
	
	public static void show(Collection coll){
		
		//1. 添加元素 add
		coll.add("su");
		coll.add("yu");
		coll.add("qin");
		
		//2. 删除元素 remove
		coll.remove("qin");  //改变集合的长度
		coll.remove("u");    //只能删除之前添加过的整体，无法删除一部分 输出为[su, yu]
		
		//清空集合
//		coll.clear();  //输出[]
		
		System.out.println(coll.contains("su"));
		
		System.out.println(coll);  //[su, yu, qin]   是一串字符串 不是数组 不能“取”
		
	}

}
