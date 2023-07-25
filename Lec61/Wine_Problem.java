package Lec61;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };

		System.out.println(maximumprofit(wine, 0, wine.length - 1, 1));
		System.out.println(maximumprofitBU(wine));
	}

	public static int maximumprofit(int[] wine, int i, int j, int year) {
		if (i > j) {
			return 0;
		}

		int fs = year * wine[i] + maximumprofit(wine, i + 1, j, year + 1);
		int ls = year * wine[j] + maximumprofit(wine, i, j - 1, year + 1);
		return Math.max(fs, ls);
	}

	public static int maximumprofitBU(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		int year = wine.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * year;
		}
		year--;
		for (int slide = 1; slide < dp.length; slide++) {

			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;
				int fs = year * wine[i] + dp[i + 1][j];
				int ls = year * wine[j] + dp[i][j - 1];
				dp[i][j] = Math.max(fs, ls);
			}
			year--;

		}
		return dp[0][dp[0].length - 1];
	}
}
