package p2_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWtiterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		//����һ���������ļ���д���ַ����ݵ��ַ����������
		/*
		 * ��Ȼ����һ���ļ���д�����������ݣ���ô�ڴ�������ʱ���ͱ�����ȷ���ļ������ڴ洢���ݵ�Ŀ�ĵ�
		 * 
		 * ����ļ������� �ͻ��Զ�������
		 * ����ļ����ڣ���ᱻ���ǡ�
		 * 
		 * ������캯���м���true������ʵ�ֶ��ļ�������д
		 * 
		 */
		
		FileWriter fw = new FileWriter("fileWriterDemo.txt",true);
		
		/*
		 * ����Writer�����е�write(string)������д�����ݡ�
		 */
		
//		fw.write("su"); //��ʵ����д�뵽����ʱ�洢�������У���� fileWriterDemo.txtΪ��
		
		//����
//		fw.write("su" + LINE_SEPARATOR + "yuqin");
		fw.write("xixi");  //��ԭ�б�����ļ�������д
		
		/*
		 * ����ˢ�� ������д�뵽Ŀ�ĵ���
		 */
		
//		fw.flush();
		
		/*
		 * �ر������ر���Դ
		 */
		
		fw.close();  //�ر�ǰ��ˢ�£���˲���ҪflushҲ����д��
		
		
		
		

	}

}
