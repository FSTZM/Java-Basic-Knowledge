package StringPractice;

public class StringMethodDemo {

	public static void main(String[] args) {
		
		/*
		 * ������������˼����ַ������й��ܷ��ࡣ
		 * ��abcd��
		 * 
		 * 1.��ȡ��
		 * 1.1 ��ȡ�ַ������ַ��ĸ�����������
		 * 		int length();
		 * 1.2 ����λ�û�ȡ�ַ�
		 * 		char charAT(int index);
		 * 1.3 ����һ���ַ���ȡ���һ�γ��ֵ�λ��
		 * 		int indexOf(int ch)
		 * 		int indexOf(int ch,int fromIndex)  //��ָ����λ�ò���ch��һ�γ��ֵ�λ��
		 * 		int indexOf(String str)
		 * 		int indexOf(String str,int fromIndex)
		 * 	   ����һ���ַ�����ȡ���һ�γ��ֵ�λ��
		 * 		int lastIndexOf(int ch)
		 * 		int lastIndexOf(int ch,int fromIndex)  //��ָ����λ�ò���ch��һ�γ��ֵ�λ��
		 * 		int lastIndexOf(String str)
		 * 		int lastIndexOf(String str,int fromIndex)
		 * 1.4  ��ȡ�ַ����е�һ�����ַ�����Ҳ���Ӵ���
		 * 		String substring(int beginIndex,int endIndex)
		 * 		String substring(int beginIndex) //benginIndex - ��ʼ����(����)
		 * 										 //endIndex -- ����������
		 * 
		 * 2   ת��
		 * 		2.1 ���ַ�������ַ������飨�ַ������и
		 * 			String[] split(String regex)  //�漰��������ʽ
		 * 		2.2 ���ַ�������ַ����顣 -- �ַ�
		 * 			char[] toCharArray();
		 * 		2.3 ���ַ�������ֽ����顣 -- �ֽ�
		 * 			byte[] getByte()
		 * 		2.4 ���ַ����е���ĸת���ɴ�Сд��
		 * 			String toUpperCase(); ��д 
		 * 			String toLowerCase(); Сд
		 * 		2.5 ���ַ����е����ݽ����滻
		 * 			String replace(char oldChar,char newChar)
		 * 			String replace(String s1,String s2)
		 * 		2.6 ���ַ������˵Ŀո�ȥ��
		 * 			String trim();
		 * 		2.7 ���ַ����������ӡ�
		 * 			String concat();
		 * 
		 * 3   �ж�
		 * 		3.1 �����ַ��������Ƿ���ͬ��
		 * 			boolean equals��Object obj��
		 * 			boolean equalsIgnoreCase��string str��  ���Դ�д�Ƚ��ַ�������
		 * 		3.2 �ַ������Ƿ����ָ���ַ���
		 * 			boolean contains��string str��
		 * 		3.3 �ַ����Ƿ���ָ�����ַ�����ͷ/��β
		 * 			boolean startWith(string)
		 * 			boolean endsWith(string)
		 * 4  �Ƚ�
		 * 		4.1 
		 * 			
		 * 			
		 */
		stringMethodDemo_4();

	}

	private static void stringMethodDemo_4() {
		
		System.out.println("abc".compareTo("ABC"));  //32
		System.out.println("abc".compareTo("acd"));  //-1
		
	}

	private static void stringMethodDemo_3() {
		
		String s = "abc";
		System.out.println(s.equals("ABC"));  //false
		System.out.println(s.equals("ABC".toLowerCase()));  //true
		System.out.println(s.equalsIgnoreCase("ABC"));   //true ��Ч��һ�д���
		
		System.out.println(s.contains("a"));  //true
		
		String str = "Arraydemo.java";
		System.out.println(str.startsWith("Array"));
		System.out.println(str.endsWith("java"));
		System.out.println(str.concat("test"));
		
	}

	private static void stringMethodDemo_2() {
		
		String s = "����.����.����";
		//String[] arr = s.split(",");  //�ַ����е� �� �����ĵľ������ĵ���
									    //split��Ҫ��˫���������������ǵ�����
		//String[] arr = s.split(".");  //�����ԣ���Ϊ.��������ʽ�е�һ�����������Ҫ��. �иҪ����ת��
		String[] arr = s.split("\\.");
		
		for(int i = 0;i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		String s1 = "a,b,c";
		char[] chs = s1.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);  //���Ϊa , b , c ����ַ�
		}
		
		String s2 = "ab��";
		byte[] bytes = s2.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);   //���Ϊ 97 98 -60 -29
		}
		
		System.out.println("Abc".toUpperCase());  //ABC
		
		System.out.println("java".replace('a', 'b'));  //jbvb
		String s3 = "java";
		String s4 = s3.replace('q', 'z');
		System.out.println(s3 == s4);  //true
		
		System.out.println("-"+" a b  c   d  ".trim()+"-"); // -a b  c   d-  ȥ������ַ�����β�Ŀո�
		
		System.out.println("abc".concat(s4)); //abcjava
		
		System.out.println(String.valueOf(4)+1); //41
		System.out.println(""+4+1);
	
		
	}

	private static void stringMethodDemo_1() {
		
		String s = "abcdae";
		
		System.out.println("length��" + s.length()); //6
		System.out.println("char:" + s.charAt(2)); //c
		//System.out.println("char:" + s.charAt(10)); //java.lang.StringIndexOutOfBoundsException
		System.out.println("index:" + s.indexOf('b')); //1
		System.out.println("index:" + s.indexOf('m')); //index:-1   ���Ը����Ƿ�Ϊ-1 ���жϸ��ַ������ַ����Ƿ���ڡ�
		System.out.println("lastIndex:" + s.lastIndexOf('a')); //4
		
		System.out.println("substring = " + s.substring(1, 3)); //substring = bc ������3�Ǳ��Ӧ��d
		
		
	}

}
