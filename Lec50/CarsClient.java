package Lec50;

import java.util.Arrays;
import java.util.Comparator;

public class CarsClient {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer [] arr = new Integer[5];
		String[] a = new String[5];
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		String s= "hllo";
//		String s1= "kllo";
//		System.out.println(s.compareTo(s1));
		Cars[] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 6, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");

		Arrays.sort(arr, new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				if(o1.speed==o2.speed) {
				return	o2.price-o1.price;
				}
				else {
					return o1.speed-o2.speed;
				}
			}
		});
////		Sort(arr, new CarCompareterSpeed());
////		Sort(arr, new CarCompareterPrice());
//		Sort(arr, new CarCompareterColor());
		Display(arr);

	}

	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static <T> void Sort(T[] arr, Comparator<T> camp) {

		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length - turn; i++) {
				if (camp.compare(arr[i], arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

	}

//	public static <T extends Comparable<T>> void Sort(T[] arr) {
//
//		for (int turn = 1; turn < arr.length; turn++) {
//			for (int i = 0; i < arr.length - turn; i++) {
//				if (arr[i].compareTo(arr[i + 1]) > 0) {
//					T temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//		}
//
//	}

}
