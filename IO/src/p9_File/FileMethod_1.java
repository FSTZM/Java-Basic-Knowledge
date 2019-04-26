package p9_File;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethod_1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * File����ĳ���������
		 * 
		 * 1.��ȡ
		 * 		1.��ȡ�ļ�����
		 * 		2.��ȡ�ļ�·��
		 * 		3.��ȡ�ļ���С
		 * 		4.��ȡ�ļ��޸�ʱ��
		 * 
		 * 2.������ɾ��
		 * 		boolean
		 * 
		 * 3.�ж�
		 * 		is
		 * 
		 * 4.������
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
		
		System.out.println(file.getFreeSpace());//ָ��������δ������ֽ���
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
		
		File file = new File("file.txt");  //�����ȷ·�������ơ�����
		/*
		 * public boolean isFile()��һ�����������������·������ʾ��һ���ļ����������������жϸ��ļ��Ƿ���һ����׼�ļ���
		 * 		�������ļ�·���е��ļ��Ǵ��ڵĶ�����һ��txt�ı�׼�ļ�����ô��Ӧ�÷���true��
		 * 
		 * ���ݷ���Ϊfalse��������������¼��ֿ��ܣ�
		 * 		1����Ϊ���ļ�·�����󣬲����ڸ��ļ�·����
		 * 		2�������ڸ�txt�ļ�����׺������
		 * 		���飺��Ҫ����·�����ǲ��������⡣
		 */
//		boolean a = file.exists();
		
		//Ӧ�����ж��ļ��Ƿ���ڣ���file.txt��ֻ��һ�����ƣ��ֿ�����һ���ļ��е�����
		System.out.println(file.isFile());  //false
		
	}

	public static void createAndDeleteDemo() throws IOException {
		
		File file = new File("file.txt");
		
		/*
		 * ���������һ��������ļ������ڣ��򴴽�������ļ����ڣ��򲻴�����
		 */
		boolean a = file.createNewFile();
		
		boolean b = file.delete();
		
		//�����ļ���
		boolean c = file.mkdir();//make directory 
		
	}

	public static void getDemo() {
		
		File file = new File("IO��_1.txt");
		
		String name = file.getName();
		
		String path = file.getPath();//���·��
		
		String abspath = file.getAbsolutePath();//����·��
		
		long len = file.length();
		
		//��ȡ��׼ʱ��
		long time = file.lastModified();//���һ���޸�ʱ��
		Date date = new Date(time);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String str_time = dateFormat.format(date);
		
		
	}

	
	
	
}
