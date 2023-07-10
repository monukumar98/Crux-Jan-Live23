package Lec54;

import java.util.*;

public class Graph {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
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

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofEdge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum += map.get(key).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}
	}

	public void removevertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);

		}
		map.remove(v1);
	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + " --> " + map.get(key));
		}
	}

	public boolean hashpath(int src, int dis, HashSet<Integer> visited) {

		if (src == dis) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = hashpath(nbrs, dis, visited);
				if (ans) {
					return ans;
				}
			}
		}
		visited.remove(src);
		return false;

	}

	public void printallpath(int src, int dis, HashSet<Integer> visited, String ans) {

		if (src == dis) {
			System.out.println(ans + src);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				printallpath(nbrs, dis, visited, ans + src);
			}
		}
		visited.remove(src);
	}

	public boolean BFS(int src, int des) {
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1. remove
			int rv = q.poll();
			// 2. Ignore if already visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3.marked visited
			visited.add(rv);
			// 4. self work
			if (rv == des) {
				return true;
			}
			// 5. add nbrs unvisited
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}

		}
		return false;

	}

	public boolean DFS(int src, int des) {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> st = new Stack<>();
		st.push(src);
		while (!st.isEmpty()) {
			// 1. remove
			int rv = st.pop();
			// 2. Ignore if already visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3.marked visited
			visited.add(rv);
			// 4. self work
			if (rv == des) {
				return true;
			}
			// 5. add nbrs unvisited
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}

		}
		return false;

	}

	public void BFT() {
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				// 1. remove
				int rv = q.poll();
				// 2. Ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3.marked visited
				visited.add(rv);
				// 4. self work
				System.out.print(rv + " ");
				// 5. add nbrs unvisited
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}

			}
		}
		System.out.println();
	}

	public void DFT() {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> st = new Stack<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// 1. remove
				int rv = st.pop();
				// 2. Ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3.marked visited
				visited.add(rv);
				// 4. self work
				System.out.print(rv + " ");
				// 5. add nbrs unvisited
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}

			}
		}
		System.out.println();

	}

}
