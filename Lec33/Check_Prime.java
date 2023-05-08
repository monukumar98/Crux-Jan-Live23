package Lec33;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(69));

	}

	public static boolean isPrime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;

	}
}
