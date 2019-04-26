package p2_reflectTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class reflectTest {
	
	/*
	 * 电脑运行
	 */

	public static void main(String[] args) throws Exception {

		mainBoard mb = new mainBoard();
		mb.run();
		
		//每次添加一个设备都需要修改代码传递一个新建的对象
		//能不能不修改这个代码就可以完成这个动作
		//不用new来完成，而是只获取class文件，在内部实现创建对象的动作
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
