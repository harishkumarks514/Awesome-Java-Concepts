package Monotonic_Stack;
import java.util.Stack;

public class MonotonicIncreasingStack {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 3, 4};
        int n = arr.length;

        int[] pse = previousSmaller(arr);
        int[] nse = nextSmaller(arr);

        System.out.println("Array:");
        print(arr);

        System.out.println("\nPrevious Smaller Element Index:");
        print(pse);

        System.out.println("\nNext Smaller Element Index:");
        print(nse);
    }

    // Previous Smaller Element (Left)
    static int[] previousSmaller(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return pse;
    }

    // Next Smaller Element (Right)
    static int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return nse;
    }

    static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
