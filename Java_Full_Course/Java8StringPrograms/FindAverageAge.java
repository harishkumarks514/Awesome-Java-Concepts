package Java8StringPrograms;

import java.util.Arrays;
import java.util.List;

// Calculate the average age of a list of Person objects using Java streams:
public class FindAverageAge {
public static void main(String[] args) {
	List<Person> persons = Arrays.asList(
		    new Person("Alice", 25),
		    new Person("Bob", 30),
		    new Person("Charlie", 35)
		);
		double averageAge = persons.stream()
		                          .mapToInt(Person::getAge)
		                          .average()
		                          .orElse(0);
}
}
