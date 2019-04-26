package p2_UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo_2 {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket();
		
		//¼üÅÌÂ¼Èë
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		while((line = bufr.readLine())!=null){
			if("over".equals(line))
				break;
			
			byte[] buf = line.getBytes();
			DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.170.63.112"),12345);
			ds.send(dp);
		}
		
		ds.close();
	}

}




















