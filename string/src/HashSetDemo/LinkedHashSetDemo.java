package HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * 有序 --- LinkedHashSet
 * 需要唯一 --- set
 */

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new LinkedHashSet();
		
		hs.add("haha2");
		hs.add("haha1");
		hs.add("haha4");
		hs.add("haha3");
		hs.add("haha4");
		
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

	}

}
