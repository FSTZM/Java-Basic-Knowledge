package HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();   //保证唯一，不保证有序，根据自己的算法输出的
		
		
		
		hs.add("hehe");
		hs.add("haha");
		hs.add("xixi");
//		hs.add("haha1");
//		hs.add("haha2");
//		hs.add("haha3");
//		hs.add("haha2");
//		hs.add("haha3");
//		hs.add("haha3");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
