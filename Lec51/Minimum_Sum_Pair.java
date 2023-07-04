package Lec51;

import java.util.PriorityQueue;

public class Minimum_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 3, 3, 4 };
		int sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			sum += a + b;
			pq.add(a + b);
		}
		System.out.println(sum);

	}

}
