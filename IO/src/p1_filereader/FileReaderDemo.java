package p1_filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//读取一个文本文件。将读取到的字符打印到控制台

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * 1.创建读取字符数据的流对象
		 *		在创建读取流对象时，必须要明确被读取的文件
		 *		用一个读取流关联一个已存在文件。
		 */
		
		FileReader fr = new FileReader("fileWriterDemo.txt");
		
		int ch = 0;
		while((ch=fr.read()) != -1){
			System.out.println((char)ch);
		}
		
		/*
		//用Reader中的read方法读取字符
		int ch = fr.read();
		System.out.println(ch);  //115,因为该文件的第一个字符是“s”
		int ch1 = fr.read();
		System.out.println(ch1); //117
		*/
		
		fr.close();
		
	}

}
