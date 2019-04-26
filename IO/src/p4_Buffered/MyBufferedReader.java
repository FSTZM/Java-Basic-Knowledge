package p4_Buffered;

import java.io.FileReader;
import java.io.IOException;

/**
 * 自定义读取缓冲区。其实就是模拟一个BufferedReader.
 * @author Diane
 * 
 * 分析：
 * 缓冲区无非就是封装了一个数组
 * 并且对外提供了更多的方法对数组进行访问
 * 其实这些方法最终操作的都是数组的角标
 * 
 * 缓冲的原理：
 * 从源中获取一批数据装进缓冲区中
 * 再从缓冲区中不断地取出一个一个数据
 * 
 * 但是，此次取完
 *
 */

public class MyBufferedReader {
	
	private FileReader r;
	
	//定义缓冲区
	private char[] buf = new char[1024];
	
	//定义一个指针用于操作这个数组中的元素。当操作到最后一个元素时，指针应该归零
	private int pos = 0;
	
	//定义一个计数器用于记录缓冲区中的数据个数。当数据减到0时，就从源中继续获取数据到缓冲区中
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
		//1.从源中获取一批数据到缓冲区中.需要先作判断，只有计数器为0时，才需要从源中获取数据
		if(count == 0){
			count = r.read(buf);
			
			if(count <0)
				return -1;
			
			//每次缓冲数据到缓冲区中，角标都要归零
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
				return sb.toString();//一行到头了，直接返回
			//既不是\r 也不是\n 就接着存
			sb.append((char)ch);
		}
		
		return null;
	}

}
