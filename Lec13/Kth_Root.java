package Lec13;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 87;
		int k = 3;
		System.out.println(kthroot(n, k));

	}

	public static int kthroot(int n, int k) {
		int lo = 1;// low
		int hi = n;// high
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (Math.pow(mid, k) <= n) {// Mid^k<=n
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

}
