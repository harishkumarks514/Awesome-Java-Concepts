package ImmediateMethodsOfStreamInJava;
// Java Program to illustrate Intermediate Methods of Streams 
// Case 1: filter(predicate) Method 

import java.util.ArrayList;
import java.util.List;
 
public class Test1 {

	public static void main(String[] args) {
		
		List<Integer> intList = List.of(15,20,48,63,49,27,56,32,9) ;
		prientEvenNumber(intList);
		 
	}
	  // Method 2
	  // Helper method 
	  // To print the even numbers using filter method. 
	
	private static void prientEvenNumber(List <Integer> intList)
	{
		// Display message 
		System.out.println("\n Even numbers are : ");
		
		// Illustrating filter method usage 
		intList.stream().filter(element -> (element %2==0)
				).forEach(element -> System.out.println(element+ " "));
	}
}
