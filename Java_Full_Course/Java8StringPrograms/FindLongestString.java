package Java8StringPrograms;
//Find the longest string in a list of strings using Java streams:

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
		Optional<String> longString = strings.stream()
				.max(Comparator.comparingInt(String::length));
		System.out.println(longString);
	}
}
