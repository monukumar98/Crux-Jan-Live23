package Lec41;

public class LinkedListClinet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.addfirst(10);
		l.addfirst(20);
		l.addfirst(30);
		// l.Display();
		l.addlast(-9);
		l.addlast(11);
		// l.Display();
		l.addatindex(-88, 2);
		//l.Display();
		System.out.println(l.removefirst());
		l.Display();
		System.out.println(l.removelast());
		l.Display();
		System.out.println(l.removeatindex(2));
		l.Display();

		// System.out.println(l.getatindex(2));
//		System.out.println(l.getfirst());
//		System.out.println(l.getlast());
	}

}
