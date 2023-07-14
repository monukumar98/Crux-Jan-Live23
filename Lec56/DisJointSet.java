package Lec56;

import java.util.HashMap;

public class DisJointSet {

	class Node {
		int val;
		int rank;
		Node parent;
	}

	private HashMap<Integer, Node> map = new HashMap<>();

//o(1)
	public void CreateSet(int v) {
		Node nn = new Node();
		nn.val = v;
		nn.rank = 0;
		nn.parent = nn;
		map.put(v, nn);

	}

	public int find(int v) {
		Node nn = map.get(v);
		return find(nn).val;

	}

	private Node find(Node nn) {
		if (nn.parent == nn) {
			return nn;
		}
		Node rn = find(nn.parent);
		nn.parent = rn;// path compression
		return rn;

	}

	public void union(int v1, int v2) {
		Node n1 = map.get(v1);// 4 node wala
		Node n2 = map.get(v2);// 7 node wala
		Node rn1 = find(n1);// rn1 v1 ka re wala node
		Node rn2 = find(n2);// rn1 v1 ka re wala node
		if (rn1.rank == rn2.rank) {
			rn1.parent = rn2;
			rn2.rank++;
		} else if (rn1.rank > rn2.rank) {
			rn2.parent = rn1;
		} else {
			rn1.parent = rn2;
		}

	}

}
