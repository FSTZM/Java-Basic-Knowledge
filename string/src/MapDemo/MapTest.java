package MapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * 练习：
 * “shibushisha” 获取该字符串中，每一个字母出现的次数
 * 要求打印结果是：a(次数)b(次数)...
 * 
 * 思路：
 * 字母和次数之间存在着映射关系，而且这种关系有很多，很多就需要存储，能存储映射关系的容器有数组和Map集合。
 * 
 * 关系有序吗？ --- 没有！ 那就使用Map集合，又发现可以保证唯一性的一方面又具备有序性
 * 所以可以使用TreeMap集合。
 * 
 * 1. 因为操作的是字符串中的字母，所以先将字符串变成字符串数组
 * 2. 遍历字符数组，用每一个字母作为键去查Map集合这个表
 * 		如果该字母键不存在，就将该字母作为键1存储到map集合中
 * 		如果该字母存在，就将该字母键对应值取出并+1，在将该字母和+1后的值存储到map集合中
 * 	  键相同就会覆盖，这样就记录了该字母的次数
 * 3. 遍历结束，map集合就记录了所有字母出现的次数
 * 
 */

public class MapTest {

	public static void main(String[] args) {
		
		String s = "shibushisha";
		
		String ans = getCharCount(s);
		
		System.out.println(ans);
	}

	public static String getCharCount(String s) {
		
		//将字符串变成字符串数组
		
		char[] ch = s.toCharArray();
		
		
		//定义map集合表
		
		Map<Character,Integer> ma = new TreeMap<Character,Integer>();
		
		//将数组中的字母作为键去查map表.字母作为键，次数作为值
		
		for (int i = 0; i < ch.length; i++) {
			
			Integer value = ma.get(ch[i]);
			
			if (value == null) {
				ma.put(ch[i], 1);
			}else {
				ma.put(ch[i], value+1);
			}
			
		}

//		return ma.toString();   // {a=1, b=1, h=3, i=2, s=3, u=1}
		
		return mapToString(ma);
		
	}

	private static String mapToString(Map<Character, Integer> ma) {
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<Character> it = ma.keySet().iterator();
		
		while(it.hasNext()){
			
			Character key = it.next();
			Integer value = ma.get(key);
			
			sb.append(key + "(" + value + ")");
			
		}
		
		return sb.toString();  //a(1)b(1)h(3)i(2)s(3)u(1)

		
		
	}



}
