package p12_SplitFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class megerFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\split\\");
		megerDemo(file);

	}

	public static void megerDemo(File file) throws IOException {
		
		ArrayList<FileInputStream> a = new ArrayList<FileInputStream>();
		
		a.add(new FileInputStream(new File(file,"1.part")));
		a.add(new FileInputStream(new File(file,"2.part")));
		
		Enumeration<FileInputStream> en = Collections.enumeration(a);
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("D:\\1.jpg");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		while((len = sis.read(buf))!= -1){
			fos.write(buf,0,len);
		}
		
		fos.close();
		sis.close();
		
	}

}




























