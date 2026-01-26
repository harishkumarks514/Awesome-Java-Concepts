package Top_K_Elements;

import java.util.*;

public class TopKLargest {

    public static List<Integer> topKLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest
            }
        }

        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(topKLargest(nums, k));
    }
}
