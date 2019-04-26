package p2_Generic.been;

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	
	
	
	public Person() {
		super();
	}
	
	public int compareTo(Person p){
		
//		Person p = (Person)obj;
		int temp = this.age - p.age;
		
		return temp==0?this.name.compareTo(p.name):temp;
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



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

	

}
