package TreeMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import Person.been.Person;
import TreeSetDemo.ComparatorByName;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Person,String> tm = new TreeMap<Person,String>(new ComparatorByName());
		
		tm.put(new Person("zhangsan",28),"北京");
		tm.put(new Person("lisi",26),"上海");
		tm.put(new Person("zhaoli",29),"西安");
		tm.put(new Person("wangwu",24),"忻州");
		tm.put(new Person("lisi",26),"海南");
		
		Iterator<Map.Entry<Person, String>> it = tm.entrySet().iterator();
		
		while(it.hasNext()){
			
			Map.Entry<Person, String> me = it.next();
			
			Person key = me.getKey();
			String value = me.getValue();
			
			System.out.println(key.getName() + ": " + key.getAge() + "   来自 : " + value);
			
			
		}

	}


}
