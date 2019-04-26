package LinkedListDemo;

import java.util.LinkedList;

/*
 * ��ʹ��LinkedList��ģ��һ����ջ�Ͷ���
 * 
 * ��ջ���Ƚ����	FILO
 * 
 * ���У��Ƚ��ȳ�	FIFO
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



