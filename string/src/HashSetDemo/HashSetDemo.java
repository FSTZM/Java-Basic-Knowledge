package HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();   //��֤Ψһ������֤���򣬸����Լ����㷨�����
		
		
		
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
