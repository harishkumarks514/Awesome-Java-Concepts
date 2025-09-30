package HackerRankSolutions;

import java.util.Scanner;

public class LongestCommonSubsequence {

	static Integer dp[][];
	static int cache[][];

//	Method1() - recursive solution(Top- down approach)
//	time complexity - O(2^(m+n))
//	space complexity - O(m+n)

	public static int LCM1(char[] X, char[] Y, int i, int j) {
		if (i <= 0 || j <= 0)
			return 0;
		if (X[i - 1] == Y[j - 1])
			return 1 + LCM1(X, Y, i - 1, j - 1);
		else
			return Math.max(LCM1(X, Y, i, j - 1), LCM1(X, Y, i - 1, j));
	}

	static int commonChild(String s1, String s2) {
		return LCM1(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int result = commonChild(s1, s2);

		System.out.println(result);
		sc.close();

	}
}
