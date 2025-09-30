package Datatypes;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(4);
		
		
     List<Integer> newList =		list.stream().sorted((a,b)-> a.compareTo(b)).collect(Collectors.toList());
	
     System.out.println(newList);
     
		newList.forEach(a->System.out.println(a+ " "));
	}
}
