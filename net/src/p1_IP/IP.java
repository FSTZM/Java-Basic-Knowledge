package p1_IP;

import java.io.IOException;
import java.net.InetAddress;

public class IP {

	public static void main(String[] args) throws IOException {
		
		String ip = InetAddress.getLocalHost().getHostAddress();
		System.out.println(ip);

	}

}
