package Java_Basics_and_OOPS.abstraction.copy;

import java.util.HashMap;

public class HashMapOfJava {

	public static void main(String[] args) {
		HashMap< Integer, Integer> HashNum = new HashMap<Integer,Integer>();
		
		HashNum.put(1, 10);
		HashNum.put(2, 20);
		HashNum.put(1, 10);
		
		System.out.println(HashNum);
	}
}