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
		 * 转换客户端：
		 * 1.创建socket客户端对象
		 * 2.获取键盘录入
		 * 3.将录入的信息发送给socket输出流
		 */

		Socket socket = new Socket("10.170.10.60",10612);
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		//socket输出流
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);//自动换行，刷新
		
		//socket输入流
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
		String line = null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			out.println(line);
			
			//读取服务器发回的一行大写数据
			String upperStr = bufIn.readLine();
			System.out.println(upperStr);
		}
		
		socket.close();
		
	}

}
