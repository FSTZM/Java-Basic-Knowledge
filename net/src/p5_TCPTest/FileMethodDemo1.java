package p5_TCPTest;

import java.io.File;
import java.io.FilenameFilter;

public class FileMethodDemo1 {

		public static void main(String[] args) {
			File file = new File("d:\\�ļ�");
			getFileAll(file);
		}
		//��ȡָ��Ŀ¼�Լ���Ŀ¼�е����е��ļ�
		public static void getFileAll(File file) {
			File[] files = file.listFiles();
			//������ǰĿ¼�µ������ļ����ļ���
			for (File f:files) {
				//�жϵ�ǰ���������Ƿ�ΪĿ¼
				if(f.isDirectory()){
					//��Ŀ¼��������ȡ���Ŀ¼�µ������ļ����ļ���
					getFileAll(f);
//					System.out.println(f);
				}else{
					//����Ŀ¼��˵����ǰf�����ļ�����ô�ʹ�ӡ����
					System.out.println(f);
				}
			}
		}

		
}

//������ʵ���ļ�����FilenameFilter������
class MyFileFilte implements FilenameFilter{
	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}
}