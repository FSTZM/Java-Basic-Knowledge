package p4_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class clentDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//�ͻ��˷����ݵ������
		/*
		 * TCP����,�ͻ��˽����Ĺ���
		 * 1.����TCP�ͻ���socket����ʹ�õ���Socket����(��װ��IP+�˿ں�)
		 * 		����ö���һ��������ȷĿ�ĵء�Ҫ���ӵ�������
		 * 2.������ӽ����ɹ���˵�����ݴ���ͨ���Ѿ�����
		 * 		��ͨ������Socket�����ǵײ㽨���õġ���Ȼ�������������������������
		 * 		��Ҫ���������������󣬿�����Socket����ȡ
		 * 		����ͨ��getOutputStream(), getIntputStream()����ȡ�����ֽ���
		 * 3.ʹ���������������д����
		 * 4.�ر���Դ��
		 * 		
		 */
		
		Socket socket = new Socket("10.170.32.115",10302);
		
		OutputStream out = socket.getOutputStream();
		
		out.write("hahaha".getBytes());
		
		socket.close();
		

	}

}


















































