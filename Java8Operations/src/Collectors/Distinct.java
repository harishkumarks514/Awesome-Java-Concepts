package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,2,22,1);
		
		List<Integer> result = numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}