package otherAPI_System;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		 * Runtime: û�й��췽��ժҪ��˵�����಻���Դ�������
		 * �ַ��ֻ��зǾ�̬�ķ�����˵������Ӧ���ṩ��̬�ķ��ظ������ķ�����
		 * ����ֻ��һ����˵��Runtime��ʹ���˵������ģʽ��
		 * 
		 */
		
		Runtime r = Runtime.getRuntime();
		
		//execute: ִ��. xxx.exe
		
//		try {
//			r.exec("notepad.exe");
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		Process p = r.exec("notepad.exe");
		Thread.sleep(5000);
		p.destroy();
		

	}

}
