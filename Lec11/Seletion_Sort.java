package Lec11;

public class Seletion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 13, -4, 5, 7 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int mini = i;// index
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}

			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}

	}
}
