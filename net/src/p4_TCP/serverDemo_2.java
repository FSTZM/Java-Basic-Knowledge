package p4_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverDemo_2 {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(10302);
		
		Socket s = ss.accept();  //客户端对象是socket类型的，连接过来的对象服务端自己最清楚，因此ss.###
		
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println("serve: " + text);
		
		
		//使用客户端socket对象输出流给客户端返回数据
		OutputStream out = s.getOutputStream();
		out.write("收到".getBytes());
		
		
		s.close();
		ss.close();
		
		
	}

}
