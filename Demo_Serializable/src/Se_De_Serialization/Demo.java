package Se_De_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo_Serialization implements java.io.Serializable {

	public int a;
	public String b;

//	Default constructor
	public Demo_Serialization(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

class Test {
	public static void main(String[] args) {
		Demo_Serialization object = new Demo_Serialization(1, "geeksforgeeks");
		String filename = "file.ser";

//		Serialization
		try {
//			Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

//			Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();
			
			System.out.println("Object has been serialized.");
			
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
		Demo_Serialization object1 = null;
		
//		Deserialization
		try {
//			Reading the object from file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
//			Mothod for desirialization of object
			object1= (Demo_Serialization)in.readObject();
			
			in.close();
			file.close();
			
			System.out.println(" Object has been desialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}
		catch (IOException ex) {
			
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}
		
	}
}
