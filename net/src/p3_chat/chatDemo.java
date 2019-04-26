package p3_chat;

import java.net.DatagramSocket;
import java.net.SocketException;

public class chatDemo {

	public static void main(String[] args) throws SocketException {
		
		DatagramSocket sends = new DatagramSocket();
		DatagramSocket reces = new DatagramSocket(11111);
		new Thread(new send(sends)).start();
		new Thread(new rece(reces)).start();

	}

}
