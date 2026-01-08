package Prefix;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysSumK {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,-3,1,1,1};
		int k =3;
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0, count = 0;
		
		for(int num : arr)
		{
			sum += num;
			count += map.getOrDefault(sum-k, 0);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		System.out.println("count of subarrays : " + count);
	}
}
