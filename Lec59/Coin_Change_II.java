package Lec59;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 2, 5 };
		int amount = 5;
		System.out.println(NoofWays(coin, amount, 0));
	}

	public static int NoofWays(int[] coin, int amount, int i) {
		if (amount == 0) {
			return 1;
		}
		if (i == coin.length) {
			return 0;
		}

		int inc = 0;
		int exc = 0;
		if (amount >= coin[i]) {
			inc = NoofWays(coin, amount - coin[i], i);
		}
		exc = NoofWays(coin, amount, i + 1);
		return inc + exc;

	}

	public static int NoofWaysBU(int[] coin, int amount) {
		int[][] dp = new int[coin.length + 1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}

		for (int c = 1; c < dp[0].length; c++) {
			for (int am = 1; am < dp.length; am++) {
				int inc = 0;
				int exc = 0;
				if (am >= coin[c - 1]) {
					inc = dp[c][am - coin[c - 1]];
				}
				exc = dp[c - 1][am];
				dp[c][am] = inc + exc;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}
}
