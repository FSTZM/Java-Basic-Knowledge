package p2_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceDemo_2 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 建立UDP接收端的思路
		 * 1.建立UDP socket服务
		 * 2.创建数据包，用于存储接收到的数据。方便用数据包对象解析解析这些数据
		 * 3.使用socket服务的receive方法将接收到的数据存储到数据包中
		 * 4.通过数据包的方法解析数据包中的资源
		 * 5.关闭资源
		 */
		
		System.out.println("222222222");
		
		//1.建立udp socket服务
		DatagramSocket ds = new DatagramSocket(12345); //设置匹配的端口
		
		//2.创建数据包
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		//3.receive方法
		ds.receive(dp);  //阻塞式
		
		//4.解析资源.解析其中的数据，比如地址、端口、数据等
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String text = new String(dp.getData(),0,dp.getLength());
		
		System.out.println(ip + ": " + port + ": " + text);
		
		//5.关闭资源
		ds.close();

	}

}
