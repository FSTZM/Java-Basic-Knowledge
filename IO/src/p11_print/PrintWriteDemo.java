package p11_print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriteDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * PrintWriter���ַ���ӡ��
		 * ���캯��������
		 * 		1.�ַ���·��
		 * 		2.File����
		 * 		3.�ֽ������
		 * 		4.�ַ������
		 * 
		 *  PrintWriter(Writer out, boolean outoFlush)
		 */
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter out = new PrintWriter(System.out);
		
		String line = null;
		while((line=bufr.readLine())!=null){
			if(line.equals("over"))
				break;
			out.println(line);
		}
		
		out.close();
		bufr.close();

	}

}
