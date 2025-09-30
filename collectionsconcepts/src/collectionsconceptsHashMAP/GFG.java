package collectionsconceptsHashMAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GFG {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

//		Adding mappings to above  HashMap
//		using put() method
		hm.put("KantRaj", 95);
		hm.put("Darshan", 99);
		hm.put("Steev Jobs", 40);
		hm.put("Deelip", 70);

//		Print All elements of HashMap
		System.out.println("Created hashmap is" + hm);

		
//		Getting an iterator
		Iterator hmIterator = hm.entrySet().iterator();
		

//		Display message only
		System.out.println("HashMap after adding bonus marks :");

//		Iterating through HashMa and
//		adding some bonus marks for every student
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int marks = ((int) mapElement.getValue() + 10);

//			Printing marks corresponding to string entries
			System.out.println(mapElement.getKey() + " : " + marks);
		}

	}

}