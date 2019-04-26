package p7_bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copydemo {

	public static void main(String[] args) throws IOException {

		copy_4();
	}

	//第四种方式效率特别低！
	public static void copy_4() throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\饮雪水.jpg");
		FileOutputStream fos = new FileOutputStream("D:\\4.jpg");
		
		int ch = 0;
		
		while((ch = fis.read())!= -1){
			fos.write(ch);
		}
		
	}

	public static void copy_3() throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\饮雪水.jpg");
		FileOutputStream fos = new FileOutputStream("D:\\3.jpg");
		
		byte[] buf = new byte[fis.available()];
		
		fis.read(buf);
		fos.write(buf);
		
		fis.close();
		fos.close();
		
	}

	public static void copy_2() throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\饮雪水.jpg");
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("D:\\2.jpg");
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
		int len = 0;
		byte[] buf = new byte[1024];
		while((len = bufis.read(buf))!= -1){
			bufos.write(buf,0,len);
			bufos.flush();
		}
		
		bufis.close();
		bufos.close();
		
		
	}

	public static void copy_1() throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\饮雪水.jpg");
		FileOutputStream fos = new FileOutputStream("D:\\1.jpg");
		byte[] buf = new byte[1024];
		
		int len = 0;
		while((len = fis.read(buf))!= -1){
			fos.write(buf);
		}
		
	}

}
