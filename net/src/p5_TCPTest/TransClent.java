package p5_TCPTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClent {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		/*
		 * ת���ͻ��ˣ�
		 * 1.����socket�ͻ��˶���
		 * 2.��ȡ����¼��
		 * 3.��¼�����Ϣ���͸�socket�����
		 */

		Socket socket = new Socket("10.170.10.60",10612);
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		//socket�����
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);//�Զ����У�ˢ��
		
		//socket������
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
		String line = null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			out.println(line);
			
			//��ȡ���������ص�һ�д�д����
			String upperStr = bufIn.readLine();
			System.out.println(upperStr);
		}
		
		socket.close();
		
	}

}
