package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

	public static void main(String[] args) {
		
		/*
		 * ����ת��������
		 * 
		 * ʹ�õľ���Collection�ӿ��е�toArray����
		 * 
		 * ����ת�������飺���ԶԼ����е�Ԫ�ز����ķ��������޶�����������������ɾ
		 * 
		 */
		
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		/*
		 * toArray������Ҫ����һ��ָ�����͵��������͵����顣
		 * ���ȸ���ζ����أ�
		 * �������С�ڼ��ϵ�size����ô�÷����ͻᴴ��һ��ͬ���Ͳ��ͼ�����ͬsize������
		 * ������ȴ��ڼ��ϵ�size����ô�÷����ͻ�ʹ��ָ�������飬�洢�����е�Ԫ�أ�����λ��Ĭ��Ϊnull
		 * 
		 * ���Խ��飬��󳤶�ָ��Ϊ�����ϵ�size��
		 * 
		 */
		
//		String[] arr = list.toArray(new String[2]);//[abc1, abc2, abc3]
		String[] arr = list.toArray(new String[5]);//[abc1, abc2, abc3, null, null]
		System.out.println(Arrays.toString(arr));
		

	}

}
