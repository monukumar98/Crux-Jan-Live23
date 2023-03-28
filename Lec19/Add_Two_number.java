package Lec19;

import java.util.ArrayList;

public class Add_Two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 9, 7 };
		int[] arr2 = { 8, 6 };
		AddNumber(arr1, arr2);
	}

	public static void AddNumber(int[] arr1, int[] arr2) {
		ArrayList<Integer> ll = new ArrayList<>();
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		 
		while (i >= 0 && j >= 0) {
			int sum = arr1[i] + arr2[j] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		while (i >= 0) {

			int sum = arr1[i] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
		}
		while (j >= 0) {

			int sum = arr2[j] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			j--;
		}
		if (carry > 0) {
			ll.add(carry);
		}
		for (int k = ll.size() - 1; k >= 0; k--) {
			System.out.print(ll.get(k) + " ");
		}

	}

}
