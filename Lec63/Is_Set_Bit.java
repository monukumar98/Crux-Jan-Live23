package Lec63;

public class Is_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 87;
		int pos = 4;
		System.out.println(isset(n, pos));
	}

	public static boolean isset(int n, int pos) {
		int mask = (1 << pos);
		if ((n & mask) != 0) {
			return true;
		} else {
			return false;
		}
	}

}
