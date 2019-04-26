package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		methodKeySet(map);

	}
	
	public static void methodKeySet(Map<Integer,String> map){
		
		map.put(8, "zhangsan");
		map.put(2, "lisi");
		map.put(7, "zhouwu");
		map.put(6, "youda");
		
		
		//方法三：
		//仅获取名字，用values方法
		
		Collection<String> value2 = map.values();
		Iterator it2 = value2.iterator();
		
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		
		
		/*
		 * 方法二：
		 * 
		 * 通过Map转成set就可以迭代。
		 * 找到了另一个方法  --- entrySet。
		 * 	    该方法将键和值得映射关系作为对象存储到了Set集合中
		 * 	    而这个映射关系的类型就是Map.Entry类型
		 */
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		
		while(it.hasNext()){
			
			Map.Entry<Integer, String> ma = it.next();
			
			Integer key = ma.getKey();
			String value = ma.getValue();
			
			System.out.println(key + ": " + value);
			
//			System.out.println(it.next());
		}
		
		
		
		
		
		/*
		 * 方法一：
		
		//取出map中的元素
		//原理：通过keyset方法获取map中所有键所在的set集合，通过set的迭代器获取到每一个键
		//在对每一个键通过map中的get方法获取其对应的值。
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()){
			
			//获取键
			Integer key = it.next();
			//获取值
			String value = map.get(2);
			
			System.out.println(key);  //2 6 7 8 
			System.out.println(value); //lisi
		}
		
		*/
		
	}
	
	
	
	
	//学号 姓名
	public static void method(Map<Integer,String> map){
		
		//添加元素
		System.out.println(map.put(8, "zhangsan"));  //null
		System.out.println(map.put(8, "lisi"));  //zhangsan
		System.out.println(map.put(9, "wangwu"));  //null
		
		System.out.println(map);  //  {8=lisi, 9=wangwu} 存相同的键，值会覆盖
		
		//删除
//		System.out.println("remove: " + map.remove(8));
		
		//判断
		System.out.println("contains: " + map.containsKey(8)); //contains: true
		
		//获取
		System.out.println("get: " + map.get(9)); //get: wangwu
		System.out.println("get: " + map.get(6)); //get: null
			
	}

}
