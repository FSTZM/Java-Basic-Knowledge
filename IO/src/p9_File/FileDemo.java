package p9_File;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		constructionDemo();
	}

	public static void constructionDemo() {
		
		//可以将一个已存在的，或者不存在的文件文件封装成file对象
		File f1 = new File("a.txt");
		
		File f2 = new File("D:\\","test.txt");
		
		File f = new File("D:\\");
		File f3 = new File(f,"test2.txt");
		
		
	}

}













