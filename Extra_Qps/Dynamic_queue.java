package Extra_Qps;

import Lec37.Queue;

public class Dynamic_queue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			int[] newarry = new int[2 * arr.length];

			for (int i = 0; i < arr.length; i++) {

				int idx = (front + i) % arr.length;
				newarry[i] = arr[idx];

			}
			arr = newarry;
			front=0;
		}
		super.Enqueue(item);
	}

}
