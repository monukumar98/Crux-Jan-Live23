package Lec61;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[arr.length][arr[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, Integer.MIN_VALUE);
		}
		for (int i = 0; i < arr.length; i++) {
			ans = Math.min(ans, minpathsum(arr, 0, i, dp));
		}
		System.out.println(ans);
	}

	private static int minpathsum(int[][] arr, int i, int j, int[][] dp) {
		// TODO Auto-generated method stub
		if (i == arr.length - 1) {
			return arr[i][j];
		}
		if (dp[i][j] != Integer.MIN_VALUE) {
			return dp[i][j];
		}

		int ans = Integer.MAX_VALUE;
		for (int k = 0; k < arr[0].length; k++) {
			if (j != k) {
				ans = Math.min(ans, minpathsum(arr, i + 1, k, dp));

			}
		}

		return dp[i][j] = ans + arr[i][j];
	}

}
