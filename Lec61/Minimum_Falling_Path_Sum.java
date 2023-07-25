package Lec61;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
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
		if (j >= arr[0].length || j < 0) {
			return Integer.MAX_VALUE;
		}
		if (i == arr.length - 1) {
			return arr[i][j];
		}
		if (dp[i][j] != Integer.MIN_VALUE) {
			return dp[i][j];
		}

		int ld = minpathsum(arr, i + 1, j - 1, dp);
		int rd = minpathsum(arr, i + 1, j + 1, dp);
		int down = minpathsum(arr, i + 1, j, dp);
		return dp[i][j] = Math.min(rd, Math.min(ld, down)) + arr[i][j];
	}

}
