package p11_print;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * PrintStream:
		 * 1.�ṩ�˴�ӡ�������ԶԶ����������ͽ��д�ӡ�����������ݵı�ʾ��ʽ
		 * 2.�����׳�IOException
		 * 
		 * ���캯���������������͵�ֵ��
		 * 1.�ַ�������
		 * 2.File����
		 * 3.�ֽ������
		 * 
		 */
		
		PrintStream out = new PrintStream("print.txt");
		
		out.write(610); //b  ֻд����Ͱ�λ
		out.print(610); //610  ����ʲô�����ʲô
		
		out.close();
		

	}

}















