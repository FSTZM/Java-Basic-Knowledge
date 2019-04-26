package p5_UploadTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {
		
		//1.ServerSocket
		ServerSocket ss = new ServerSocket(13450); 
		
		//2.获取socket对象，反馈连接成功的信息
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress() + "连接成功");
		
		//3.读
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4.写
		BufferedWriter bufw = new BufferedWriter(new FileWriter("D:\\success.txt"));
		String line = null;
		while((line = bufIn.readLine())!=null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
			
		}
		
		//5.发送读取完毕的信息
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("上传成功");
		
		//6.关闭流
		bufw.close();
		s.close();
		ss.close();
	}

}
