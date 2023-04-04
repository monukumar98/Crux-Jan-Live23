package Lec22;

public class First_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 13, 7, 5, 3, 4, 5, 6, 3, 9, 3 };
		int item = 3;
		System.out.println(FistIndex(arr, 0, item));

	}

	public static int FistIndex(int[] arr, int i, int item) {
		// TODO Auto-generated method stub
		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}

		return FistIndex(arr, i + 1, item);

	}

}
