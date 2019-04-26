package p14_randomFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomFileDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * RandomAccessFile
		 * 
		 * �ص㣺
		 * 1.�ö�����ܶ�������д
		 * 2.�ö����ڲ�ά����һ��byte���飬��ͨ��ָ����Բ��������е�Ԫ��
		 * 3.����ͨ��getFilePointer������ȡָ���λ�ã���ͨ��seek��������ָ���λ��
		 * 4.��ʵ�ö����ǽ��ֽ�������������������˷�װ
		 * 5.�ö����Դ����Ŀ��ֻ�����ļ���ͨ�����캯���Ϳ��Կ���
		 * 
		 */
		
//		writeFile();
		readFile();
		

	}

	public static void readFile() throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("random.txt","r");
		
		byte[] buf = new byte[4];
		raf.read(buf);
		
		String name = new String(buf);
		System.out.println("name=" + name);
		
		raf.close();
		
	}

	//ʹ��RandomAccessFile����д��һЩ��Ա��Ϣ��������Ϣ������
	public static void writeFile() throws IOException{
		
		RandomAccessFile raf = new RandomAccessFile("random.txt","rw");
		
		/*
		 * ����ļ����ڣ��򴴽�������ļ����ڣ��򲻴���
		 */
		raf.write("su".getBytes());
		raf.write(97);//a
//		raf.write(609);//a  �����߰�λ
		
		raf.close();
		
	}
	
	
}

























