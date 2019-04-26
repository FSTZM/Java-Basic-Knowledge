package p14_randomFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomFileDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * RandomAccessFile
		 * 
		 * 特点：
		 * 1.该对象既能读，又能写
		 * 2.该对象内部维护了一个byte数组，并通过指针可以操作数组中的元素
		 * 3.可以通过getFilePointer方法获取指针的位置，和通过seek方法设置指针的位置
		 * 4.其实该对象是将字节输入流和输出流进行了封装
		 * 5.该对象的源或者目的只能是文件。通过构造函数就可以看出
		 * 
		 */
		
//		writeFile();
		readFile();
		

	}

	public static void readFile() throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("random.txt","r");
		
		byte[] buf = new byte[4];
		raf.read(buf);
		
		String name = new String(buf);
		System.out.println("name=" + name);
		
		raf.close();
		
	}

	//使用RandomAccessFile对象写入一些人员信息，比如信息和年龄
	public static void writeFile() throws IOException{
		
		RandomAccessFile raf = new RandomAccessFile("random.txt","rw");
		
		/*
		 * 如果文件存在，则创建，如果文件存在，则不创建
		 */
		raf.write("su".getBytes());
		raf.write(97);//a
//		raf.write(609);//a  舍弃高八位
		
		raf.close();
		
	}
	
	
}

























