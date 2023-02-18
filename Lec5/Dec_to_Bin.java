package Lec5;

public class Dec_to_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 37;// src base 10
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 2;// des base 2
			sum = sum + rem * mul;
			mul = mul * 10;
			n = n / 2;
		}
		System.out.println(sum);

	}

}
