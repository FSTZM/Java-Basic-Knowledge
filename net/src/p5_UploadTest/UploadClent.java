package p5_UploadTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClent {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1.socket
		Socket s = new Socket("10.170.15.108",13450);
		
		//2.读
		BufferedReader bufr = new BufferedReader(new FileReader("D:\\upload.txt"));
		
		//3.写
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line = bufr.readLine())!=null){
			out.write(line);
			out.flush();
//			out.println(line); //write + flush = println
			
//			------------------------------------------------------------------------
//			print调用的就是write方法， 只是print方法提供了多种数据类型，而write都通过转换
//			那为什么write的时候文档为空?
//			
//			socket通讯测试程序时遇到的PrintWriter write与println方法的区别
			
//			print()方法和write()方法没有太大的区别
//			println()方法中多了一个out.write(lineSeparator);
//			添加了一个分隔符，并且可以设置自动flush
//			------------------------------------------------------------------------
		}
		
		//4.反馈信息
		s.shutdownOutput();//结束标记
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = bufIn.readLine();
		System.out.println(str);
		
		
		//5.close
		bufr.close();
		s.close();

		
	}

}
