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
		
		
		//Enumeration �ӿڵĹ�����Iterator�ӿڵĹ������ظ���
		Enumeration enumeration = v.elements();
		while(enumeration.hasMoreElements()){
			System.out.println("enumeration:" + enumeration.nextElement());
		}
		
		//Iterator�ӿ������һ����ѡ���Ƴ���������ʹ�ý϶̵ķ�����
		//�µķ���Ӧ��Iterator������Enumeration
		Iterator it = v.iterator();
		while(it.hasNext()){
			System.out.println("iterator:" + it.next());
		}
		
	}

}
