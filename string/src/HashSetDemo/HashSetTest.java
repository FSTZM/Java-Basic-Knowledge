package HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;

import Person.been.Person;

/*
 * ��hashset�����д洢Person�������������������ͬ����Ϊͬһ���ˡ�
 * 
 */

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		/*
		 * HashSet�������ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
		 * ʹ�õ���Ԫ�ص�hashSet������ȷ��λ�ã����λ����ͬ����ͨ��Ԫ�ص�equals��ȷ����ͬ
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
