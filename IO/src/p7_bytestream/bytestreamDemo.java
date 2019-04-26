package p7_bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestreamDemo {

	public static void main(String[] args) throws IOException {

		demo_read();
	}

	public static void demo_read() throws IOException {
		
		//1.创建流
		FileInputStream fis = new FileInputStream("bytedemo.txt");
		
		//2.读取
		
		byte[] buf = new byte[fis.available()];
		//byte[] buf = new byte[1024];
		
		fis.read(buf);
		System.out.println(new String(buf));
		
		/*
		int len = 0;
		while((len = fis.read(buf))!= -1){
			System.out.println(new String(buf,0,len));
		}
		*/
		System.out.println(fis.available()); //文件大小
		
		
		/*
		//方式二
		int ch = 0;
		while((ch = fis.read())!= -1){
			System.out.println(ch);
		}
		*/
		
		
		/*
		//方式一
		int ch = fis.read();
		System.out.println(ch);  //97
		*/
		
	}

	public static void demo_write() throws IOException {
		
		//1.创建字节流数处对象
		FileOutputStream fop = new FileOutputStream("bytedemo.txt");
		
		//2.写数据，直接写到了目的地中
		fop.write("abc".getBytes()); //把字符串变成字节数组
		
		fop.close(); //必须要完成的，缓冲区对象用flush
		
		
		
		
	}

}
