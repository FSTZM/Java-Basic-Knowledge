package StringBuffer;

/*
 * StringBuilder
 * StringBuilder �� stringbuffer �÷�һģһ��
 * ����StringBuilder ����֤ͬ�� �ٶȿ� 1.5�汾JDK���֣�StringBuffer ��֤��ȫ����֤ͬ��
 * 
 * һ���߳�������ݣ�һ���߳�ɾ�����ݣ�ɾ�������ֻ����һ�������У����ʱ����ɾ����ɾ��ʱ������ӣ��������ְ�ȫ����
 * 
 * ��ͬ��
 *		StringBuffer���߳�ͬ���ģ�ͨ�������߳�
 *		StringBuilder���̲߳�ͬ���ģ�ͨ�����ڵ��̣߳����ĳ������Ч��
 * 
 */

//��һ��int�������ַ���
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		int[] arr = {3,1,37,4,2,7,6};
		String s = intToString(arr);
		System.out.println(s);
		
	}

	public static String intToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				sb.append(arr[i] + ", ");
			}
			else{
				sb.append(arr[i] + "]");
			}
				
		}
		
		return sb.toString();
		
	}

}
