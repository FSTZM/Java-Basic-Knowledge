package p8_transtream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class transDemo2 {

	public static void main(String[] args) throws IOException {
		
		write_test();

	}

	public static void write_test() throws IOException {
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("text_2.txt"),"GBK");//指定编码形式
		
//		FileWriter fw = new FileWriter("copytest_2.txt");
		
		/*
		 * 这两句代码的功能是等同的。
		 * FileWriter:其实就是转换流指定了本机默认编码表的体现，而且这个转换流的子类对象，可以方便操作文本文件
		 * 		简单说：操作文件的字节流+本机默认的编码表。
		 * 		这是按照默认编码表来操作文件的便捷类。
		 * 
		 * 如果操作文本文件需要明确具体的编码，Filewriter就不行了，必须用转换流。
		 * 
		 */
		
		osw.write("你好");
		osw.close();
		
	}

}


























