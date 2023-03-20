package Lec16;

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW_COWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int nos = sc.nextInt();// number of stall
			int noc = sc.nextInt();// number of cows
			int[] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(MinDistance(stall, noc));
			t--;
		}
	}

	public static int MinDistance(int[] stall, int noc) {
		int lo = stall[0];
		int hi = stall[stall.length - 1];
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitPossible(stall, noc, mid) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;

	}

	public static boolean isitPossible(int[] stall, int noc, int mid) {

		int pos = stall[0];
		int cowscount = 1;
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				cowscount++;
				pos = stall[i];
			}
			if (cowscount == noc) {
				return true;
			}
		}
		return false;

	}

}
