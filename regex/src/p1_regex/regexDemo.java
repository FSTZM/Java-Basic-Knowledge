package p1_regex;

public class regexDemo {
	
	/*
	 * 正则表达式
	 * 
	 * 正则表达式用于操作字符串数据
	 * 通过一些特定的符号来体现的
	 * 所以我们为了掌握正则表达式，必须要学习一些符号
	 * 虽然简化了 但是阅读性差
	 */

	public static void main(String[] args) {
		
		String s = "980366719";
//		checkQQ(s);
		
		String regex = "[1-9][0-9]{4,14}"; //正则表达式 4到14次
		
		boolean b = s.matches(regex);
		System.out.println(s + ":" + b);
		
	}
	
	/*
	 * 需求：定义一个功能对QQ号进行校验
	 * 要求：长度5~15，只能是数字，0不能开头
	 */
	public static void checkQQ(String qq){
		
		int len = qq.length();
		
		if(len >= 5 && len <= 15){
			if(!qq.startsWith("0")){
				try{
					long l = Long.parseLong(qq);
					System.out.println(l + ":正确");
				}catch(NumberFormatException e){
					System.out.println(qq + ":含有非法字符");
				}
				
			}else{
				System.out.println(qq + ":不能以0开头");
			}
			
			
		}else{
			System.out.println(qq + "长度不符合");
		}
		
		
	}
	

}
