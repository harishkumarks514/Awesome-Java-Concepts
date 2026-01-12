package Prefix;

public class DifferenceArray {

	public static void main(String[] args) {
		int n = 5;
		int[] diff = new int[n + 1];

		// Range updates
		update(diff, 1, 3, 10);
		update(diff, 2, 4, 5);
		update(diff, 0, 2, -2);

		// Build final array using prefix sum
		int[] result = new int[n];
		result[0] = diff[0];

		for (int i = 1; i < n; i++) {
			result[i] = result[i - 1] + diff[i];

		}
		// Print result
		for (int val : result)
			System.out.print(val + " ");
	}

	static void update(int[] diff, int l, int r, int val) {
		diff[l] += val;
		if (r + 1 < diff.length) {
			diff[r + 1] -= val;
		}
	}
}