package p4_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class clentDemo_2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("10.170.32.115",10302);
		
		OutputStream out = socket.getOutputStream();
		
		out.write("hahaha".getBytes());
		
		//读取服务端返回的数据，使用socket读取流
		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		
		socket.close();
		

	}

}


















































