package p9_File;

import java.io.File;

import p9_filter.filterByName;

public class listDemo {

	public static void main(String[] args) {
		
		listDemo();

	}

	public static void listDemo() {
		
		File file = new File("D:\\");
		
		//����list������File�����з�װ�ı�����Ŀ¼������ᷢ����ָ���쳣
		//������ʵ���ϵͳ��Ŀ¼Ҳ�ᷢ����ָ���쳣��
		//���Ŀ¼���ڵ���û�����ݣ��᷵��һ�����飬���ǳ���Ϊ0
		String[] names = file.list(new filterByName());
		for(String name : names){
			System.out.println(name);  //��ӡ��ǰĿ¼�µ������ļ����ƣ����������ļ�
		}
		
	}

}
