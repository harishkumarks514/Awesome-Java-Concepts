package Monotonic_Stack;
import java.util.Arrays;
import java.util.Stack;

public class MonotonicDecreasingStack {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;

        int[] nge = nextGreaterElement(arr, n);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Element: " + Arrays.toString(nge));
    }

    // Monotonic Decreasing Stack logic
    static int[] nextGreaterElement(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Pop smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Top is next greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element
            stack.push(arr[i]);
        }

        return result;
    }
}