package ArrayListDemo;

import java.util.Arrays;
import java.util.List;

/*
 * �ص㣺List asList(����)������ת���ɼ���
 * �ô�������ʹ�ü��ϵķ������������е�Ԫ��
 * 
 * ע�⣺����ĳ����ǹ̶��ģ����Զ��ڼ��ϵ���ɾ����ʱ�����õģ�������쳣
 * 
 */


public class asListDemo {

	public static void main(String[] args) {
			
		demo_2();

	}

	public static void demo_2() {
		
		/*
		 * �ص㣺
		 * 
		 * ��������е�Ԫ���� --- ������ôת�ɼ���ʱ��ֱ�ӽ������е�Ԫ����Ϊ�����е�Ԫ�ؽ��м��ϴ洢
		 * 
		 * ��������е�Ԫ���� --- ����������ֵ����ô�Ὣ��������Ϊ�����е�Ԫ�ؽ��д洢��
		 * 
		 */
		
		int[] arr = {31,51,11,42};
		
		List<int[]> list = Arrays.asList(arr);
		
		System.out.println(list);    //[[I@15db9742]
		System.out.println(list.size());    // 1
		
		
	}

	public static void demo_1() {
		String[] arr = {"abc", "haha", "xixi"};
		
		List<String> list = Arrays.asList(arr);
//		boolean b = list.contains("xixi");
//		System.out.println("b=" + b);
		
//		list.add("heihei");
//		System.out.println(list);   // �׳��쳣 java.lang.UnsupportedOperationException
		
		
	
	}

}
