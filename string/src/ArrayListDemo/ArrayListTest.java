package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

import Person.been.Person;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		
		a1.add(new Person("haha1",11));
		a1.add(new Person("haha2",22));
		a1.add(new Person("haha3",33));
		a1.add(new Person("haha4",44));
		
		Iterator it = a1.iterator();
		while(it.hasNext()){
			
//			System.out.println(((Person) it.next()).getName() + ": " + ((Person) it.next()).getAge()); 
			//����Person,��Object���ͣ���˻ᷢ����������Ҫǿ������ת��
			//haha1: 22
			//haha3: 44  --- ȡ�˵�һ���˵����� �ڶ����˵�����,�ᱨ��
			
			
			//���Զ������ʱҪ����ǿת �����ӡ��������+��ϣֵ
			Person p = (Person)it.next();
			System.out.println(p.getName() + ": " + p.getAge());
			
			
		}

	}

}
