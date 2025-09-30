package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//skip the 4 elements and fetch the remaining elements from a list of integers;

public class Skip {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> result = numbers.stream()
				.skip(4)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
