package p13_ObjectStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		writeDemo();
		readDemo();
			
	}
	
	public static void readDemo() throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
		
		Person p = (Person) ois.readObject();
		
		System.out.println(p.getName() + ":" + p.getAge());
		
	}

	public static void writeDemo() throws IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
		
		//Exception in thread "main" java.io.NotSerializableException: p13_ObjectStream.Person
		//对象序列化。被序列化的对象必须实现Serializable接口
		oos.writeObject(new Person("su",23));
		
		oos.close();
		
		
	}

}
