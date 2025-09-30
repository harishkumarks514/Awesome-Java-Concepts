package LambdaExpressions;

public class MultipleParameters {

	public static void main(String[] args) {
		
		 
			String input ="SONU";

			char first = input.charAt(0);
			char last = input.charAt(input.length()-1);
			String reverseMiddle ="";
			for(int i=input.length()  - 2; i>0 ; i--)
			{
				reverseMiddle += input.charAt(i);
				}
				String output = last +reverseMiddle+ first;
				System.out.println(output);
			
	}
}