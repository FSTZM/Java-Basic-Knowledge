package p9_File;

import java.io.File;

public class RemoveDemo {

	public static void main(String[] args) {
		
		/*
		 * ɾ��һ�������ݵ�Ŀ¼��
		 * 
		 * ԭ�����������������ɾ��
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






