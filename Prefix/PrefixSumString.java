package Prefix;

public class PrefixSumString {

	public static void main(String[] args) {
		String s = "abacaba";
		int n = s.length();
		int[] [] prefix = new int[n] [26];
		//Build prefix frequency
		for(int i=0;i<n;i++)
		{
			prefix[i] [s.charAt(i) -'a']++;
			if(i>0)
			{
				for(int c = 0;c<26;c++)
				{
					prefix[i][c] += prefix[i-1][c];
				}
			}
		}
		
//		count a from index 1 to 5
		int l=0,r=6;
		int countA = prefix[r]['a' -'a'] - (l>0?prefix[l-1] ['a' -'a'] : 0);
		
		System.out.println("Count of 'a' = " + countA);
	}
}
