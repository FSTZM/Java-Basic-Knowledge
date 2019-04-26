package p7_bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestreamDemo {

	public static void main(String[] args) throws IOException {

		demo_read();
	}

	public static void demo_read() throws IOException {
		
		//1.������
		FileInputStream fis = new FileInputStream("bytedemo.txt");
		
		//2.��ȡ
		
		byte[] buf = new byte[fis.available()];
		//byte[] buf = new byte[1024];
		
		fis.read(buf);
		System.out.println(new String(buf));
		
		/*
		int len = 0;
		while((len = fis.read(buf))!= -1){
			System.out.println(new String(buf,0,len));
		}
		*/
		System.out.println(fis.available()); //�ļ���С
		
		
		/*
		//��ʽ��
		int ch = 0;
		while((ch = fis.read())!= -1){
			System.out.println(ch);
		}
		*/
		
		
		/*
		//��ʽһ
		int ch = fis.read();
		System.out.println(ch);  //97
		*/
		
	}

	public static void demo_write() throws IOException {
		
		//1.�����ֽ�����������
		FileOutputStream fop = new FileOutputStream("bytedemo.txt");
		
		//2.д���ݣ�ֱ��д����Ŀ�ĵ���
		fop.write("abc".getBytes()); //���ַ�������ֽ�����
		
		fop.close(); //����Ҫ��ɵģ�������������flush
		
		
		
		
	}

}
