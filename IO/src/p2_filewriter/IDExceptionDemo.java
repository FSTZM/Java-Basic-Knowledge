package p2_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IDExceptionDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	
	public static void main(String[] args) {// 解决异常方式一：声明  throws IOException {
		
		//方式二：选中出现异常的代码 alt + 斜线 try catch
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("IOExceptionDemo.txt", true); //可能文件会不存在

			fw.write("su" + LINE_SEPARATOR + "yuqin");

			//fw.close(); //关闭底层资源，由底层向上返回
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			
//			fw.close();//会报错，因为fw只在try中被声明，因此将fw在外部声明
			try {
				fw.close(); //try catch环绕 单独处理
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		

	}

}
