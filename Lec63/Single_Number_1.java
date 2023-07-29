package Lec63;

public class Single_Number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 2, 1, 2 };

	}

	public static int Single_Number(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];// ans = ans ^arr[i];
		}
		return ans;

	}

}
