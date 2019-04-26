package p10_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Map
		 * 	|--HashTable
		 * 		|--Properties
		 * 
		 * Properties���ϣ�
		 * �ص㣺
		 * 1.�ü����еļ���ֵ�����ַ������͡�
		 * 2.�����е����ݿ��Ա��浽���У����ߴ����л�ȡ��
		 * 
		 * ͨ���ü������ڲ����Լ�ֵ�Դ��ڵ������ļ���
		 * 
		 * 
		 */
//		propertiesTest();
//		propertiesTest_2();
//		propertiesTest_3();
//		propertiesTest_4();
		propertiesTest_5();
	}
	

	public static void propertiesTest_5() throws IOException {
		
		//�����е������ļ��е���Ϣ�����޸�
		/*
		 * ��ȡ����ļ�
		 * ��������ļ��еļ�ֵ���ݴ洢��������
		 * ��ͨ�����϶����ݽ����޸�
		 * ��ͨ�������޸ĺ�����ݴ洢���ļ��С�
		 * 
		 */
		
		//��ȡ�ļ�
		File file = new File("info.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		
		FileReader fr = new FileReader(file);
		
		//�������ϴ洢������Ϣ
		Properties p = new Properties();
		
		//��������Ϣ�洢��������
		p.load(fr);
		
		p.setProperty("wangwu", "20");
		
		FileWriter fw = new FileWriter(file);
		
		fw.close();
		
		fr.close();
		
	}


	public static void propertiesTest_4() throws IOException {
		
		Properties p = new Properties();
		
		//�����е�����������һ���ļ�
		//ע�⣺���뱣֤���ļ��е������Ǽ�ֵ��
		//��Ҫʹ�ö�ȡ��
		
		FileInputStream fis = new FileInputStream("info.txt");
		
		//ʹ��load����
		p.load(fis);
		
		p.list(System.out);
		
	}

	public static void propertiesTest_3() throws IOException {
		
		//����������Ϣ
		//store �˷����ʺ�ʹ��load(InputStream)�������ص�Properties���еĸ�ʽ������Properties���е������б�(����Ԫ��)д�������
		//public void store(OutputStream out,String comments)
		//public void store(Writer writer,String comments
		Properties p = new Properties();
		
		p.setProperty("zhangsan", "30");
		p.setProperty("lisi", "32");
		p.setProperty("zhaoliu", "31");
		p.setProperty("wangwu", "28");
		
		FileOutputStream fos = new FileOutputStream("info.txt");
		
		p.store(fos, "name+age");
		
		fos.close();
		
	}

	public static void propertiesTest_2() {

		Properties p = new Properties();
	
		p.setProperty("zhangsan", "30");
		p.setProperty("lisi", "32");
		p.setProperty("zhaoliu", "31");
		p.setProperty("wangwu", "28");//����һ���� ��Щ��Ϣ�Ͷ����ͷ�û����
		
		p.list(System.out); //�������б������ָ������������˷����Ե��Ժܹ���
		
		
	}

	/*
	 * properties���ϵĴ�ȡ
	 */
	
	public static void propertiesTest(){
		
		//����һ��Properties����
		Properties p = new Properties();
		
		//�洢Ԫ��
		p.setProperty("zhangsan", "30");
		p.setProperty("lisi", "32");
		p.setProperty("zhaoliu", "31");
		p.setProperty("wangwu", "28");
		
		//�޸�Ԫ��
		p.setProperty("wangwu", "23");
		
		//ȡ������Ԫ��
		Set<String> names = p.stringPropertyNames();
		
		for(String name : names){
			String value = p.getProperty(name);
			
			System.out.println(name + ":" + value);
		}
		
	}
	

}
