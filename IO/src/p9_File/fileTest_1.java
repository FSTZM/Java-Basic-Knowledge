package p9_File;

import java.io.File;

public class fileTest_1 {

	public static void main(String[] args) {
		
		File file = new File("D:\\test");
		
		listAll(file,0);

	}

	public static void listAll(File file, int level) {
		
		File[] names = file.listFiles();
		level++;
		System.out.println(getSpace(level) + file.getName());
		for(int x = 0; x < names.length; x++){
			if(names[x].isDirectory()){
				listAll(names[x],level);
			}
			else
				System.out.println(getSpace(level) + names[x].getName());
		}	
	}

	private static String getSpace(int level) {
		
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x < level; x++){
			sb.append("    ");
		}
		
		return sb.toString();
		
	}

}












