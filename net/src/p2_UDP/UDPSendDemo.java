package p2_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * ����udp����ķ��Ͷ�
		 * 
		 * ˼·��
		 * 1.����udp��socket����
		 * 2.��Ҫ���͵����ӷ�װ�����ݰ���
		 * 3.ͨ��udp��socket�������ݰ����ͳ�ȥ
		 * 4.�ر�socket����
		 * 
		 */
		
		System.out.println("1111111111");
		
		//1.udpsocket����ʹ��DatagramSocket����
		DatagramSocket ds = new DatagramSocket();
		
		//2.��Ҫ���͵����ݷ�װ�����ݰ���
		String str = "su";
			//ʹ��DatagramPacket�����ݷ�װ��������С�
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.170.63.112"),12345);
		
		//3.ͨ��udp��socket�������ݰ����ͳ�ȥ��ʹ��send����
		ds.send(dp);
		
		//4.�ر���Դ
		ds.close();
	}

}




















