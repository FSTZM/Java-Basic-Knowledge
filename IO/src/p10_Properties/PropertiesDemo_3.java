package p10_Properties;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import p9_filter.filterByName;

public class PropertiesDemo_3 {
	/*
	 * 获取指定目录下，指定扩展名的文件(包含子目录中的)
	 * 这些文件的路径写入到一个文本文件中
	 * 
	 * 简单说，就是建立一个指定扩展名的文件列表
	 * 
	 * 1.必须进行深度遍历
	 * 2.要在遍历的过程中过滤，将符合条件的内容都存储到容器中。
	 * 3.对容器中的内容进行遍历，并将绝对路径写入到文件中。
	 * 
	 */

	public static void main(String[] args) throws IOException{
		
		File dir = new File("D://javacode");
		
		FilenameFilter filter = new FilenameFilter(){

			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
				
			}
			
		};
		
		List<File> list = new ArrayList<File>();
		
		getFile(dir,filter,list);
		
		File destFile = new File(dir,"destFile.txt");
		
		writeToFile(list,destFile);
	}

		/**
		 * 对指定的目录中的内容进行深度遍历，并按照指定的过滤器过滤
		 * 将过滤后的内容存储到指定容器List中
		 * 
		 */
		
	public static void getFile(File dir, FilenameFilter filter, List<File> list){
		
		File[] files = dir.listFiles();
		
		for(File file : files){
			if(file.isDirectory()){
				getFile(file,filter,list);
			}else{
				if(filter.accept(dir,file.getName())){
					list.add(file);
				}
					
			}
		}
		
	}
	
	public static void writeToFile(List<File> list,File destFile) throws IOException{
		
		BufferedWriter bufw = null;
		
		try {
			bufw = new BufferedWriter(new FileWriter(destFile));
			for(File file : list){
				bufw.write(file.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
		} catch (IOException e) {
			
			throw new IOException("异常");
		}finally{
			if(bufw != null){
				try {
					bufw.close();
				} catch (IOException e) {
					
					throw new RuntimeException("关闭失败");
				}
			}
		}	
		
	}
	

}





















