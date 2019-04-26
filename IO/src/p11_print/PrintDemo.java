package p11_print;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * PrintStream:
		 * 1.提供了打印方法可以对多种数据类型进行打印。并保持数据的表示形式
		 * 2.不会抛出IOException
		 * 
		 * 构造函数，接收三种类型的值：
		 * 1.字符串数组
		 * 2.File对象
		 * 3.字节输出流
		 * 
		 */
		
		PrintStream out = new PrintStream("print.txt");
		
		out.write(610); //b  只写入最低八位
		out.print(610); //610  输入什么就输出什么
		
		out.close();
		

	}

}















