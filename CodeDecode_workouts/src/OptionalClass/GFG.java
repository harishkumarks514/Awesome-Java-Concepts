package OptionalClass;

import java.util.Optional;

public class GFG {

	public static void main(String[] args) {

//		creating a string array
		String[] str = new String[5];

//		Setting value for 2nd index
		str[2] = "Geek Classes are coming soon";

//		It returns an empty instance of Optional class
//		Optional<String> empty = Optional.empty();
//		System.out.println(empty + " Hi ");

//		It returns a non-empty Optional
		Optional<String> value = Optional.of(str[2]);
//		System.out.println(value);
		
//		It returns value of an Optional.
//		If value is not present, it throws
//		an NoSuchElementException
		System.out.println(value.get() + "      ");
		
//		It returns hashCode of the vallue
		System.out.println(value.hashCode());
		
//		It returns true if value is present,
//		otherwise false
		
		System.out.println(value.isPresent());

	}
}
