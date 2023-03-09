package Lec12;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 6, 8 };
		int[] ans = product(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] product(int[] arr) {
		int n = arr.length;// size of lenght
		int[] left = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1];

		}
		int[] right = new int[n];
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < n; i++) {
			left[i] = left[i] * right[i];
		}
		return left;
	}

}
