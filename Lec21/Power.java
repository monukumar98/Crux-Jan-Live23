package Lec21;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		int n = 5;
		System.out.println(pow(x, n));

	}

	public static int pow(int x, int n) {
		if(n==0) {
			return 1;
		}
		
		int ans = pow(x, n-1);
		return ans*x;

	}

}
