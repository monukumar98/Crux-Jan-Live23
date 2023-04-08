package Lec23;

public class Coin_Toss_No_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		PrintAnswer(n, "");
	}

	public static void PrintAnswer(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			PrintAnswer(n - 1, ans + "H");
		}
		PrintAnswer(n - 1, ans + "T");

	}

}
