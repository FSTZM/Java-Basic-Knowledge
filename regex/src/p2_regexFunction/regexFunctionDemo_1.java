package p2_regexFunction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexFunctionDemo_1 {

	public static void main(String[] args) {
		
		/*
		 * ������ʽ���ַ����ĳ�������
		 * 
		 * 1.ƥ��
		 * 		��ʵʹ�õ���String���е�matches����
		 * 
		 * 2.�и�
		 * 		��ʵʹ�õ���String���е�split����
		 * 
		 * 3.�滻
		 * 		��ʵʹ�õ���String����replaceAll()����
		 * 
		 * 4.��ȡ
		 * 		//�����������ж���ķ�װ
		 * 		Pattern p = Pattern.compile("a*b");
		 * 		//ͨ����������matcher�����ַ������������ȡҪ���ַ���������ƥ�������
		 * 		Matcher m = p.matcher("aaaaab");
		 * 		//ͨ��Matcherƥ��������ķ������ַ������в���
		 * 		boolean b = m.matches();
		 * 
		 */
		
		demo4();

	}

	public static void demo4() {
		
		String str = "da jia hao,ming tian zhou yi!";
		
		String regex = "\\b[a-z]{3}\\b"; //���ʱ߽�\\b
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		//ʹ��Matcher����ķ������ַ������в���
		//��ȻҪ��ȡ������ĸ��ɵĵ���
		//����     find();
		
		while(m.find()){ //Ѱ����û������������ʽ�ĵ���
			System.out.print(m.group());
			
			System.out.print("   " + m.start() + ":" + m.end());
			
			System.out.println();
		}
		
	}

	public static void demo3() {
		
		String str = "zhangsantttlisihhhwangwuwwwwwwsu";
		
		String tel = "15691958875";
		
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1*_*$2");
		
//		str = str.replaceAll("(.)\\1+", "$1"); //�����ʹ��ǰ����ַ� ����Ԫ����
//		str = str.replaceAll("(.)\\1+", "#");//zhangsan#lisi#wangwu#su
		
		System.out.println(tel);
		
	}

	public static void demo2() {
		
		String str = "zhangsan     lisi      wangwu  su";
		
		String[] names = str.split("(.)\\1+");//(.)  .���������ַ���(.)����һ�飬\\1�����һ�飬+����ֹһ��
				str.split("\\.");//��.����
				str.split(" +");  //��ֹһ���ո� 
		
		
		for(String name : names){
			System.out.println(name);
		}
		
//		String[] names = str.split(" ");
//		
//		for(String name : names){
//			System.out.println(name);
//		}
		
	}

	/*
	 * ��ʾƥ��
	 */
	public static void demo1(){
		
		//ƥ���ֻ������Ƿ���ȷ
		String tel = "15691958875";
		
		String regex = "1[356789][1-9]{9}";  //[0-9]���Լ򻯳�\d
		
		boolean b = tel.matches(regex);
		System.out.println(tel+":" +b);
		
	}
	
}
