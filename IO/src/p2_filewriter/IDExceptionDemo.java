package p2_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IDExceptionDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	
	public static void main(String[] args) {// ����쳣��ʽһ������  throws IOException {
		
		//��ʽ����ѡ�г����쳣�Ĵ��� alt + б�� try catch
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("IOExceptionDemo.txt", true); //�����ļ��᲻����

			fw.write("su" + LINE_SEPARATOR + "yuqin");

			//fw.close(); //�رյײ���Դ���ɵײ����Ϸ���
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			
//			fw.close();//�ᱨ����Ϊfwֻ��try�б���������˽�fw���ⲿ����
			try {
				fw.close(); //try catch���� ��������
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		

	}

}
