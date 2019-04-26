package CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		
//		Collection coll = new ArrayList();		
//		show(coll);
		
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1,c2);
		
		
	}
	
	public static void show(Collection c1,Collection c2){
		//1. c1���Ԫ�� add
		c1.add("su");
		c1.add("yu");
		c1.add("qin");
		//1. c2���Ԫ�� add
		c2.add("su");
		c2.add("fu");
		c2.add("jun");
		
		
		c1.removeAll(c2);
		System.out.println("c1:" + c1);
		
		
		
		
		
	}
	
	
	public static void show(Collection coll){
		
		//1. ���Ԫ�� add
		coll.add("su");
		coll.add("yu");
		coll.add("qin");
		
		//2. ɾ��Ԫ�� remove
		coll.remove("qin");  //�ı伯�ϵĳ���
		coll.remove("u");    //ֻ��ɾ��֮ǰ��ӹ������壬�޷�ɾ��һ���� ���Ϊ[su, yu]
		
		//��ռ���
//		coll.clear();  //���[]
		
		System.out.println(coll.contains("su"));
		
		System.out.println(coll);  //[su, yu, qin]   ��һ���ַ��� �������� ���ܡ�ȡ��
		
	}

}
