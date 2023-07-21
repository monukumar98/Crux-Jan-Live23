package Lec57;

import java.util.*;

public class BellManFord {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManFord(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEage(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);

	}

	public void BellManFordAlgo(int src) {
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 1; i < dis.length; i++) {
			dis[i] = 10000_000;
		}
		dis[src] = 0;
		List<EdgePair> ll = AllEdge();
		for (int i = 1; i <= v; i++) {
			for (EdgePair e : ll) {
				if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("-ve Wt Cycle");
					return;
				} else if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}

			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}

	}

	public class EdgePair {
		int e1;
		int e2;
		int cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.e1 + " --> " + this.e2 + " @ " + this.cost;
		}
	}

	public List<EdgePair> AllEdge() {
		List<EdgePair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1, e2, cost));

			}

		}
		return ll;
	}

	public static void main(String[] args) {
		BellManFord bf = new BellManFord(5);
		bf.AddEage(1, 2, 8);
		bf.AddEage(1, 3, 4);
		bf.AddEage(1, 4, 5);
		bf.AddEage(3, 4, -3);
		bf.AddEage(4, 5, 4);
		bf.AddEage(5, 2, 1);
		bf.AddEage(2, 5, -2);
		bf.BellManFordAlgo(1);

	}

}
