package otherAPI_System;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		method_3();

	}

	/**
	 * �����ڶ�����и�ʽ��
	 * �����ڶ��� ---> ���ڸ�ʽ���ַ���
	 * 		ʹ�õ���DateFormat���е�format������
	 * 
	 * �����ڸ�ʽ���ַ���--->���ڶ���
	 * 		ʹ�õ���DateFormat���е�prase������
	 * @throws ParseException 
	 */
	
	public static void method_3() throws ParseException {
		
		String str_date = "2018-2-22";
		str_date = "2018---2---27";
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		dateFormat = new SimpleDateFormat("yyyy---MM---dd");
		
		Date date = dateFormat.parse(str_date);
		
		System.out.println(date);
	}
	
	public static void method_2() {
	
		Date date = new Date();
		
		//��ȡ���ڸ�ʽ Ĭ�ϸ�ʽ
//		DateFormat dateFormat = DateFormat.getDateInstance();
//		String str_date = dateFormat.format(date);
//		System.out.println(str_date); //2018-2-22
		
		//2018-2-22 20:25:30
//		DateFormat dateFormat = DateFormat.getDateTimeInstance();
//		String str_date = dateFormat.format(date);
//		System.out.println(str_date); //2018-2-22 20:25:30
		
		//FULL LONG����ָ�����
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		String str_date = dateFormat.format(date);
		System.out.println(str_date); //2018��2��22�� ������
		
	
	}

	/**
	 * �����ڶ�����и�ʽ��
	 * 
	 * 
	 */
	
	
	public static void method_1() {
		/**
		 * �������ͺ���ֵ֮���ת����
		 * 
		 * ����ֵ->���ڶ���
		 * 		1.ͨ��Date����Ĺ��췽�� new Date(timeMillis);
		 * 		2.������ͨ��setTime���á�
		 * 		��Ϊ����ͨ��Date����ķ����Ը������еĸ����ֶ�(�����յ�)���в���
		 * 
		 * ���ڶ���->����ֵ
		 * 		1.getTime����
		 * 		��Ϊ����ͨ���������ֵ�������㡣
		 * 
		 * 
		 * parse()���ص���һ��Date�������ݣ�format���ص���һ��StringBuffer���͵�����
		 * //SimpleDateFormat�е�parse��������  
		 * //��String�͵��ַ���ת�����ض���ʽ��date���� 
		 * 
		 */
		
		
		long time = System.currentTimeMillis();//����ǰ���ں�ʱ���װ��Date����
		System.out.println(time); //1519224107402
		
		Date date = new Date();
		System.out.println(date); //Wed Feb 21 22:41:47 CST 2018
		
		Date date2 = new Date(1519224107402l);  //��ָ������ֵ��װ��Date����
		/*
		 * Date date2 = new Date(1519224107402); ���Ȼᳬ����Χ�������ݺ����һ����l/L��
		 */
		System.out.println(date2);
	}

}
