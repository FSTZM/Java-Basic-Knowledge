package p4_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverDemo {

	public static void main(String[] args) throws IOException {
//		����˽��տͻ��˷��������ݣ�����ӡ�ڿ���̨��
		/*
		 * ����TCP����˵�˼·��
		 * 1.���������socket����ͨ��ServerSocket����
		 * 2.����˱����������һ���˿ڣ�����ͻ����޷�����
		 * 3.��ȡ���ӹ����ĵĿͻ��˶���
		 * 4.ͨ���ͻ��˶����ȡsocket����ȡ�ͻ��˷���������
		 * 		����ӡ�ڿ���̨��
		 * 5.�ر���Դ --- �ر�����
		 * 		�رտͻ���
		 * 		�رշ����
		 * 
		 */

		//1.��������˶���
		ServerSocket ss = new ServerSocket(10302);
		
		//2.��ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();  //�ͻ��˶�����socket���͵ģ����ӹ����Ķ��������Լ�����������ss.###
		
		//3.ͨ��socket�����ȡ��������Ҫ��ȡ�ͻ��˷���������
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println("serve: " + text);
		
		s.close();
		ss.close();
		
		
	}

}
