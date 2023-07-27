package Lec62;

import java.util.Arrays;

public class Counting_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
		arr = Sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] Sort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int[] freq = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		for (int i = 1; i < freq.length; i++) {
			freq[i] = freq[i] + freq[i - 1];
		}
		int[] newarr = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			int idx = freq[arr[i]] - 1;
			newarr[idx] = arr[i];
			freq[arr[i]]--;

		}
		return newarr;
	}
}
