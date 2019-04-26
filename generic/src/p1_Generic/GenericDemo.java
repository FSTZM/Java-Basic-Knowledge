package p1_Generic;

import java.util.Iterator;
import java.util.TreeSet;

import p2_Generic.been.Person;
import p3_Comparator.ComparatorByName;

/*
 * ����������ʱ�����ȷ����
 */

public class GenericDemo {

	public static void main(String[] args) {
		
		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
		
		ts.add(new Person("lisi",21));
		ts.add(new Person("zhangsan",27));
		ts.add(new Person("zhaoliu",29));
		ts.add(new Person("wangwu",22));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getName());
		}
		

	}

}
