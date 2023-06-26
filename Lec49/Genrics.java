package Lec49;

public class Genrics {

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 30, 40, 50 };
		Display(arr);
		String[] arr1 = { "Ram", "Raj", "Riya", "Rahul", "Priya", "Pankaj" };
		Display(arr1);

	}

	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("***************");
	}

//	public static void Display(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//
//	public static void Display(long[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//
//	public static void Display(float[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//
//	public static void Display(char[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//
//	public static void Display(boolean[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
}
