package Lec57;

import java.util.*;

public class Prims_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEage(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public int Prims() {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		int sum = 0;
		pq.add(new PrimsPair(3, 3, 0));
		while (!pq.isEmpty()) {
			PrimsPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			sum += rp.cost;
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}

			}
		}
		return sum;
	}

	class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " " + this.acqvtx + " @ " + this.cost;
		}
	}

	public static void main(String[] args) {
		Prims_Algo pp = new Prims_Algo(7);
		pp.AddEage(1, 2, 2);
		pp.AddEage(1, 4, 5);
		pp.AddEage(2, 3, 3);
		pp.AddEage(4, 3, 4);
		pp.AddEage(4, 5, 7);
		pp.AddEage(5, 6, 1);
		pp.AddEage(5, 7, 6);
		pp.AddEage(6, 7, 8);
		System.out.println(pp.Prims());

	}

}
