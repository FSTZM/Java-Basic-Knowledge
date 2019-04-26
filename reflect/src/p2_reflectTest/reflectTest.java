package p2_reflectTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class reflectTest {
	
	/*
	 * ��������
	 */

	public static void main(String[] args) throws Exception {

		mainBoard mb = new mainBoard();
		mb.run();
		
		//ÿ�����һ���豸����Ҫ�޸Ĵ��봫��һ���½��Ķ���
		//�ܲ��ܲ��޸��������Ϳ�������������
		//����new����ɣ�����ֻ��ȡclass�ļ������ڲ�ʵ�ִ�������Ķ���
//		mb.usePCI(new soundCard());
		
		
		File configFile = new File("pci.properties");
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(configFile);
		prop.load(fis);
		
		for(int x = 0; x < prop.size(); x++){
			
			String pciName = prop.getProperty("pci" + (x+1));
			
			Class clazz = Class.forName(pciName);
			
			PCI p  = (PCI) clazz.newInstance();
			
			mb.usePCI(p);
			
		}
		
		fis.close();
		
	}

}
