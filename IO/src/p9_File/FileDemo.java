package p9_File;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		constructionDemo();
	}

	public static void constructionDemo() {
		
		//���Խ�һ���Ѵ��ڵģ����߲����ڵ��ļ��ļ���װ��file����
		File f1 = new File("a.txt");
		
		File f2 = new File("D:\\","test.txt");
		
		File f = new File("D:\\");
		File f3 = new File(f,"test2.txt");
		
		
	}

}













