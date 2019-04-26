package p8_transtream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		/*
		//×Ö½ÚÁ÷
		InputStream in = System.in;
		
		//ÇÅÁº
		InputStreamReader isr = new InputStreamReader(in);
		
		//×Ö·ûÁ÷
		BufferedReader bufr = new BufferedReader(isr);
		*/
		String line = null;
		while((line = bufr.readLine())!=null){
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		

	}

}
