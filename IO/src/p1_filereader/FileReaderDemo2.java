package p1_filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//读取一个文本文件。将读取到的字符打印到控制台

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("fileWriterDemo.txt");
		
		/*
		 * 使用read(char[])读取文本文件数据
		 * 
		 * 先创建字符数组
		 */
		
		char[] buf = new char[3];
		int len = 0;
		while((len = fr.read(buf))!=-1){
			System.out.println(new String(buf,0,len));
		}
		
		
		/*
		char[] buf = new char[3];
		int num1 = fr.read(buf);  //将读取到的字符存入数组中
		System.out.println(num1 + ":" + new String(buf,0,num1)); //读到几个就打印几个
		
		int num2 = fr.read(buf);
		System.out.println(num2 + ":" + new String(buf));
		
		int num3 = fr.read(buf);
		System.out.println(num3 + ":" + new String(buf));
		*/

		fr.close();
		
	}

}