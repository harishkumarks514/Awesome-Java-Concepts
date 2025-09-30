package LeetCode;

class Main {

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums = {3,8,14,16};
		int target = 30;
		int[] result = ts.twoSum(nums, target);
		
		System.out.println("Indices: " + result[0] + 
				", " + result[1]);
	}
}