package p1_filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//��ȡһ���ı��ļ�������ȡ�����ַ���ӡ������̨

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("fileWriterDemo.txt");
		
		/*
		 * ʹ��read(char[])��ȡ�ı��ļ�����
		 * 
		 * �ȴ����ַ�����
		 */
		
		char[] buf = new char[3];
		int len = 0;
		while((len = fr.read(buf))!=-1){
			System.out.println(new String(buf,0,len));
		}
		
		
		/*
		char[] buf = new char[3];
		int num1 = fr.read(buf);  //����ȡ�����ַ�����������
		System.out.println(num1 + ":" + new String(buf,0,num1)); //���������ʹ�ӡ����
		
		int num2 = fr.read(buf);
		System.out.println(num2 + ":" + new String(buf));
		
		int num3 = fr.read(buf);
		System.out.println(num3 + ":" + new String(buf));
		*/

		fr.close();
		
	}

}