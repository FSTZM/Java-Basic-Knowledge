package p11_print;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

import javax.sound.midi.Sequence;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 将“buf.txt”“bytedemo.txt”“copytest.txt”中的数据合并到一个文件中
		 */
		
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		
		v.add(new FileInputStream("buf.txt"));
		v.add(new FileInputStream("bytedemo.txt"));
		v.add(new FileInputStream("copytest.txt"));
		
		Enumeration<FileInputStream> en = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("sequenceDemo.txt");
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		
		fos.close();
		sis.close();
		

	}

}
