package p3_regexTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTest2 {
	
	/*
	 * ��ҳ���棺��ʵ����һ�����������ڻ������л�ȡ����ָ�����������
	 * 
	 * ��ȡ�����ַ
	 * 
	 */

	public static void main(String[] args) throws IOException {
		
//		getMails();
		List<String> list = getMails();
		
		for(String mail : list){
			System.out.println(mail);
		}

	}

	public static List<String> getMails() throws IOException {
		
		//1.��ȡԴ�ļ�
//		BufferedReader bufr = new BufferedReader(new FileReader(""));
		
		URL url = new URL("https://tieba.baidu.com/p/5487885777");
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(url.openStream()));
		
		//2.�Զ�ȡ�����ݽ��й����ƥ�䣬���л�ȡ���Ϲ��������
		String mail_regex = "\\w+@\\w+(\\.\\w+)+";
		
		List<String> list = new ArrayList<String>();
		
		Pattern p = Pattern.compile(mail_regex);
		
		
		String line = null;
		while((line = bufIn.readLine())!=null){
			
			Matcher m = p.matcher(line);
			while(m.find()){			
				//3.�����Ϲ�������ݴ洢��������
				list.add(m.group());
			}			
		}
	
		return list;

	}

}
