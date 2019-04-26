package p3_Comparator;

import java.util.Comparator;

import p2_Generic.been.Person;

public class ComparatorByName implements Comparator<Person> {

	
	@Override
	public int compare(Person o1, Person o2) {
		
		int temp = o1.getName().compareTo(o2.getName());

		return temp == 0?o1.getAge()-o2.getAge():temp;
		
	}

}
