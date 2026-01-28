package Top_K_Elements;

import java.util.*;

public class TopKSmallest {

    public static List<Integer> topKSmallest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove largest
            }
        }

        return new ArrayList<>(maxHeap);
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 3;

        System.out.println(topKSmallest(nums, k));
    }
}
