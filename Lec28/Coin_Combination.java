package Lec28;

import java.util.ArrayList;
import java.util.List;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 1, 3, 5 };
		int amount = 4;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Permutation(coin, amount, ll, 0, ans);
		System.out.println(ans);

	}

	public static void Permutation(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
		//	 System.out.println(ll);
			ans.add(new ArrayList<Integer>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				// amount -= coin[i];
				ll.add(coin[i]);
				Permutation(coin, amount - coin[i], ll, i, ans);
				// amount +=coin[i];
				ll.remove(ll.size() - 1);
			}
		}

	}

}
