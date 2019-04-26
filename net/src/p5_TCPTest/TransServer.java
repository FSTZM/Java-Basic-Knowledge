package p5_TCPTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 * D:\javacode\eclipse\net\bin>java p5_TCPTest.TransClent
		 * 
		 * ��DOS�����У���Ҫ������bin·�� ֮������Ӱ�����java���룬�м���  . 
		 * 
		 */
		
		
		/*
		 * ת�������
		 * 1.socketsever����
		 * 2.��ȡsocket����
		 * 3.Դ��socket����ȡ�ͻ��˷���������Ҫת��������
		 * 4.Ŀ�ģ���ʾ�ڿ���̨��
		 * 5.������ת���ɴ�д�����ͻ���
		 */

		
		ServerSocket ss = new ServerSocket(10612);
		
		Socket s = ss.accept();
		
		//��ȡIP
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip + "connected");
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line = bufIn.readLine())!=null){
			System.out.println(line);  //�����ֻ����û��ڴ�ӡ̨������ַ���
			out.println(line.toUpperCase());
		}
		
		s.close();
		ss.close();
		
	}

}
