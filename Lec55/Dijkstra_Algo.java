package Lec55;

import java.util.*;

public class Dijkstra_Algo {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void Dijkstra(int src) {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		pq.add(new DijkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			DijkstraPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = rp.cost + map.get(rp.vtx).get(nbrs);
					DijkstraPair np = new DijkstraPair(nbrs, rp.acq + nbrs, cost);
					pq.add(np);
				}
			}

		}

	}

	class DijkstraPair {
		int vtx;
		String acq;
		int cost;

		public DijkstraPair(int vtx, String acq, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acq = acq;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " " + this.acq + " @ " + this.cost;
		}

	}

	public static void main(String[] args) {
		Dijkstra_Algo dj = new Dijkstra_Algo(7);
		dj.AddEdge(1, 4, 2);
		dj.AddEdge(1, 2, 4);
		dj.AddEdge(2, 3, 5);
		dj.AddEdge(3, 4, 1);
		dj.AddEdge(4, 5, 6);
		dj.AddEdge(5, 6, 11);
		dj.AddEdge(7, 5, 1);
		dj.AddEdge(6, 7, 3);
		dj.Dijkstra(1);

	}

}
