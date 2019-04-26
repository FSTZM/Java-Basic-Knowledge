package p4_Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

//	private static final String LINE_SEPARATOR = System.lineSeparator();
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("buf.txt");
		
		BufferedWriter bufw = new BufferedWriter(fw);
		
//		bufw.write("suyuqin"+ LINE_SEPARATOR +"hahaha");
		
		//µ¥¶À»»ÐÐ
		bufw.write("ahahah");
		bufw.newLine();
		bufw.write("heiheihei");
		
		
		bufw.flush();
		
		bufw.close();
		
		
	}

}
