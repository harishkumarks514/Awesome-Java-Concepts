package Java_Basics_and_OOPS.abstraction.copy;

import java.util.HashSet;
import java.util.Set;

public class MapSetOfJava {
	
	public static void main(String[] args) {
		Set<Integer> setNum = new HashSet<>();
		setNum.add(1);
		setNum.add(2);
		setNum.add(3);
		setNum.add(3);
		setNum.add(2);
		
		System.out.println(setNum);
		
	}

}