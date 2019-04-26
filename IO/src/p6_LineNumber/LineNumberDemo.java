package p6_LineNumber;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("IOÁ÷_1.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
		
		while((line=lnr.readLine())!= null){
			System.out.println(lnr.getLineNumber() + ":" + line);
		}

		lnr.close();
	}

}
