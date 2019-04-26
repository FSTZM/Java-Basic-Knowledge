package p3_CharStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：将C盘中的文件复制到D盘
 */

public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		
		//1.读取一个已经有的文本文件，使用字符读取流和文件相关联
		FileReader fr = new FileReader("fileWriterDemo.txt");

		//2.创建一个目的，用于存储读到数据
		FileWriter fw = new FileWriter("copytest.txt");
		
		//3.频繁的读写操作
		int ch = 0;
		while((ch = fr.read())!= -1){
			fw.write(ch);
		}
		
		//4.关闭流
		fw.close();
		fr.close();

	}

}
