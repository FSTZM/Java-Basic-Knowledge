package p2_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWtiterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		//创建一个可以往文件中写入字符数据的字符输出流对象
		/*
		 * 既然是往一个文件中写入入文字数据，那么在创建对象时，就必须明确该文件（用于存储数据的目的地
		 * 
		 * 如果文件不存在 就会自动创建；
		 * 如果文件存在，则会被覆盖。
		 * 
		 * 如果构造函数中加入true，可以实现对文件进行续写
		 * 
		 */
		
		FileWriter fw = new FileWriter("fileWriterDemo.txt",true);
		
		/*
		 * 调用Writer对象中的write(string)方法，写入数据。
		 */
		
//		fw.write("su"); //其实数据写入到了临时存储缓冲区中，因此 fileWriterDemo.txt为空
		
		//换行
//		fw.write("su" + LINE_SEPARATOR + "yuqin");
		fw.write("xixi");  //在原有保存的文件上面续写
		
		/*
		 * 进行刷新 将数据写入到目的地中
		 */
		
//		fw.flush();
		
		/*
		 * 关闭流，关闭资源
		 */
		
		fw.close();  //关闭前先刷新，因此不需要flush也可以写入
		
		
		
		

	}

}
