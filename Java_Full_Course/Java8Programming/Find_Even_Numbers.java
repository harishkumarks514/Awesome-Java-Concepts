package Java8Programming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
public class Find_Even_Numbers {

	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		//list.stream()
		//filter(n->n%2==0)
	//forEach(System.out :: println);
		
		 /* or can also try below method */

		/* When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; */
		 int[] arr = {10,15,8,49,25,98,32};
		Map<Boolean, List<Integer>> lis = Arrays.stream(arr).boxed()
		.collect(Collectors.partitioningBy(num -> num %2 ==0));
		System.out.println(lis);
	}
}