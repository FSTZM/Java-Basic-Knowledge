package StringBuffer;

/*
 * StringBuffer ： 构造一个不带字符的字符串缓冲区初始容量为16个字符
 * 特点：
 * 		1. StringBuffer是可变长度的
 * 		2. 可以存储不同类型的数据
 * 		3. 最终要转化成字符串进行使用
 * 		4. 可以对字符串进行修改
 * 功能：
 * 		1. 添加
 * 			append(date)  返回的还是StringBuffer
 * 			insert(index data) 
 * 		2. 删除
 * 			StringBuffer delete(start,end)  包含头不包含尾
 * 			StringBuffer deleteCharAt(int index) 删除指定位置的元素
 * 			
 * 			清空缓冲区   s.delete(0,s.length());
 * 		3. 查找
 * 			char charAt(index);
 * 			int indexOf(string);
 * 			int lastIndexOf(index);
 * 		4. 修改
 * 			StringBuffer replace(start,end,string);
 * 			void setCharAt(index .char);
 * 		5. 设置长度
 * 			StringBuffer setLength(length);
 * 		6. 反转字符串
 * 			StringBuffer reverse();
 * 
 */



public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		
		s.append("abcsuyuqin");
		System.out.println("s = " + s);
		
		s.delete(0, 3);
		System.out.println("s = " + s);
		
		s.charAt(0);
		System.out.println(s.charAt(0));
		
		int index = s.indexOf("s");
		System.out.println(index);
		
		StringBuffer s1 = s.replace(4, 6, " ");
		System.out.println("s1 = " + s1);  //s1 = suyu n
		
		System.out.println(s.reverse());   //n uyus  stringbuffer已经被S1覆盖了
		
		

	}

}
