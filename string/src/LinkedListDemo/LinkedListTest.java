package LinkedListDemo;

import java.util.LinkedList;

/*
 * 请使用LinkedList来模拟一个堆栈和队列
 * 
 * 堆栈：先进后出	FILO
 * 
 * 队列：先进先出	FIFO
 * 
 * 
 */

public class LinkedListTest {

	public static void main(String[] args) {
		
//		LinkedList link = new LinkedList();
//		
//		link.addFirst("abc1");
//		link.addFirst("abc2");
//		link.addFirst("abc3");
//		link.addFirst("abc4");
//		
//		System.out.println(link);
		
		Duilie d = new Duilie();
		
		d.myAdd("abc1");
		d.myAdd("abc2");
		d.myAdd("abc3");
		
		while(!d.isNull()){
			System.out.println(d.myGet());
		}
		
		
		

	}

}

class Duilie{
	
	private LinkedList link;
	
	Duilie(){
		link = new LinkedList();
	}
	
	public void myAdd(Object obj){
		link.add(obj);
	}
	
	public Object myGet(){
		return link.removeFirst();
	}
	
	public boolean isNull(){
		return link.isEmpty();
	}
	
}



