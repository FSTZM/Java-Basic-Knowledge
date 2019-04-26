package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		show(list);
		
	}

	public static void show(List list) {
		
		list.add("su");
		list.add("yu");
		list.add("qin");
		
		ListIterator it = list.listIterator(); //获取列表迭代器对象，只有list集合具备该迭代功能
		
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("su"))
				it.add("haha");
//				it.set("haha"); //
		}
		System.out.println( "list:" + list);
		
		
		
		
		
//		Iterator it = list.iterator();
//		while(it.hasNext()){
//			System.out.println("next:" + it.next());
//		}
//		
//		//list
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("get:" + list.get(i));
//			
//		}
		
	}

}
