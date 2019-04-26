package p3_CharStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺽�C���е��ļ����Ƶ�D��
 */

public class CopyTextTest_2 {

	public static void main(String[] args) throws IOException {
		
		char[] buf = new char[1024];
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try{
			fr = new FileReader("IO��_1.txt");
			fw = new FileWriter("copyIO��_1.txt");
			
			int len = 0;
			while((len = fr.read(buf))!= -1){
				fw.write(buf,0,len);
			}
		}catch(Exception e){
			
		}finally{
			
			if(fr!=null){
				try {
					fr.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(fw!=null){
				try {
					fw.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
//			fr.close();
//			fw.close();
		}

	}

}
