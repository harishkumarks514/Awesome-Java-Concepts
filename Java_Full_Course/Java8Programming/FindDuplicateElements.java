package Java8Programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// How to find duplicate elements in a given integers list in java using Stream functions?

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		
		FindDuplicateElements fd = new FindDuplicateElements();
		//fd.getDataWithoutDuplicates();  
		//fd.repeatedNumbers();
		//fd.getDataWithDuplicates();
		fd.getDistinctValues();
	}

	/* This will give the output of all repeated number */
	public static void repeatedNumbers()
	{
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet<>();
		myList.stream()
		.filter(n->!set.add(n))
		.forEach(System.out::println);
		//output : 98,15 /* Example 98 and 15 are the only repeated values in the list */		
	}

	/* Way 1 - Gives list of all distinct/unique values */
public static void getDataWithoutDuplicates()
{
	List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
	 myList.stream().distinct()
	.forEach(noDuplicateData -> System.out.println
	(noDuplicateData));
}

/* Way 2 -  Gives list of all distinct/unique values */
public static void getDataWithDuplicates()
{
	List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
	Set<Integer> set = new HashSet<>(myList);
	
	//convert the set back to a list if needed
     List<Integer> uniqueData = set.stream().collect(Collectors.toList());
     //print the unique elements
     uniqueData.forEach(System.out::println);
}

/* Way 3 - Gives list of all distinct/unique values */
/* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */
public static void getDistinctValues()
	{
	int[] arr = {10,15,8,49,25,98,98,32,15};
	List<Integer> list = Arrays.stream(arr).boxed().distinct()
			.collect(Collectors.toList());
	
	}

}