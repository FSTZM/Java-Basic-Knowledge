package p5_TCPTest;

import java.io.File;
import java.io.FilenameFilter;

public class FileMethodDemo1 {

		public static void main(String[] args) {
			File file = new File("d:\\文件");
			getFileAll(file);
		}
		//获取指定目录以及子目录中的所有的文件
		public static void getFileAll(File file) {
			File[] files = file.listFiles();
			//遍历当前目录下的所有文件和文件夹
			for (File f:files) {
				//判断当前遍历到的是否为目录
				if(f.isDirectory()){
					//是目录，继续获取这个目录下的所有文件和文件夹
					getFileAll(f);
//					System.out.println(f);
				}else{
					//不是目录，说明当前f就是文件，那么就打印出来
					System.out.println(f);
				}
			}
		}

		
}

//定义类实现文件名称FilenameFilter过滤器
class MyFileFilte implements FilenameFilter{
	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}
}