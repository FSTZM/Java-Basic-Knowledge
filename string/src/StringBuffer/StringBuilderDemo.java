package StringBuffer;

/*
 * StringBuilder
 * StringBuilder 和 stringbuffer 用法一模一样
 * 但是StringBuilder 不保证同步 速度快 1.5版本JDK出现，StringBuffer 保证安全，保证同步
 * 
 * 一个线程添加数据，一个线程删除数据，删除和添加只能有一个在运行，添加时不能删除，删除时不能添加，否则会出现安全问题
 * 
 * 不同：
 *		StringBuffer是线程同步的，通常用于线程
 *		StringBuilder是线程不同步的，通常用于单线程，它的出现提高效率
 * 
 */

//将一个int数组变成字符串
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		int[] arr = {3,1,37,4,2,7,6};
		String s = intToString(arr);
		System.out.println(s);
		
	}

	public static String intToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				sb.append(arr[i] + ", ");
			}
			else{
				sb.append(arr[i] + "]");
			}
				
		}
		
		return sb.toString();
		
	}

}
