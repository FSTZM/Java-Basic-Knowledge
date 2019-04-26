package p12_SplitFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class splitDemo {

	public static void main(String[] args) throws IOException {
		
		splitFile();

	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void splitFile() throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("D:\\ÒûÑ©Ë®.jpg");
		
		byte[] buf = new byte[1024*512];
		
		File dir = new File("D:\\split");
		if(!dir.exists()){
			dir.mkdirs();
		}
		
		int len = 0;
		int count = 1;
		FileOutputStream fos = null;
		
		while((len = fis.read(buf))!=-1){
			fos = new FileOutputStream(new File(dir,(count++)+".part"));
			fos.write(buf, 0, len);
		}
		
		fis.close();
		fos.close();
		
	}

}














