package HackerRankSolutions;

 
import java.util.Scanner;

public class RepeatedString {

	static long repeatedString(String s,long n)
	{
		
		int stringLength = s.length();
		long q=0,r=0;
		q=n/stringLength;
		r=n % stringLength;
		long partialStrLen = (r==0) ? 0 : r;
		long aCount = q * getLetterCount(s,s.length()) + getLetterCount(s,partialStrLen);
		return aCount;
		
	}

	public static long getLetterCount(String s, long stringLength)
	{
		long count =0;
		for(int i=0;i<stringLength;i++)
		{
			if(s.charAt(i)=='a')
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextLong();
		long aCount = repeatedString(s,n);
		System.out.println(aCount);
		sc.close();
	}
}
