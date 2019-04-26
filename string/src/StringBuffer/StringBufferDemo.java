package StringBuffer;

/*
 * StringBuffer �� ����һ�������ַ����ַ�����������ʼ����Ϊ16���ַ�
 * �ص㣺
 * 		1. StringBuffer�ǿɱ䳤�ȵ�
 * 		2. ���Դ洢��ͬ���͵�����
 * 		3. ����Ҫת�����ַ�������ʹ��
 * 		4. ���Զ��ַ��������޸�
 * ���ܣ�
 * 		1. ���
 * 			append(date)  ���صĻ���StringBuffer
 * 			insert(index data) 
 * 		2. ɾ��
 * 			StringBuffer delete(start,end)  ����ͷ������β
 * 			StringBuffer deleteCharAt(int index) ɾ��ָ��λ�õ�Ԫ��
 * 			
 * 			��ջ�����   s.delete(0,s.length());
 * 		3. ����
 * 			char charAt(index);
 * 			int indexOf(string);
 * 			int lastIndexOf(index);
 * 		4. �޸�
 * 			StringBuffer replace(start,end,string);
 * 			void setCharAt(index .char);
 * 		5. ���ó���
 * 			StringBuffer setLength(length);
 * 		6. ��ת�ַ���
 * 			StringBuffer reverse();
 * 
 */



public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		
		s.append("abcsuyuqin");
		System.out.println("s = " + s);
		
		s.delete(0, 3);
		System.out.println("s = " + s);
		
		s.charAt(0);
		System.out.println(s.charAt(0));
		
		int index = s.indexOf("s");
		System.out.println(index);
		
		StringBuffer s1 = s.replace(4, 6, " ");
		System.out.println("s1 = " + s1);  //s1 = suyu n
		
		System.out.println(s.reverse());   //n uyus  stringbuffer�Ѿ���S1������
		
		

	}

}
