package Java_8;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str = "Harish";
		String reverse = "";
		int  length = str.length();
		
		for(int i=0;i<length;i++)
		 
			reverse=str.charAt(i)+reverse;
			System.out.println(reverse);
			}
}