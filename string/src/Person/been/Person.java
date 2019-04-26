package Person.been;

public class Person implements Comparable{
	
	private String name;
	private int age;
	
	/*
	
	@Override
	public int hashCode() {
		
		//System.out.println(this + "---hashcode---" );
		return name.hashCode() + age;//�ж��˵Ĺ�ϣֵ�Ƿ���ͬ
		
	}
	@Override
	public boolean equals(Object obj) {
		
		//System.out.println(this + "---equals---" + obj);
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age == p.age; //�ж��˵������Ƿ���ͬ
		
	}
	
	*/

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} 
		else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	public Person() {
		super();
	
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
	
	public String toString(){
		return name + ": " + age;
	}
	
	@Override
	public int compareTo(Object o) {
		
		Person p = (Person)o;
		
		int temp = this.age - p.age;
		return temp == 0?this.name.compareTo(p.name):temp;
		
	
//		if(this.age > p.age)
//			return 1;
//		if(this.age < p.age)
//			return -1;
//		
//		if(this.age == p.age){
//			this.name.compareTo(p.name);
//		}
	
//		return 0; //�������˵��������ʱ������set��Ψһ�ԣ��ͻ�ɾ��һ���˵���Ϣ
		
	}

}
