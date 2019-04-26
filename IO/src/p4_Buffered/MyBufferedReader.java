package p4_Buffered;

import java.io.FileReader;
import java.io.IOException;

/**
 * �Զ����ȡ����������ʵ����ģ��һ��BufferedReader.
 * @author Diane
 * 
 * ������
 * �������޷Ǿ��Ƿ�װ��һ������
 * ���Ҷ����ṩ�˸���ķ�����������з���
 * ��ʵ��Щ�������ղ����Ķ�������ĽǱ�
 * 
 * �����ԭ��
 * ��Դ�л�ȡһ������װ����������
 * �ٴӻ������в��ϵ�ȡ��һ��һ������
 * 
 * ���ǣ��˴�ȡ��
 *
 */

public class MyBufferedReader {
	
	private FileReader r;
	
	//���建����
	private char[] buf = new char[1024];
	
	//����һ��ָ�����ڲ�����������е�Ԫ�ء������������һ��Ԫ��ʱ��ָ��Ӧ�ù���
	private int pos = 0;
	
	//����һ�����������ڼ�¼�������е����ݸ����������ݼ���0ʱ���ʹ�Դ�м�����ȡ���ݵ���������
	private int count = 0;
	
	MyBufferedReader(FileReader r){
		this.r = r;
	}
	
	public int myRead() throws IOException{
		
		if(count == 0){
			count = r.read(buf);
			pos = 0;
		}
		if(count < 0)
			return -1;
		
		char ch = buf[pos++];
		count--;
		
		return ch;
		
		/*
		//1.��Դ�л�ȡһ�����ݵ���������.��Ҫ�����жϣ�ֻ�м�����Ϊ0ʱ������Ҫ��Դ�л�ȡ����
		if(count == 0){
			count = r.read(buf);
			
			if(count <0)
				return -1;
			
			//ÿ�λ������ݵ��������У��Ǳ궼Ҫ����
			pos = 0;
			char ch = buf[pos];
			
			pos++;
			count--;
			
			teturn ch;
			
		}else if(count > 0){
			char ch = buf[pos];
			
			pos++;
			count--;			
		}
	*/	
	}	
		
	public String myReadLine()throws IOException{
		
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		while((ch = myRead())!= -1){
			
			if(ch == '\r')
				continue;
			if(ch == '\n')
				return sb.toString();//һ�е�ͷ�ˣ�ֱ�ӷ���
			//�Ȳ���\r Ҳ����\n �ͽ��Ŵ�
			sb.append((char)ch);
		}
		
		return null;
	}

}
