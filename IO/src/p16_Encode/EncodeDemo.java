package p16_Encode;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * ×Ö·û´® --> ×Ö½ÚÊý×é£º±àÂë
		 * ×Ö·ûÊý×é --> ×Ö·û´®£º½âÂë
		 * 
		 * 
		 * 
		 */
		
		String str = "Ð»Ð»";
		
		byte[] buf = str.getBytes();
		
		String s1 = new String(buf,"UTF-8");
		
		System.out.println("s1=" + s1);
		
		
		byte[] buf2 = s1.getBytes();
		String s2 = new String(buf2,"UTF-8");
		System.out.println("s2=" + s2);
		

	}

}
