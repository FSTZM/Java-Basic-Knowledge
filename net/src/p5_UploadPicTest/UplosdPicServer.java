package p5_UploadPicTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UplosdPicServer {

	public static void main(String[] args) throws IOException {
		
		//1,serverSocket
		ServerSocket ss = new ServerSocket(10288);
		
		while(true){
			Socket s = ss.accept();
			

			new Thread(new UploadPicTask(s)).start();
			
		}
		
		
		

	}

}
