package ForEachDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		/*
		 * foreach��䣺
		 * ��ʽ��
		 * for(���� ������Collection����|����)
		 * {
		 * 		...
		 * }
		 * 
		 * 
		 * ��ͳforѭ���͸߼�forѭ��������  --- û�е������Ķ�ʹ�ò���map����
		 * ��ͳfor������ɶ����ִ�кܶ�Σ���Ϊ���Զ������
		 * 
		 * �߼�forѭ����һ�ּ���ʽ
		 * �������б�������Ŀ�꣬��Ŀ��Ҫô�����飬Ҫô��Collection
		 * 
		 * ������ı�����������ǻ�ȡ�����е�Ԫ�أ�����ʹ�ø߼�forѭ��
		 * ���Ҫ������ĽǱ���в������ô�ͳforѭ����
		 * 
		 * 
		 */
		
		List<String> list = new ArrayList<String>();
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		
		//��������
		for(String s : list){
			System.out.println(s);
		}
		
		//��������
		
		int[] arr = {4,2,6,8};
		for(int i : arr){
			System.out.println(i);
		}
		
		//����ʹ�ø߼�for����map�����𣿲���ֱ��ʹ�ã����ǿ��Խ�mapת���ɵ��е�set�Ϳ�������
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(3, "zhangsan");
		map.put(2, "wangwu");
		map.put(1, "qianer");
		map.put(6, "lisi");
		
		for(Integer key : map.keySet()){
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		for(Map.Entry<Integer, String> me : map.entrySet()){
			Integer key = me.getKey();
			String value = me.getValue();
		} 
		
		
		
		/*
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
			
		
		

	}

}
