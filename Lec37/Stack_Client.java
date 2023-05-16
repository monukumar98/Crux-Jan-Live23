package Lec37;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.isfull());
		//st.push(60);
		st.Dispaly();
		System.out.println(st.pop());
		st.Dispaly();
		

	}

}
