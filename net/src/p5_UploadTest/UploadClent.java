package p5_UploadTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClent {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1.socket
		Socket s = new Socket("10.170.15.108",13450);
		
		//2.��
		BufferedReader bufr = new BufferedReader(new FileReader("D:\\upload.txt"));
		
		//3.д
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line = bufr.readLine())!=null){
			out.write(line);
			out.flush();
//			out.println(line); //write + flush = println
			
//			------------------------------------------------------------------------
//			print���õľ���write������ ֻ��print�����ṩ�˶����������ͣ���write��ͨ��ת��
//			��Ϊʲôwrite��ʱ���ĵ�Ϊ��?
//			
//			socketͨѶ���Գ���ʱ������PrintWriter write��println����������
			
//			print()������write()����û��̫�������
//			println()�����ж���һ��out.write(lineSeparator);
//			�����һ���ָ��������ҿ��������Զ�flush
//			------------------------------------------------------------------------
		}
		
		//4.������Ϣ
		s.shutdownOutput();//�������
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = bufIn.readLine();
		System.out.println(str);
		
		
		//5.close
		bufr.close();
		s.close();

		
	}

}
