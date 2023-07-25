package Lec60;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 3 };
		int cap = 4;
		System.out.println(maximumvalue(wt, val, cap, 0));

	}

	public static int maximumvalue(int[] wt, int[] val, int cap, int i) {
		if (i == wt.length || cap == 0) {
			return 0;
		}
		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + maximumvalue(wt, val, cap - wt[i], i + 1);
		}

		exc = maximumvalue(wt, val, cap, i + 1);
		return Math.max(inc, exc);

	}

}
