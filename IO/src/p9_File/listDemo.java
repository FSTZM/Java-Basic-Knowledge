package p9_File;

import java.io.File;

import p9_filter.filterByName;

public class listDemo {

	public static void main(String[] args) {
		
		listDemo();

	}

	public static void listDemo() {
		
		File file = new File("D:\\");
		
		//调用list方法的File对象中封装的必须是目录，否则会发生空指针异常
		//如果访问的是系统级目录也会发生空指针异常。
		//如果目录存在但是没有内容，会返回一个数组，但是长度为0
		String[] names = file.list(new filterByName());
		for(String name : names){
			System.out.println(name);  //打印当前目录下的所有文件名称，包含隐藏文件
		}
		
	}

}
