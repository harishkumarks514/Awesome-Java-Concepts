package Java_8;

import java.util.Arrays;

public class SecondHighestNumberJava8 {

	public static void main(String[] args) {

		int[] arr = {5, 7, 2, 9, 1, 9, 6, 3,11};

		//Use java 8 streams to find second highest 

		int secondHighest = Arrays.stream(arr)
				.distinct() // remove duplicates
				.boxed()    // convert to Integer
				.sorted((a,b) -> b-a)  // sort in descending order
				.skip(3)       // skip the highest element
				.findFirst()  // get the second one
				.orElseThrow(() ->
				new RuntimeException("No second highest element"));

		System.out.println("Second highest element : " + secondHighest);
	}
}