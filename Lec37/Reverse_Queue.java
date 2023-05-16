package Lec37;

public class Reverse_Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Display();
		Reverse(q);
		q.Display();

	}

	public static void Reverse(Queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int ii = q.Dequeue();
		Reverse(q);
		q.Enqueue(ii);

	}

}
