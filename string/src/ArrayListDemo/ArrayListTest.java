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
			//不加Person,是Object类型，因此会发生报错，所以要强制类型转换
			//haha1: 22
			//haha3: 44  --- 取了第一个人的姓名 第二个人的年龄,会报错
			
			
			//存自定义对象时要考虑强转 否则打印的是类型+哈希值
			Person p = (Person)it.next();
			System.out.println(p.getName() + ": " + p.getAge());
			
			
		}

	}

}
