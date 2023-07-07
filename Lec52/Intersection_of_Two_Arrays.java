package Lec52;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 1, 4, 3, 2, 1, 5, 7, 8, 11, 13, 7, 9 };
		int[] arr2 = { 2, 5, 6, 7, 1, 1, 5, 77, 8, 9, 12, 1, 1, 45, 1, 1 };
//		System.out.println(IntersectionoftwoArray(arr1, arr2));
		int[] ans = IntersectionoftwoArray(arr1, arr2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] IntersectionoftwoArray(int[] arr1, int[] arr2) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}
		}
		int[] ans = new int[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

}
