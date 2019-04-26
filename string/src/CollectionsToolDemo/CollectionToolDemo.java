package CollectionsToolDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CollectionToolDemo {

	public static void main(String[] args) {
		
		/*
		 * Collections:�Ǽ��Ͽ�ܵĹ�����
		 * ����ķ������Ǿ�̬�ġ�
		 * 
		 * �ַ�������ʵ����comparable�ӿڡ�
		 * 
		 */
		
		demo_3();

	}
	
	
	public static void demo_3() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("abc");
		list.add("bcde");
		list.add("zz");
		
		
		
		System.out.println(list);
//		Collections.replaceAll(list, "abc", "su");//�滻 --- ��ָ��Ԫ���滻
//		Collections.fill(list, "su"); //�滻 --- ȫ��Ԫ���滻
		
		//shuffle ʹ��Ĭ�����Դ��ָ���б�����û���ϵ
		Collections.shuffle(list);
		
		System.out.println(list);
		
	}


	//����
	
	/*
	public static void demo_2()
	{
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				
				int temp = o2.compareTo(o1);

				return temp;
				
			}
		});
		
		ts.add("abc");
		ts.add("safd");
		ts.add("yrkhgs");
		ts.add("zsd");
		ts.add("idscd");
		
		System.out.println(ts);

	}
	*/
	
	

	public static void demo_2() {
		
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		//TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparaByLength()));
		
		ts.add("abc");
		ts.add("safd");
		ts.add("yrkhgs");
		ts.add("zsd");
		ts.add("idscd");
		
		System.out.println(ts);
		
		
		
	}


	public static void demo_1() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("una");
		list.add("sagj");
		list.add("dfsdgfa");
		list.add("gfd");
		list.add("zrhd");
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
