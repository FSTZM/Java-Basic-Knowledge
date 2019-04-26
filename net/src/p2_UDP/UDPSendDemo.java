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
		 * 创建udp传输的发送端
		 * 
		 * 思路：
		 * 1.建立udp的socket服务
		 * 2.将要发送的数居封装到数据包中
		 * 3.通过udp的socket服务将数据包发送出去
		 * 4.关闭socket服务
		 * 
		 */
		
		System.out.println("1111111111");
		
		//1.udpsocket服务，使用DatagramSocket对象。
		DatagramSocket ds = new DatagramSocket();
		
		//2.将要发送的数据封装到数据包中
		String str = "su";
			//使用DatagramPacket将数据封装到对象包中。
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.170.63.112"),12345);
		
		//3.通过udp的socket服务将数据包发送出去，使用send方法
		ds.send(dp);
		
		//4.关闭资源
		ds.close();
	}

}




















