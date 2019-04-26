package p10_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo_2 {
	
	/*
	 * ����һ�����ܣ���ȡһ���������еĴ��������������Σ�����ʹ�ô����ѵ���ע�����ʾ������Ҫ�����г���
	 * 
	 * 1.������
	 * 		��������һ�Σ�����һ��
	 * 2.����������һ������
	 * 3.���ȥʹ�ü�������
	 * 		���ȣ���������ʱ��Ӧ���ȶ�ȡ������ڼ�¼��������Ϣ�������ļ�
	 * 	 ��ȡ��һ�μ���������������ʹ�ô������ж�
	 * 	 ��Σ��Ըü���������������������������ݴ洢
	 * 4.�ļ��е���Ϣ����ν��д洢�����֡�
	 * 		ֱ�Ӵ洢����ֵ�Ϳ��ԣ����ǲ���ȷ�����ݵĺ��塣���������־ͱ�ú���Ҫ
	 * 	 ����������ֺ�ֵ�ö�Ӧ�����Կ���ʹ�ü�ֵ�ԡ�
	 * 	 ����ӳ���ϵmap���ϸ㶨������Ҫ��ȡӲ���ϵ����ݣ����� map+io = Properties
	 * 
	 *
	 * 
	 */

	public static void main(String[] args) throws IOException {
		
		//�������ļ���װ�ɶ���
		File confile = new File("count.properties");
		if(!confile.exists()){
			confile.createNewFile();
		}
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(confile);
		prop.load(fis);
		
		//�Ӽ�����ͨ������ȡ����
		String value = prop.getProperty("time");
		
		//�������������¼��ȡ���Ĵ���
		int count = 0;
		if(value!=null){
			count = Integer.parseInt(value);
			if(count>=5){
				throw new RuntimeException("ʹ�ô����ѵ���");
			}
		}
		count++;
		
		
		//���ı��Ĵ������´洢��������
		prop.setProperty("time", count+"");
		
		FileOutputStream fos = new FileOutputStream(confile);
		
		prop.store(fos, "");
		
		fos.close();
		fis.close();

	}
}
















