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
		
		//2,��ȡ�ͻ���Ҫ�ϴ���ͼƬ�ļ�
//		File file = new File("D:\\��ѩˮ.jpg");
		FileInputStream fis = new FileInputStream("D:\\�ű�����.jpg");
		
		//3,��ȡsocket�����������ȡ����ͼƬ���ݷ��͸������
		OutputStream out = s.getOutputStream();
		
		int len = 0;
		byte[] buf = new byte[1024];
		while((len = fis.read(buf))!= -1){
			out.write(buf,0,len); 
		}
		
		//4,���������������������
		s.shutdownOutput();
		
		//5,��ȡ����˷��ص���Ϣ
		InputStream in = s.getInputStream();
		
		byte[] bufIn = new byte[1024];//-------
		
		int lenIn = in.read(bufIn);
		String text = new String(bufIn,0,lenIn);
		System.out.println(text);
		
		//6,�ر���
		fis.close();
		s.close();

	}

}
