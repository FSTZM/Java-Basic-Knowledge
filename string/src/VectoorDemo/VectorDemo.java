package VectoorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		
		
		//Enumeration 接口的功能与Iterator接口的功能是重复的
		Enumeration enumeration = v.elements();
		while(enumeration.hasMoreElements()){
			System.out.println("enumeration:" + enumeration.nextElement());
		}
		
		//Iterator接口添加了一个可选的移除操作，并使用较短的方法名
		//新的方法应该Iterator而不是Enumeration
		Iterator it = v.iterator();
		while(it.hasNext()){
			System.out.println("iterator:" + it.next());
		}
		
	}

}
