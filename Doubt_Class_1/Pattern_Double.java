package Doubt_Class_1;

import java.util.Scanner;

public class Pattern_Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		int space2 = -1;
		int val = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p = val;
			while (j <= star) {
				System.out.print(p + " ");
				j++;
				
				p--;
			}
			int k = 1;
			while (k <= space2) {
				System.out.print("  ");
				k++;
			}
			int l = 1;
			p = 1;
			if (row == 1 || row == n) {
				l = 2;
			}
			while (l <= star) {
				System.out.print(p + " ");
				l++;
				p++;
			}
			if (row <= n / 2) {
				space -= 2;
				star++;
				space2 += 2;
				val++;

			} else {
				space += 2;
				star--;
				space2 -= 2;
				val--;
			}
			row++;
			System.out.println();
		}

	}

}
