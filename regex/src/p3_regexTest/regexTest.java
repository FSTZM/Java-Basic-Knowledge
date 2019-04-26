package p3_regexTest;

import java.util.TreeSet;

public class regexTest {

	public static void main(String[] args) {
		
		/*
		 * 1.���ƿڳԣ�����������Ҫѧ�����������Ŭ��
		 * 2.��IP��ַ����
		 * 3.���ʼ���ַУ��
		 * 
		 */

		test_2();
		
	}

	public static void test_2() {
		
		/*
		 * ip��ַ����
		 * 
		 * 192.168.10.34   127.0.0.1   3.3.3.3     105.70.11.55
		 */
		
		String ips = "192.168.10.34   127.0.0.1   3.3.3.3     105.70.11.55";
		
		ips = ips.replaceAll("( )\\1+", " ");//�ո�ȥ��
//		System.out.println(ips); //192.168.10.34 127.0.0.1 3.3.3.3 105.70.11.55

		ips = ips.replaceAll("(\\d+)", "00$1");//����
//		System.out.println(ips);
		
		ips = ips.replaceAll("0*(\\d{3})", "$1");//ֻ��������λ
//		System.out.println(ips);
		
		TreeSet<String> ts = new TreeSet<String>();
		
		String[] IPs = ips.split(" ");
		
		for(String ip : IPs){
			ts.add(ip);
		}
		
		for(String ip : ts){
			System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
		}
		
		
	}

	public static void test_1() {
		
		String str = "��..����..����Ҫѧ�������..������Ŭ��";
		
		str = str.replaceAll("\\.", "");
		str = str.replaceAll("(.)\\1+", "$1");
		
		System.out.println(str);
		
	}

}
