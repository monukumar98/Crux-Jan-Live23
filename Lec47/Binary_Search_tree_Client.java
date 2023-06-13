package Lec47;

public class Binary_Search_tree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		Binary_Search_Tree bst = new Binary_Search_Tree(in);
		bst.PreOrder();
		System.out.println(bst.max());
		System.out.println(bst.find(301));

	}

}
