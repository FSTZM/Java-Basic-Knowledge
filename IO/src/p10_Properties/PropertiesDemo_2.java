package p10_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo_2 {
	
	/*
	 * 定义一个功能，获取一个程序运行的次数，如果超过五次，给出使用次数已到请注册的提示。并不要在运行程序。
	 * 
	 * 1.计数器
	 * 		程序启动一次，计数一次
	 * 2.计数器计数一个变量
	 * 3.如何去使用计数器？
	 * 		首先，程序启动时，应该先读取这个用于记录计数器信息的配置文件
	 * 	 获取上一次计数次数，并进行使用次数的判断
	 * 	 其次，对该计数器进行自增，并自增后的数据存储
	 * 4.文件中的信息该如何进行存储并体现。
	 * 		直接存储次数值就可以，但是不明确该数据的含义。所以起名字就变得很重要
	 * 	 这就有了名字和值得对应，所以可以使用键值对。
	 * 	 可是映射关系map集合搞定，又需要读取硬盘上的数据，所以 map+io = Properties
	 * 
	 *
	 * 
	 */

	public static void main(String[] args) throws IOException {
		
		//将配置文件封装成对象
		File confile = new File("count.properties");
		if(!confile.exists()){
			confile.createNewFile();
		}
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(confile);
		prop.load(fis);
		
		//从集合中通过键获取次数
		String value = prop.getProperty("time");
		
		//定义计数器。记录获取到的次数
		int count = 0;
		if(value!=null){
			count = Integer.parseInt(value);
			if(count>=5){
				throw new RuntimeException("使用次数已到！");
			}
		}
		count++;
		
		
		//将改变后的次数重新存储到集合中
		prop.setProperty("time", count+"");
		
		FileOutputStream fos = new FileOutputStream(confile);
		
		prop.store(fos, "");
		
		fos.close();
		fis.close();

	}
}
















