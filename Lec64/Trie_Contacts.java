package Lec64;

import java.util.HashMap;

public class Trie_Contacts {
	private class Node {
		char data;
		HashMap<Character, Node> child = new HashMap<>();
		boolean IsTerminal;
		int count = 0;

	}

	private Node root;

	public Trie_Contacts() {
		// TODO Auto-generated constructor stub
		Node nn = new Node();
		nn.data = '*';
		root = nn;
	}

	public void insert(String word) {
		Node temp = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (temp.child.containsKey(ch)) {
				temp = temp.child.get(ch);
				temp.count++;

			} else {
				Node nn = new Node();
				nn.data = ch;
				nn.count = 1;
				temp.child.put(ch, nn);
				temp = nn;
			}

		}
		temp.IsTerminal = true;
	}

	public int startsWith(String prefix) {
		Node temp = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (!temp.child.containsKey(ch)) {
				return 0;
			}
			temp = temp.child.get(ch);

		}
		return temp.count;
	}

	public static void main(String[] args) {
		Trie_Contacts t = new Trie_Contacts();
		t.insert("raj");
		t.insert("raju");
		t.insert("rajani");
		System.out.println(t.startsWith("raj"));
	}
}
