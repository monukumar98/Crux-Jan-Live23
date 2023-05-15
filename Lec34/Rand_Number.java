package Lec34;

import java.util.*;

public class Rand_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si = 10;
		int ei = 90;
		randnumber(si, ei);

	}

	public static void randnumber(int si, int ei) {

		Random rand = new Random();
		int lo = si;
		int hi = ei;
		for (int i = 0; i < 10; i++) {
			int rn = rand.nextInt(hi - lo + 1) + lo;
			System.out.print(rn + " ");
		}

	}

}
