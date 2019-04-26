package HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import Person.been.Person;

public class HashMapDemo {

	public static void main(String[] args) {
		
		/*
		 * ��ѧ�������ѧ���Ĺ�����ͨ������ֵ�洢��map������
		 * 
		 */
		HashMap<Person,String> hm = new HashMap<Person,String>();
		
		hm.put(new Person("zhangsan",28),"����");
		hm.put(new Person("lisi",26),"�Ϻ�");
		hm.put(new Person("zhaoli",29),"����");
		hm.put(new Person("wangwu",24),"����");
		hm.put(new Person("lisi",26),"����");
		
//		Set<Person> keyset = hm.keySet();
//		Iterator<Person> it = keyset.iterator();
		Iterator<Person> it = hm.keySet().iterator();
		
		while(it.hasNext()){
			Person key = it.next();
			String value = hm.get(key);
			
			System.out.println(key.getName() + ": " + key.getAge() + "   ���� : " + value);
		}
		

	}

}
