package p2_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceDemo_2 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * ����UDP���ն˵�˼·
		 * 1.����UDP socket����
		 * 2.�������ݰ������ڴ洢���յ������ݡ����������ݰ��������������Щ����
		 * 3.ʹ��socket�����receive���������յ������ݴ洢�����ݰ���
		 * 4.ͨ�����ݰ��ķ����������ݰ��е���Դ
		 * 5.�ر���Դ
		 */
		
		System.out.println("222222222");
		
		//1.����udp socket����
		DatagramSocket ds = new DatagramSocket(12345); //����ƥ��Ķ˿�
		
		//2.�������ݰ�
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		//3.receive����
		ds.receive(dp);  //����ʽ
		
		//4.������Դ.�������е����ݣ������ַ���˿ڡ����ݵ�
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String text = new String(dp.getData(),0,dp.getLength());
		
		System.out.println(ip + ": " + port + ": " + text);
		
		//5.�ر���Դ
		ds.close();

	}

}
