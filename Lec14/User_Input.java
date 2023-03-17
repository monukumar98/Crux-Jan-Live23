package Lec14;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Display(arr);

	}

	public static void Display(int[][] akanksha) {
//		int r=akanksha.length;// row
//		int c = akanksha[0].length;//col
		for (int i = 0; i < akanksha.length; i++) {
			for (int j = 0; j < akanksha[0].length; j++) {
				System.out.print(akanksha[i][j] + " ");

			}
			System.out.println();
		}

	}

}
