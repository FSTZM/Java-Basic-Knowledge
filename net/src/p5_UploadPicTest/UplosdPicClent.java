package p5_UploadPicTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class UplosdPicClent {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1,
		Socket s = new Socket("10.170.15.108",10288);
		
		//2,读取客户端要上传的图片文件
//		File file = new File("D:\\饮雪水.jpg");
		FileInputStream fis = new FileInputStream("D:\\桥本环奈.jpg");
		
		//3,获取socket输出流，将读取到的图片数据发送给服务端
		OutputStream out = s.getOutputStream();
		
		int len = 0;
		byte[] buf = new byte[1024];
		while((len = fis.read(buf))!= -1){
			out.write(buf,0,len); 
		}
		
		//4,反馈给服务器，传输完毕
		s.shutdownOutput();
		
		//5,读取服务端发回的信息
		InputStream in = s.getInputStream();
		
		byte[] bufIn = new byte[1024];//-------
		
		int lenIn = in.read(bufIn);
		String text = new String(bufIn,0,lenIn);
		System.out.println(text);
		
		//6,关闭流
		fis.close();
		s.close();

	}

}
