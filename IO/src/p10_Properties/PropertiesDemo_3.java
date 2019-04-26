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
	 * ��ȡָ��Ŀ¼�£�ָ����չ�����ļ�(������Ŀ¼�е�)
	 * ��Щ�ļ���·��д�뵽һ���ı��ļ���
	 * 
	 * ��˵�����ǽ���һ��ָ����չ�����ļ��б�
	 * 
	 * 1.���������ȱ���
	 * 2.Ҫ�ڱ����Ĺ����й��ˣ����������������ݶ��洢�������С�
	 * 3.�������е����ݽ��б�������������·��д�뵽�ļ��С�
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
		 * ��ָ����Ŀ¼�е����ݽ�����ȱ�����������ָ���Ĺ���������
		 * �����˺�����ݴ洢��ָ������List��
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
			
			throw new IOException("�쳣");
		}finally{
			if(bufw != null){
				try {
					bufw.close();
				} catch (IOException e) {
					
					throw new RuntimeException("�ر�ʧ��");
				}
			}
		}	
		
	}
	

}





















