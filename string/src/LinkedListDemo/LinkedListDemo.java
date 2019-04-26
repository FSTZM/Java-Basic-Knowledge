package LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList link = new LinkedList();
		
//		link.add("abc1");
//		link.add("abc2");
//		link.add("abc3");
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		
//		System.out.println(link.getFirst()); //3 获取第一个但是不删除
//		System.out.println(link.getFirst()); //3
		
//		System.out.println(link.removeFirst()); //3  获取但是会删除 
//		System.out.println(link.removeFirst()); //2
//		System.out.println(link);  //[abc1]
		
		while(!link.isEmpty()){
			System.out.println(link.removeFirst());
		}
		
//		Iterator it = link.iterator();
//		
//		while(it.hasNext()){
//			System.out.println(it.next()); //link:1 2 3
//										   //linked:3 2 1 
//		}
		
		
		
		
	}

}
