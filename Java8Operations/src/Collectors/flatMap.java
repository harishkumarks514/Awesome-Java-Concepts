package Collectors;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of lists of strings, flatten them into a single list of strings.
public class flatMap {

	public static void main(String[] args) {

		List<List<String>> ListOfLists = Arrays.asList(Arrays.asList("one", "two"), 
				Arrays.asList("three", "four"));

		List<String> result = ListOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());

		System.out.println(result);
	}
}
