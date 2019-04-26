package TreeSetDemo;

/*
 * TreeSet --- 排序
 */
import java.util.Iterator;
import java.util.TreeSet;

import Person.been.Person;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		demo1();
		
		/*
		TreeSet ts = new TreeSet(new ComparatorByName());
		

		//以person的年龄大小排序
		
		
		ts.add(new Person("zhangsan",24));
		ts.add(new Person("lisi",27));
		ts.add(new Person("wangwu",24));
		ts.add(new Person("zhaoliu",25));
		
		Iterator it = ts.iterator();
		while(it.hasNext()){
			Person p = (Person)it.next();
			
			System.out.println(p.getName() + ": " + p.getAge());
		}
		
		*/

	}

	/**
	 * 对字符串长度进行排序
	 */
	public static void demo1() {
		TreeSet ts = new TreeSet(new ComparatorByLength());
		
		ts.add("abc");
		ts.add("bcddg");
		ts.add("a");
		ts.add("nba");
		ts.add("cbxa");
		
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
