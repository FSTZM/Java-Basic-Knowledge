package p3_CharStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺽�C���е��ļ����Ƶ�D��
 */

public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		
		//1.��ȡһ���Ѿ��е��ı��ļ���ʹ���ַ���ȡ�����ļ������
		FileReader fr = new FileReader("fileWriterDemo.txt");

		//2.����һ��Ŀ�ģ����ڴ洢��������
		FileWriter fw = new FileWriter("copytest.txt");
		
		//3.Ƶ���Ķ�д����
		int ch = 0;
		while((ch = fr.read())!= -1){
			fw.write(ch);
		}
		
		//4.�ر���
		fw.close();
		fr.close();

	}

}
