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
		 * 在DOS命令行，需要先输入bin路径 之后再添加包名用java编译，中间用  . 
		 * 
		 */
		
		
		/*
		 * 转换服务端
		 * 1.socketsever服务
		 * 2.获取socket对象
		 * 3.源：socket，读取客户端发过来的需要转换的数据
		 * 4.目的：显示在控制台上
		 * 5.将数据转换成大写发给客户端
		 */

		
		ServerSocket ss = new ServerSocket(10612);
		
		Socket s = ss.accept();
		
		//获取IP
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip + "connected");
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line = bufIn.readLine())!=null){
			System.out.println(line);  //服务端只输出用户在打印台输入的字符串
			out.println(line.toUpperCase());
		}
		
		s.close();
		ss.close();
		
	}

}
