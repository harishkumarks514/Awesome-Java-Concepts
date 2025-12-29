package Practice_Java_Prgms;

public class SortOnesAndTwos {

	public static void main(String[] args) {
		int[] arr = {2,1,2,1,1,2,2,1};
		
		int left = 0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]    ==  1)
			{
				int temp = arr[i];
				arr[i]=arr[left];
				arr[left]=temp;
				left++;
			}
		}
		// Print result
		for(int  num : arr)
			System.out.print( num + "    ");
	}
}