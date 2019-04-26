package p15_piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStream {

	public static void main(String[] args) throws IOException {
		
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		
		in.connect(out);
		
		new Thread(new Input(in)).start();
		new Thread(new Output(out)).start();

	}

}

class Input implements Runnable{
	
	private PipedInputStream in;
	
	Input(PipedInputStream in){
		this.in = in;
	}

	@Override
	public void run() {
		try {
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			String s = new String(buf,0,len);
			System.out.println(s);
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

class Output implements Runnable{

	private PipedOutputStream out;
	
	Output(PipedOutputStream out){
		this.out = out;
	}
	
	@Override
	public void run() {
		try {
			out.write("houhou".getBytes());
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}















