package p1_filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//��ȡһ���ı��ļ�������ȡ�����ַ���ӡ������̨

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * 1.������ȡ�ַ����ݵ�������
		 *		�ڴ�����ȡ������ʱ������Ҫ��ȷ����ȡ���ļ�
		 *		��һ����ȡ������һ���Ѵ����ļ���
		 */
		
		FileReader fr = new FileReader("fileWriterDemo.txt");
		
		int ch = 0;
		while((ch=fr.read()) != -1){
			System.out.println((char)ch);
		}
		
		/*
		//��Reader�е�read������ȡ�ַ�
		int ch = fr.read();
		System.out.println(ch);  //115,��Ϊ���ļ��ĵ�һ���ַ��ǡ�s��
		int ch1 = fr.read();
		System.out.println(ch1); //117
		*/
		
		fr.close();
		
	}

}
