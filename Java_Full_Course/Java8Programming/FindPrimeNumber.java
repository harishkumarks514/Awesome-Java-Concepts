package Java8Programming;

import java.util.Arrays;
import java.util.List;

public class FindPrimeNumber {
	
	public static void main(String[] args) {
		FindPrimeNumber fp = new FindPrimeNumber();
		fp.printPrime();
	}
	
	public boolean isPrime(int number) {
		  if (number <= 1) {
		    return false;
		  }
		  for (int i = 2; i <= Math.sqrt(number); i++) {
		    if (number % i == 0) {
		        return false;
		    }
		  }
		  return true;
		}
		 
		private void printPrime() {
		  List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
		  boolean containsPrime = numbers.stream()
		                                 .anyMatch(this::isPrime);
		  System.out.println("List contains a prime number: " + containsPrime);

		 }
}
