package p13_ObjectStream;

import java.io.Serializable;

//Exception in thread "main" java.io.NotSerializableException: p13_ObjectStream.Person
public class Person implements Serializable {
	/**
	 * transient:非静态数据不想被序列化可以使用这个关键字修饰。
	 */
//	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
//	private transient String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	

}
