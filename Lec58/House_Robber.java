package Lec58;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 1, 3, 7 };
		int[] dp = new int[arr.length];
//		for (int i = 0; i < dp.length; i++) {
//			dp[i] = -1;
//		}
		Arrays.fill(dp, -1);
		System.out.println(Robber(arr, 0));
		System.out.println(RobberTDBack(arr, arr.length - 1, dp));

	}

	public static int RobberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int rob = arr[i] + RobberTD(arr, i + 2, dp);// dp[i+2];
		int Dn_rob = RobberTD(arr, i + 1, dp);// dp[i+1]
		return dp[i] = Math.max(rob, Dn_rob);// dp[i]=Math.max(dp[i+1],dp[i+2])

	}

	public static int RobberTDBack(int[] arr, int i, int[] dp) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int rob = arr[i] + RobberTDBack(arr, i - 2, dp);// arr[i]+ dp[i-2];
		int Dn_rob = RobberTDBack(arr, i - 1, dp);// dp[i-1]
		return dp[i] = Math.max(rob, Dn_rob);// dp[i]=Math.max(dp[i-1],dp[i-2])

	}

	public static int RobberBU(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {

			dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);

		}
		return dp[dp.length - 1];
	}

	public static int Robber(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}

		int rob = arr[i] + Robber(arr, i + 2);
		int Dn_rob = Robber(arr, i + 1);
		return Math.max(rob, Dn_rob);

	}

}
