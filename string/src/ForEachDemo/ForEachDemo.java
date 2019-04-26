package ForEachDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		/*
		 * foreach语句：
		 * 格式：
		 * for(类型 变量：Collection集合|数组)
		 * {
		 * 		...
		 * }
		 * 
		 * 
		 * 传统for循环和高级for循环的区别？  --- 没有迭代器的都使用不了map集合
		 * 传统for可以完成对语句执行很多次，以为可以定义变量
		 * 
		 * 高级for循环是一种简化形式
		 * 它必须有被遍历的目标，该目标要么是数组，要么是Collection
		 * 
		 * 对数组的遍历如果仅仅是获取数组中的元素，可以使用高级for循环
		 * 如果要对数组的角标进行操作，用传统for循环。
		 * 
		 * 
		 */
		
		List<String> list = new ArrayList<String>();
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		
		//遍历集合
		for(String s : list){
			System.out.println(s);
		}
		
		//遍历数组
		
		int[] arr = {4,2,6,8};
		for(int i : arr){
			System.out.println(i);
		}
		
		//可以使用高级for遍历map集合吗？不能直接使用，但是可以将map转化成单列的set就可以用了
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(3, "zhangsan");
		map.put(2, "wangwu");
		map.put(1, "qianer");
		map.put(6, "lisi");
		
		for(Integer key : map.keySet()){
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		for(Map.Entry<Integer, String> me : map.entrySet()){
			Integer key = me.getKey();
			String value = me.getValue();
		} 
		
		
		
		/*
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
			
		
		

	}

}
