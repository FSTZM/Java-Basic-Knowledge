package p4_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverDemo_2 {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(10302);
		
		Socket s = ss.accept();  //�ͻ��˶�����socket���͵ģ����ӹ����Ķ��������Լ�����������ss.###
		
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println("serve: " + text);
		
		
		//ʹ�ÿͻ���socket������������ͻ��˷�������
		OutputStream out = s.getOutputStream();
		out.write("�յ�".getBytes());
		
		
		s.close();
		ss.close();
		
		
	}

}
