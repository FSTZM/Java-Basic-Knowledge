package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		methodKeySet(map);

	}
	
	public static void methodKeySet(Map<Integer,String> map){
		
		map.put(8, "zhangsan");
		map.put(2, "lisi");
		map.put(7, "zhouwu");
		map.put(6, "youda");
		
		
		//��������
		//����ȡ���֣���values����
		
		Collection<String> value2 = map.values();
		Iterator it2 = value2.iterator();
		
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		
		
		/*
		 * ��������
		 * 
		 * ͨ��Mapת��set�Ϳ��Ե�����
		 * �ҵ�����һ������  --- entrySet��
		 * 	    �÷���������ֵ��ӳ���ϵ��Ϊ����洢����Set������
		 * 	    �����ӳ���ϵ�����;���Map.Entry����
		 */
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		
		while(it.hasNext()){
			
			Map.Entry<Integer, String> ma = it.next();
			
			Integer key = ma.getKey();
			String value = ma.getValue();
			
			System.out.println(key + ": " + value);
			
//			System.out.println(it.next());
		}
		
		
		
		
		
		/*
		 * ����һ��
		
		//ȡ��map�е�Ԫ��
		//ԭ��ͨ��keyset������ȡmap�����м����ڵ�set���ϣ�ͨ��set�ĵ�������ȡ��ÿһ����
		//�ڶ�ÿһ����ͨ��map�е�get������ȡ���Ӧ��ֵ��
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()){
			
			//��ȡ��
			Integer key = it.next();
			//��ȡֵ
			String value = map.get(2);
			
			System.out.println(key);  //2 6 7 8 
			System.out.println(value); //lisi
		}
		
		*/
		
	}
	
	
	
	
	//ѧ�� ����
	public static void method(Map<Integer,String> map){
		
		//���Ԫ��
		System.out.println(map.put(8, "zhangsan"));  //null
		System.out.println(map.put(8, "lisi"));  //zhangsan
		System.out.println(map.put(9, "wangwu"));  //null
		
		System.out.println(map);  //  {8=lisi, 9=wangwu} ����ͬ�ļ���ֵ�Ḳ��
		
		//ɾ��
//		System.out.println("remove: " + map.remove(8));
		
		//�ж�
		System.out.println("contains: " + map.containsKey(8)); //contains: true
		
		//��ȡ
		System.out.println("get: " + map.get(9)); //get: wangwu
		System.out.println("get: " + map.get(6)); //get: null
			
	}

}
