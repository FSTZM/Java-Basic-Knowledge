package p6_IE;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyTomcat {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		ServerSocket ss = new ServerSocket(16444);
		
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress() + "connected");
		
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		String text = new String(buf,0,in.read(buf)); //read(byte[])  �ͰѶ����ķ�����buf����
		System.out.println(text);
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true); //����true ����ˢ��
		out.println("success");
		
		s.close();
		ss.close();
		

	}

}
