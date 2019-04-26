package p8_transtream;

import java.io.IOException;
import java.io.InputStream;

public class ReadKey {

	public static void main(String[] args) throws IOException {
		
		readkey2();
//		System.out.println((int)'\r'); //13
//		System.out.println((int)'\n'); //10

	}

	public static void readkey2() throws IOException {
		
		/*
		 * ��ȡ�û�����¼�������
		 * �������ݱ�ɴ�д��ʾ�ڿ���̨��
		 * ����û��������over��������������
		 * 
		 * ˼·
		 * 1.��Ϊ����¼��ֻ��ȡһ���ֽڣ�Ҫ�ж��Ƿ���over��Ҫ�Ƚ��������ֽ�ƴ���ַ���
		 * 2.��Ҫ������--- StringBuilder
		 * 3.���û��س�֮ǰ��¼������ݱ���ַ����жϼ���
		 */
		
		//1.��������
		StringBuilder sb = new StringBuilder();
		
		//2.��ȡ���̶�ȡ��
		InputStream in = System.in;
		
		//3.���������¼��ȡ�����ֽڣ�ѭ����ȡ
		int ch = 0;
		
		while((ch = in.read())!=-1){
			
			//�洢֮ǰ�ж��Ƿ��ǻ��б�ۣ����б�ǲ���
			if(ch == '\r')
				continue;
			if(ch == '\n'){
				String temp = sb.toString();
				if("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length()); //���������clear��StringBuilder��StringBuffer�����delete
			}
			else
			sb.append((char)ch);
			
//			System.out.println(ch);
		}
	
	}

	public static void readkey() throws IOException {
		
		InputStream in = System.in;
		
		int ch = in.read();//����ʽ������һֱ��ȡ��ֱ����ȡ�����ݡ�
		
		System.out.println(ch);
	}

}
