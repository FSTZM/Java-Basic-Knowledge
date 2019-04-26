package otherAPI_System;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ϰ��
 * ��1995-2-27������2018-2-22���ж�����
 * 
 * ˼·��
 * �������������
 * ����Ҫ���������Խ��м����������  --- ������Ŀ���ʹ����ֵ
 * ��λ�ȡ����ֵ�� --- ͨ��date����
 * ��λ�ȡdate���󣿿��Խ��ַ���ת����date����
 * 
 * 1.�����ڸ�ʽ���ַ�ת��date����
 * 2.��date����ת���ɺ���ֵ
 * 3.��������������
 * 
 */


public class DateTest {

	public static void main(String[] args) throws ParseException {
		
		String str_date1 = "1995-2-27";
		String str_date2 = "2018-2-22";
		
		test(str_date1,str_date2);

	}

	public static void test(String str_date1,String str_date2) throws ParseException {
		
		DateFormat dateFormat = DateFormat.getInstance();//DateFormat �������� ��ʽ��������������/ʱ�䡱��
														//ʵ���ϣ�����Date�ĸ�ʽ�����ߣ����ܰ������Ǹ�ʽ��Date
														//������Dateת����������Ҫ��String�ַ���������ʹ��
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");//SimpleDateFormat ��һ����ʽ��Date �Լ� ���������ַ��� �Ĺ��ߡ�
														//�������;�ǣ��ܹ�����ָ���ĸ�ʽ����Date���и�ʽ��
														//Ȼ������ʹ�ÿ��Ը�ʽ��Date��õ����ַ���
		
		Date date1 = dateFormat.parse(str_date1);
		Date date2 = dateFormat.parse(str_date2);
		
//		System.out.println(date1); //Mon Feb 27 00:00:00 CST 1995
		
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		
		long time = Math.abs(time1 - time2);
		
		int year = getDay(time);
		
		System.out.println(year);
	}

	public static int getDay(long time) {
		
		int year = (int)(time/1000/60/60/24/365);
		
		return year;
		
	}

}
