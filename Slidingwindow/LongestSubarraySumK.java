package Slidingwindow;

public class LongestSubarraySumK {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 2, 3};
        int k = 7;

        int sum = 0;
        int maxLen = 0;
        int left = 0;   

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];  // expand window

            // shrink window if sum exceeds k
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Maximum length of subarray with sum <= " + k + " is " + maxLen);
    }
}