package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		
		//���Ԫ��
		list.add("abc");
		list.add("abc1");
		list.add("abc2");
		
//		System.out.println(list);//[abc, abc1, abc2]
		
		//ָ��λ��
//		list.add(0, "su");
		
		//ɾ��Ԫ��
//		list.remove(2);
		
		//�޸�Ԫ��
//		System.out.println("set��" + list.set(1, "yu"));  //ע�� ���ص��ǽ�Ҫ���滻��ֵ
		
		//��ȡԪ��
//		System.out.println("get:" + list.get(0)); //abc
		
		//��ȡ���б�
//		System.out.println("sublist:" + list.subList(1,2)); //sublist:[abc1]
		
		
		System.out.println(list);//[su, abc, abc1, abc2]
		
	}

}
