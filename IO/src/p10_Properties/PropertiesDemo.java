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
		 * Properties集合：
		 * 特点：
		 * 1.该集合中的键和值都是字符串类型。
		 * 2.集合中的数据可以保存到流中，或者从流中获取。
		 * 
		 * 通常该集合用于操作以键值对存在的配置文件。
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
		
		//对已有的配置文件中的信息进行修改
		/*
		 * 读取这个文件
		 * 并将这个文件中的键值数据存储到集合中
		 * 再通过集合对数据进行修改
		 * 再通过流将修改后的数据存储到文件中。
		 * 
		 */
		
		//读取文件
		File file = new File("info.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		
		FileReader fr = new FileReader(file);
		
		//创建集合存储配置信息
		Properties p = new Properties();
		
		//将流中信息存储到集合中
		p.load(fr);
		
		p.setProperty("wangwu", "20");
		
		FileWriter fw = new FileWriter(file);
		
		fw.close();
		
		fr.close();
		
	}


	public static void propertiesTest_4() throws IOException {
		
		Properties p = new Properties();
		
		//集合中的数据来自于一个文件
		//注意：必须保证该文件中的数据是键值对
		//需要使用读取流
		
		FileInputStream fis = new FileInputStream("info.txt");
		
		//使用load方法
		p.load(fis);
		
		p.list(System.out);
		
	}

	public static void propertiesTest_3() throws IOException {
		
		//保存属性信息
		//store 此方法适合使用load(InputStream)方法加载到Properties表中的格式，将此Properties表中的属性列表(键和元素)写入输出流
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
		p.setProperty("wangwu", "28");//程序一结束 这些信息就都被释放没有了
		
		p.list(System.out); //将属性列表输出到指定的输出流，此方法对调试很管用
		
		
	}

	/*
	 * properties集合的存取
	 */
	
	public static void propertiesTest(){
		
		//创建一个Properties集合
		Properties p = new Properties();
		
		//存储元素
		p.setProperty("zhangsan", "30");
		p.setProperty("lisi", "32");
		p.setProperty("zhaoliu", "31");
		p.setProperty("wangwu", "28");
		
		//修改元素
		p.setProperty("wangwu", "23");
		
		//取出所有元素
		Set<String> names = p.stringPropertyNames();
		
		for(String name : names){
			String value = p.getProperty(name);
			
			System.out.println(name + ":" + value);
		}
		
	}
	

}
