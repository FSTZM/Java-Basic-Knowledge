package StringPractice;


/*
 * һ���Ӵ��������г��ֵĴ���
 * "abcusdabcojkabctfabcubsd"
 * 
 * 1 Ҫ�ҵ��Ӵ��Ƿ���� �������ȷ������ֵ�λ�ã�����ʹ��indexOf
 * 2 ����ҵ��ˣ���¼���ֵ�λ�ã�������ʣ����Ӵ��м���Ѱ��
 * 3 �Դ����ƣ�ͨ��ѭ����ɲ��ң�����Ҳ�������-1�������ҵ����ü�������¼
 * 
 */
public class StringTest_2 {

	public static void main(String[] args) {

		String str = "abcusdabcojkabctfabcubsd";
		String key = "abc";
		int count = getKeyCount(str,key);
		System.out.println("count = " + count);
	}

	public static int getKeyCount(String str, String key) {
		
		int count = 0;
		int index = 0;
		
		while((index = str.indexOf(key)) != -1){
			
			str = str.substring(index + key.length());
			count++;
		}
		return count;		
	
	}

}
