package p5_UploadTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {
		
		//1.ServerSocket
		ServerSocket ss = new ServerSocket(13450); 
		
		//2.��ȡsocket���󣬷������ӳɹ�����Ϣ
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress() + "���ӳɹ�");
		
		//3.��
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4.д
		BufferedWriter bufw = new BufferedWriter(new FileWriter("D:\\success.txt"));
		String line = null;
		while((line = bufIn.readLine())!=null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
			
		}
		
		//5.���Ͷ�ȡ��ϵ���Ϣ
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("�ϴ��ɹ�");
		
		//6.�ر���
		bufw.close();
		s.close();
		ss.close();
	}

}
