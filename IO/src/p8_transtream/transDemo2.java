package p8_transtream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class transDemo2 {

	public static void main(String[] args) throws IOException {
		
		write_test();

	}

	public static void write_test() throws IOException {
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("text_2.txt"),"GBK");//ָ��������ʽ
		
//		FileWriter fw = new FileWriter("copytest_2.txt");
		
		/*
		 * ���������Ĺ����ǵ�ͬ�ġ�
		 * FileWriter:��ʵ����ת����ָ���˱���Ĭ�ϱ��������֣��������ת������������󣬿��Է�������ı��ļ�
		 * 		��˵�������ļ����ֽ���+����Ĭ�ϵı����
		 * 		���ǰ���Ĭ�ϱ�����������ļ��ı���ࡣ
		 * 
		 * ��������ı��ļ���Ҫ��ȷ����ı��룬Filewriter�Ͳ����ˣ�������ת������
		 * 
		 */
		
		osw.write("���");
		osw.close();
		
	}

}


























