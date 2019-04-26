package HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;

import Person.been.Person;

/*
 * 往hashset集合中存储Person对象。如果姓名和年龄相同，视为同一个人。
 * 
 */

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		/*
		 * HashSet集合数据结构是哈希表，所以存储元素的时候，
		 * 使用的是元素的hashSet方法来确定位置，如果位置相同，在通过元素的equals来确定相同
		 */
		
		hs.add(new Person("su3",23));
		hs.add(new Person("su4",24));
		hs.add(new Person("su5",25));
		hs.add(new Person("su6",26));
		hs.add(new Person("su4",24));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getName() + "---" + p.getAge());
		}

	}

}
