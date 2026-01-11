package Prefix;

public class PrefixSumBasic {

	public static void main(String[] args) {
		int arr[] = {2,1,5,2,3};
		int n= arr.length;
		
		int[] prefix = new int[n];
		prefix[0] = arr[0];
		for(int i =1; i< n; i++)
		{
			prefix[i] = prefix[i-1]+arr[i];
		}
//		sum from index 1 to 3
		int l =1, r=3;
		int sum = prefix[r] -(l>0 ? prefix[l-1] : 0);
		
		System.out.println("Range sum (1 o 3 ):  " + sum);
	}
}

