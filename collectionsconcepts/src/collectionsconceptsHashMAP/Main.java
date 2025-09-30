package collectionsconceptsHashMAP;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

//		Create a HashMap
		HashMap<String, Integer> numbers = new HashMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("three", 3);
		System.out.println("HashMap : " + numbers);

//		access each entry of the hashmap
		System.out.print("Entries ");

//		entrySet() returns a set view of all entries
//		for-each loop access each entry from the view

		for (Entry<String, Integer> entry : numbers.entrySet()) {

			System.out.print(entry);
			System.out.print(", ");
			
			
		}

	}

}
