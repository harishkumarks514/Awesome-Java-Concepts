package LeetCode;

public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] nums)
	{
		int n= nums.length;
		int[] answer = new int[n];
		
		//Step1 : Prefix product
		answer[0] =1;
		for(int i =1; i<n;i++)
		{
			answer[i] = answer[i-1]*nums[i-1];
		}
		//Step2 : suffix products (multiply while going backward)
		int suffix =1;
		for(int i=n-1; i >= 0; i--)
		{
			answer[i] = answer[i]* suffix;
			suffix *= nums[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
		int[] nums = {1,2,3,4,5};
		int[] result = solution.productExceptSelf(nums);
		
//		print result
		for(int num : result)
		{
			System.out.print(num + " ");
		}
	}
}
