package otherAPI_System;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {


	public static void main(String[] args) {
		
		/*
		 * System:���еķ��������Զ��Ǿ�̬��
		 * 
		 * ����������
		 * long currentTimeMillis(); �����Ժ���Ϊ��λ�ĵ�ǰʱ��
		 * 
		 * 
		 */
		
//		long l1 = System.currentTimeMillis();
//		System.out.println(l1);  //1519130881963
//		
//		//code...
//		
//		long l2 = System.currentTimeMillis();
//		System.out.println(l2-l1);
		
		
		//�зָ���line.separtor
		
		System.out.println("hello" + System.lineSeparator() + "world");
		
		
		//demo_1();
		
	}
	
	public static void demo_1(){
		
		//��ȡϵͳ��������Ϣ���洢����Properties
		//Properties û�з��ͣ�ȡ�������ַ���Map�����е� keySet enteySet�����������ַ������з���
		
		/*
		 * properties�����д洢�Ķ���String���͵ļ���ֵ
		 * ���ʹ�����Լ��Ĵ洢��ȡ���ķ��������Ԫ�صĲ���
		 * 
		 */
		
		Properties prop = System.getProperties();
		
		Set<String> nameSet = prop.stringPropertyNames();
		
		for(String name : nameSet){
			String value = prop.getProperty(name);
			
			System.out.println(name + ":" + value);
		}
		
	}
	

}
