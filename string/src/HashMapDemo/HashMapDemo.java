package HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import Person.been.Person;

public class HashMapDemo {

	public static void main(String[] args) {
		
		/*
		 * 将学生对象和学生的归属地通过键与值存储到map集合中
		 * 
		 */
		HashMap<Person,String> hm = new HashMap<Person,String>();
		
		hm.put(new Person("zhangsan",28),"北京");
		hm.put(new Person("lisi",26),"上海");
		hm.put(new Person("zhaoli",29),"西安");
		hm.put(new Person("wangwu",24),"忻州");
		hm.put(new Person("lisi",26),"海南");
		
//		Set<Person> keyset = hm.keySet();
//		Iterator<Person> it = keyset.iterator();
		Iterator<Person> it = hm.keySet().iterator();
		
		while(it.hasNext()){
			Person key = it.next();
			String value = hm.get(key);
			
			System.out.println(key.getName() + ": " + key.getAge() + "   来自 : " + value);
		}
		

	}

}
