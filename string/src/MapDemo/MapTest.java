package MapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * ��ϰ��
 * ��shibushisha�� ��ȡ���ַ����У�ÿһ����ĸ���ֵĴ���
 * Ҫ���ӡ����ǣ�a(����)b(����)...
 * 
 * ˼·��
 * ��ĸ�ʹ���֮�������ӳ���ϵ���������ֹ�ϵ�кܶ࣬�ܶ����Ҫ�洢���ܴ洢ӳ���ϵ�������������Map���ϡ�
 * 
 * ��ϵ������ --- û�У� �Ǿ�ʹ��Map���ϣ��ַ��ֿ��Ա�֤Ψһ�Ե�һ�����־߱�������
 * ���Կ���ʹ��TreeMap���ϡ�
 * 
 * 1. ��Ϊ���������ַ����е���ĸ�������Ƚ��ַ�������ַ�������
 * 2. �����ַ����飬��ÿһ����ĸ��Ϊ��ȥ��Map���������
 * 		�������ĸ�������ڣ��ͽ�����ĸ��Ϊ��1�洢��map������
 * 		�������ĸ���ڣ��ͽ�����ĸ����Ӧֵȡ����+1���ڽ�����ĸ��+1���ֵ�洢��map������
 * 	  ����ͬ�ͻḲ�ǣ������ͼ�¼�˸���ĸ�Ĵ���
 * 3. ����������map���Ͼͼ�¼��������ĸ���ֵĴ���
 * 
 */

public class MapTest {

	public static void main(String[] args) {
		
		String s = "shibushisha";
		
		String ans = getCharCount(s);
		
		System.out.println(ans);
	}

	public static String getCharCount(String s) {
		
		//���ַ�������ַ�������
		
		char[] ch = s.toCharArray();
		
		
		//����map���ϱ�
		
		Map<Character,Integer> ma = new TreeMap<Character,Integer>();
		
		//�������е���ĸ��Ϊ��ȥ��map��.��ĸ��Ϊ����������Ϊֵ
		
		for (int i = 0; i < ch.length; i++) {
			
			Integer value = ma.get(ch[i]);
			
			if (value == null) {
				ma.put(ch[i], 1);
			}else {
				ma.put(ch[i], value+1);
			}
			
		}

//		return ma.toString();   // {a=1, b=1, h=3, i=2, s=3, u=1}
		
		return mapToString(ma);
		
	}

	private static String mapToString(Map<Character, Integer> ma) {
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<Character> it = ma.keySet().iterator();
		
		while(it.hasNext()){
			
			Character key = it.next();
			Integer value = ma.get(key);
			
			sb.append(key + "(" + value + ")");
			
		}
		
		return sb.toString();  //a(1)b(1)h(3)i(2)s(3)u(1)

		
		
	}



}
