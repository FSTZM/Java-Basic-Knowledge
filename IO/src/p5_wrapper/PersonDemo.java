package p5_wrapper;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		NewPerson p1 = new NewPerson(p);
		p1.chifan();
		
		NewPerson2 p2 = new NewPerson2();
		p2.chifan();
	}

}

class Person{
	void chifan(){
		System.out.println("吃饭");
	}
}

//这个类的出现是为了增强Person而出现的
class NewPerson{
	private Person p;
	NewPerson(Person p){
		this.p = p;
	}
	
	public void chifan(){
		System.out.println("123");
		p.chifan();
		System.out.println("456");
	}
	
}

class NewPerson2 extends Person{
	public void chifan(){
		
		System.out.println("123");
		super.chifan();
		System.out.println("456");
	}
}














