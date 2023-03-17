package Lec14;

public class Two_2d_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		System.out.println(arr[1][2]);
		int[][] other = arr;
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
