package Lec45;

import java.util.Arrays;

public class Dungeon_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dungeon = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
		int[][] dp = new int[dungeon.length][dungeon[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(calculateMinimum(dungeon, 0, 0, dp));

	}

	public static int calculateMinimum(int[][] dungeon, int cr, int cc, int[][] dp) {
		if (cr == dungeon.length || cc == dungeon[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == dungeon.length - 1 && cc == dungeon[0].length - 1) {
			return dungeon[cr][cc] > 0 ? 1 : 1 - dungeon[cr][cc];
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		int r = calculateMinimum(dungeon, cr, cc + 1, dp);
		int d = calculateMinimum(dungeon, cr + 1, cc, dp);
		int hp = Math.min(r, d) - dungeon[cr][cc];
		return dp[cr][cc] = hp > 0 ? hp : 1;

	}

}
