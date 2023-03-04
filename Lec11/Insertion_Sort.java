package Lec11;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 13, -4, 5, 7 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		// Single Element Always Sort hoga due to this reason loop 1 se Start hoga
		for (int i = 1; i < arr.length; i++) {
			int picked = arr[i];// hand picked Card
			int j = i - 1;
			while (j >= 0 && arr[j] > picked) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = picked;

		}

	}

}
