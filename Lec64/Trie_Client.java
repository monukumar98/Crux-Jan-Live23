package Lec64;

public class Trie_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("apple");
		t.insert("shivani");
		t.insert("raju");
		t.insert("raja");
		t.insert("mango");
		t.insert("go");
		System.out.println(t.search("app"));
		System.out.println(t.startsWith("app"));

	}

}
