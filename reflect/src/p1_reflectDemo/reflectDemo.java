package p1_reflectDemo;

public class reflectDemo {

	public static void main(String[] args) {
		
		/*
		 * java反射机制是在运行过程中，对于任意一个类(class文件)，能够知道这个类的所有属性和方法；
		 * 对于任意一个对象，都能够调用它的任意一个方法和属性
		 * 这种动态获取信息以及动态调节调用对象的方法的功能称为java语言的反射机制
		 * 
		 * 动态获取类中的信息，就是java反射
		 * 可以理解为对类的解剖
		 * 
		 */
		
		/*
		 * 获取字节码对象的方式
		 * 1.Object类中的getClass()方法
		 * 		Person p = new Person();
		 * 		Class class = p.getClass(); 
		 * 		
		 * 2.任何数据类型都具备一个静态的属性.class来获取其对应的Class对象
		 * 		Class clazz = Person.class;
		 * 		相对简单，但是还是要明确用到类中的静态成员
		 * 		还是不够扩展。
		 * 3.只要通过给定的类的字符串名称就可以获取该类，更为扩展
		 * 	 可使用Class类中的方法完成
		 * 	 该方法就是forName
		 * 		String className = "package.Person";//要带上包名，尽管已经导了包
		 * 		Class clazz = Class.forName(className);
		 * 	 只要有名称即可，扩展更为方便。
		 */

	}

}
























