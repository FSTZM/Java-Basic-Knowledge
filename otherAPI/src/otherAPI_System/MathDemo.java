package otherAPI_System;

public class MathDemo {

	public static void main(String[] args) {
		
		/*
		 * Math: 提供了操作数学运算的方法。都是静态的。
		 * 
		 * 常用的方法：
		 * ceil()：向上取整
		 * floor()： 向下取整
		 * round()：返回四舍五入的整数
		 * 
		 * pow(a,b)：返回a的b次方
		 * random(): 随机数0-1
		 */
		
		double d1 = Math.ceil(12.56);
		double d2 = Math.floor(12.56);
		double d3 = Math.round(12.56);
		double d4 = Math.random();
		
		System.out.println("d1: " + d1);
		System.out.println("d1: " + d2);
		System.out.println("d1: " + d3);
		
		
		

	}

}
