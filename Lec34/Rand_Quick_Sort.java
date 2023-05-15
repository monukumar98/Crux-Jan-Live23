package Lec34;

import java.util.Random;

public class Rand_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 2, 11, 4 };
		Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int idx = Partition(arr, si, ei);
		Sort(arr, si, idx - 1);
		Sort(arr, idx + 1, ei);
	}

	public static int Partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		// randam index ko last element
		RandamIndexSwaping(arr, si, ei);
		int item = arr[ei];
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] <= item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}

		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;

	}

	public static void RandamIndexSwaping(int[] arr, int si, int ei) {
		Random rand = new Random();
		int rn = rand.nextInt(ei - si + 1) + si;
		int temp = arr[ei];
		arr[ei] = arr[rn];
		arr[rn] = temp;

	}
}