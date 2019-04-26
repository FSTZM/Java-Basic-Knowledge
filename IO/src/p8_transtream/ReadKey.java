package p8_transtream;

import java.io.IOException;
import java.io.InputStream;

public class ReadKey {

	public static void main(String[] args) throws IOException {
		
		readkey2();
//		System.out.println((int)'\r'); //13
//		System.out.println((int)'\n'); //10

	}

	public static void readkey2() throws IOException {
		
		/*
		 * 获取用户键盘录入的数据
		 * 并将数据变成大写显示在控制台上
		 * 如果用户输入的是over，结束键盘输入
		 * 
		 * 思路
		 * 1.因为键盘录入只读取一个字节，要判断是否是over需要先将读到的字节拼成字符串
		 * 2.需要容器。--- StringBuilder
		 * 3.在用户回车之前将录入的数据变成字符串判断即可
		 */
		
		//1.创建容器
		StringBuilder sb = new StringBuilder();
		
		//2.获取键盘读取流
		InputStream in = System.in;
		
		//3.定义变量记录读取到的字节，循环获取
		int ch = 0;
		
		while((ch = in.read())!=-1){
			
			//存储之前判断是否是换行标价，换行标记不存
			if(ch == '\r')
				continue;
			if(ch == '\n'){
				String temp = sb.toString();
				if("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length()); //集合清空是clear，StringBuilder，StringBuffer清空是delete
			}
			else
			sb.append((char)ch);
			
//			System.out.println(ch);
		}
	
	}

	public static void readkey() throws IOException {
		
		InputStream in = System.in;
		
		int ch = in.read();//阻塞式方法，一直读取，直到读取到数据。
		
		System.out.println(ch);
	}

}
