package p9_File;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethod_1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * File对象的常见方法。
		 * 
		 * 1.获取
		 * 		1.获取文件名称
		 * 		2.获取文件路径
		 * 		3.获取文件大小
		 * 		4.获取文件修改时间
		 * 
		 * 2.创建与删除
		 * 		boolean
		 * 
		 * 3.判断
		 * 		is
		 * 
		 * 4.重命名
		 * 
		 * 		
		 * 
		 */

//		getDemo();
//		createAndDeleteDemo();
//		isDemo();
//		renameDemo();
		listRootDemo();
		
	}

	public static void listRootDemo() {
	
		File file = new File("D:\\");
		
		System.out.println(file.getFreeSpace());//指定分区中未分配的字节数
		System.out.println(file.getTotalSpace());//
		System.out.println(file.getUsableSpace());//
		
//		File[] files = File.listRoots();
//		for(File file:files){
//			System.out.println(file);
//		}
		
	}

	public static void renameDemo() {
		
		File f1 = new File("file.txt");
		File f2 = new File("file_1.txt");
		
		boolean a = f1.renameTo(f2);
		
	}

	public static void isDemo() {
		
		File file = new File("file.txt");  //最好明确路径、名称、类型
		/*
		 * public boolean isFile()是一个公共函数。其参数路径名表示是一个文件，函数的作用是判断该文件是否是一个标准文件。
		 * 		如果这个文件路径中的文件是存在的而且是一个txt的标准文件，那么就应该返回true。
		 * 
		 * 根据返回为false的情况看，有以下几种可能：
		 * 		1、因为是文件路径错误，不存在该文件路径。
		 * 		2、不存在该txt文件，后缀名错误。
		 * 		建议：主要看看路径名是不是有问题。
		 */
//		boolean a = file.exists();
		
		//应该先判断文件是否存在，“file.txt”只是一个名称，又可能是一个文件夹的名称
		System.out.println(file.isFile());  //false
		
	}

	public static void createAndDeleteDemo() throws IOException {
		
		File file = new File("file.txt");
		
		/*
		 * 和输出流不一样，如果文件不存在，则创建，如果文件存在，则不创建。
		 */
		boolean a = file.createNewFile();
		
		boolean b = file.delete();
		
		//创建文件夹
		boolean c = file.mkdir();//make directory 
		
	}

	public static void getDemo() {
		
		File file = new File("IO流_1.txt");
		
		String name = file.getName();
		
		String path = file.getPath();//相对路径
		
		String abspath = file.getAbsolutePath();//绝对路径
		
		long len = file.length();
		
		//获取标准时间
		long time = file.lastModified();//最后一次修改时间
		Date date = new Date(time);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String str_time = dateFormat.format(date);
		
		
	}

	
	
	
}
