package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("abc1");
		a1.add("abc2");
		a1.add("abc4");
		a1.add("abc4");
		a1.add("abc3");
		a1.add("abc1");
		
		System.out.println(a1);
		
		a1 = getSingleElement(a1);
		System.out.println(a1);

	}

	public static ArrayList getSingleElement(ArrayList a1) {
		
		ArrayList temp = new ArrayList();
		
		Iterator it = a1.iterator();
		
		while(it.hasNext()){
			Object obj = it.next();
			
			if(!temp.contains(obj)){
				temp.add(obj);
			}
			
		}
		
		return temp;
		
	}

}
