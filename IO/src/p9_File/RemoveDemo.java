package p9_File;

import java.io.File;

public class RemoveDemo {

	public static void main(String[] args) {
		
		/*
		 * 删除一个带内容的目录。
		 * 
		 * 原理：必须从最里面往外删除
		 * 
		 */
		
		File dir = new File("D:\\test");
		removeDemo(dir);

	}

	public static void removeDemo(File dir) {
		
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isDirectory()){
				removeDemo(file);
			}
			else{
				System.out.println(file + ":" + file.delete());
			}
		}
		
		System.out.println(dir+ ":" + dir.delete());
	}

}






