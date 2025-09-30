package Collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Alice","Bob","z");
		List<String> result = names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
