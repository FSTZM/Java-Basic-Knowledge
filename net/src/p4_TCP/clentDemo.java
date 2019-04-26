package p4_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class clentDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//客户端发数据到服务端
		/*
		 * TCP传输,客户端建立的过程
		 * 1.创建TCP客户端socket服务，使用的是Socket对象。(封装了IP+端口号)
		 * 		建议该对象一创建就明确目的地。要链接的主机。
		 * 2.如果连接建立成功，说明数据传输通道已经建立
		 * 		该通道就是Socket流，是底层建立好的。既然是流，表明既有输入又有输出
		 * 		想要输入或者输出流对象，可以找Socket来获取
		 * 		可以通过getOutputStream(), getIntputStream()来获取两个字节流
		 * 3.使用输出流，将数据写出。
		 * 4.关闭资源。
		 * 		
		 */
		
		Socket socket = new Socket("10.170.32.115",10302);
		
		OutputStream out = socket.getOutputStream();
		
		out.write("hahaha".getBytes());
		
		socket.close();
		

	}

}


















































