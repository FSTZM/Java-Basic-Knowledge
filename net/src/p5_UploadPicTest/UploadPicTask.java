package p5_UploadPicTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadPicTask implements Runnable {

	private Socket s;
	public UploadPicTask(Socket s){
		this.s = s;
	}
	
	@Override
	public void run() {
		
		System.out.println(s.getInetAddress().getHostAddress() + "connected");
		
		try{
		
		//3,读取客户端的图片数据,并存储
		InputStream in = s.getInputStream();
		
		
//				File dir = new File("D:\\pic");
//				if(!dir.exists()){
//					dir.mkdirs();
//				}
//				File file = new File(dir,s.getInetAddress().getHostAddress() +"_success.jpg");
//
//				FileOutputStream fos = new FileOutputStream(file);
		
		FileOutputStream fos = new FileOutputStream("D:\\" + s.getInetAddress().getHostAddress() +"_success.jpg");
		
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = in.read(buf))!= -1){
			fos.write(buf, 0, len);
		}
		
		//4,获取socket流，将传输成功信号返回给客户端
		OutputStream out = s.getOutputStream();
		out.write("success".getBytes());
		
		//5,关闭流
		fos.close();
		s.close();
		}catch(IOException e){
			
		}
	}

}
