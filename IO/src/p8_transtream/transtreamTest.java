package p8_transtream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class transtreamTest {

	public static void main(String[] args) throws IOException {
		
		/*
		 * ����
		 * 1.������¼�������д�뵽һ���ļ��С�
		 * 2.��һ���ı��ļ�������ʾ�ڿ���̨�ϡ�
		 * 3.��һ���ļ��е����ݸ��Ƶ���һ���ļ��С�
		 */
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("transtest.txt")));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copytranstest.txt")));
		
		/*
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("transtest.txt")));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		*/
		/*
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("transtest.txt")));
		*/
		String line = null;
		while((line = bufr.readLine())!= null){
			if("over".equals(bufr))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
			
		}

	}

}
