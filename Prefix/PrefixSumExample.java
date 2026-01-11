package Prefix;

public class PrefixSumExample {
// Print array
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,10,5};
		int n = arr.length;
		int[] prefix = new int[n];
		
		// First Element
		prefix[0] = arr[0];
		
		// Build prefix sum array
		for(int i = 1;i<n;i++)
		{
			prefix[i] = prefix[i-1] + arr[i];
		}
		
		// print prefix sum
		System.out.println("prefix sum Array : ");
		for(int i = 0;i<n; i++) {
			System.out.print(prefix[i] + " " );
		}
	}
}
