package p3_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class send implements Runnable {
	
	private DatagramSocket ds;
	
	send(DatagramSocket ds){
		this.ds = ds;
	}

	@Override
	public void run() {
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		try {
			while((line = bufr.readLine())!=null){
				if("over".equals(line))
					break;
				byte[] buf = line.getBytes();
				DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getByName("10.170.63.112"),11111);
				ds.send(dp);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		ds.close();
		
	}

}
