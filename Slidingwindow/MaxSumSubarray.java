package Slidingwindow;

public class MaxSumSubarray {

	public static void main(String[] args) {
		
		 int[] arr= {2,1,5,1,3,2,};
		 int k = 3;
		 int sum = 0;
		 int maxSum = 0;
		 
		 // First Window
		 for(int i=0;i<k;i++)
		 {
			 sum += arr[i];
		 }
		 maxSum = sum;
		 //Slide the window
		 for(int i = k; i<arr.length;i++)
		 {
			 sum += arr[i]; // add new elements
			 sum-= arr[i-k]; // remove old elements
			 maxSum = Math.max(maxSum, sum);
		 }
		 System.out.println("Maximum sum of subarray of size " + k + "  is   " + maxSum);
	}
}
