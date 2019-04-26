package p1_regex;

public class regexDemo {
	
	/*
	 * ������ʽ
	 * 
	 * ������ʽ���ڲ����ַ�������
	 * ͨ��һЩ�ض��ķ��������ֵ�
	 * ��������Ϊ������������ʽ������ҪѧϰһЩ����
	 * ��Ȼ���� �����Ķ��Բ�
	 */

	public static void main(String[] args) {
		
		String s = "980366719";
//		checkQQ(s);
		
		String regex = "[1-9][0-9]{4,14}"; //������ʽ 4��14��
		
		boolean b = s.matches(regex);
		System.out.println(s + ":" + b);
		
	}
	
	/*
	 * ���󣺶���һ�����ܶ�QQ�Ž���У��
	 * Ҫ�󣺳���5~15��ֻ�������֣�0���ܿ�ͷ
	 */
	public static void checkQQ(String qq){
		
		int len = qq.length();
		
		if(len >= 5 && len <= 15){
			if(!qq.startsWith("0")){
				try{
					long l = Long.parseLong(qq);
					System.out.println(l + ":��ȷ");
				}catch(NumberFormatException e){
					System.out.println(qq + ":���зǷ��ַ�");
				}
				
			}else{
				System.out.println(qq + ":������0��ͷ");
			}
			
			
		}else{
			System.out.println(qq + "���Ȳ�����");
		}
		
		
	}
	

}
