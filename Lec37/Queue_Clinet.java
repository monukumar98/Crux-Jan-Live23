package Lec37;

public class Queue_Clinet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Display();
		q.Enqueue(20);
		q.Display();
		q.Enqueue(30);
		q.Display();
		q.Enqueue(40);
		q.Display();
		q.Enqueue(50);
		q.Display();
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		q.Enqueue(60);
		//q.Enqueue(70);
		q.Display();

	}

}
