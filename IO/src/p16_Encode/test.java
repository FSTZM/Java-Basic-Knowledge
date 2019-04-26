package p16_Encode;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.swing.text.DefaultEditorKit.CutAction;

public class test {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 分隔字符
		 */
		
		String str = "hi你好ab再见xixi";
		
		for (int x = 0; x < str.getBytes().length; x++) {
			System.out.println("截取长度为" + (x+1) +"时输出的结果为: " + cutByByte(str,x+1));
		}
		

	}

	public static String cutByByte(String str,int len) throws IOException{
		int count = 0;
		byte[] buf = str.getBytes("gbk");
		for (int i = len-1; i >= 0; i--) {
			if(buf[i]<0)
				count++;
			else
				break;
		}
		
		if(count%2 == 0)
			return new String(buf,0,len,"gbk");
		else
			return new String(buf,0,len-1,"gbk");
		
		
	}
	
}
