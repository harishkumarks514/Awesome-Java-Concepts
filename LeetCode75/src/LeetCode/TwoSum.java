package LeetCode;

import java.util.HashMap;

class TwoSum {

	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) { 
            int complement = target - nums[i];
            
            
            if (map.containsKey(complement)) {
            	//System.out.println(map  + " * ");
                return new int[] { map.get(complement), i   };
                
                
            }
            System.out.println(map + "**");
            map.put(nums[i], i);
           
        }
        
        // If no solution found (though the problem guarantees one)
        return new int[] {};
    }
}
