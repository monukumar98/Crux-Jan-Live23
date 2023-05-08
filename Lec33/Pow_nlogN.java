package Lec33;

public class Pow_nlogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int n = 5;
		
		System.out.println(pow(x, n));
	}

	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int ans = pow(x, n / 2);
		ans = ans * ans;
		if (n % 2 != 0) {
			ans *= x;
		}
		return ans;
	}

}
