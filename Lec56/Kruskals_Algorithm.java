package Lec56;

import java.util.*;

public class Kruskals_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Kruskals_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public void Kruskals() {
		List<EdgePair> ll = AllEdge();
		Collections.sort(ll, new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		int ans = 0;
		DisJointSet ds = new DisJointSet();
		for (int v : map.keySet()) {
			ds.CreateSet(v);
		}
		for (EdgePair e : ll) {
			int e1 = e.e1;
			int e2 = e.e2;
			int re1 = ds.find(e1);
			int re2 = ds.find(e2);
			if (re1 == re2) {

			} else {
				ds.union(e1, e2);
				System.out.println(e);
				ans += e.cost;
			}

		}
		System.out.println(ans);

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
		Kruskals_Algorithm ka = new Kruskals_Algorithm(7);
		ka.addEdge(1, 2, 3);
		ka.addEdge(1, 4, 4);
		ka.addEdge(2, 3, 5);
		ka.addEdge(3, 4, 6);
		ka.addEdge(4, 5, 8);
		ka.addEdge(5, 6, 2);
		ka.addEdge(5, 7, 1);
		ka.addEdge(6, 7, 9);
		ka.Kruskals();

	}

}
