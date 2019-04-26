package p3_chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class rece implements Runnable {
	
	private DatagramSocket ds;
	
	rece(DatagramSocket ds){
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			
			while(true){ 
				
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				
				ds.receive(dp);
				
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				String text = new String(dp.getData(),0,dp.getLength()); 
				
				System.out.println(ip + ": " + port + ": " + text);
				
				
				if("over".equals(text)){
					System.out.println(ip + "ÍË³öÁÄÌì");
				}
			}
		}catch (Exception e) {
		// TODO: handle exception	
		}

		ds.close();
	}
}
