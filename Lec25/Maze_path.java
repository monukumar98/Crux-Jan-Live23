package Lec25;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;// row
		int m = 5;// col
		System.out.println("\n" + PrintPath(0, 0, n - 1, m - 1, ""));

	}

// cc--> current Col, cr-->current row, er-->end row, ec-->end col
	public static int PrintPath(int cc, int cr, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return 1;

		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int a1 = PrintPath(cc + 1, cr, er, ec, ans + "H");
		int a2 = PrintPath(cc, cr + 1, er, ec, ans + "V");
		return a1 + a2;

	}

}
