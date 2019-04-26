package LinkedHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		
		hm.put(7, "zhangsan");
		hm.put(5, "wangwu");
		hm.put(6, "zhaliu");
		hm.put(2, "lisi");
		
		Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<Integer, String> me = it.next();
			
			Integer key = me.getKey();
			String value = me.getValue();
			
			System.out.println(key + ": " + value);  //µ±HashMap<Integer,String> hm = new HashMap<Integer,String>();
													 //Êä³ö   2: lisi
//															5: wangwu
//															6: zhaliu
//															7: zhangsan
			
			//LinkedHashMapÊä³ö   7: zhangsan
//								5: wangwu
//								6: zhaliu
//								2: lisi
			
		}

	}

}
