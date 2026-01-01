package Slidingwindow;
 

import java.util.HashMap;

public class LongestSubarraySumK_HashMap {

    public static void main(String[] args) {

        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        // Handles subarray starting from index 0
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Case 1: Direct match
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store first occurrence only
            map.putIfAbsent(sum, i);
        }

        System.out.println("Longest subarray length with sum " + k + " is " + maxLen);
    }
}

