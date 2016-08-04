package DSSession5;
import java.util.LinkedList;

/**
 * 
 * @author Avinash
 *
 */
public class Queue {

	LinkedList<Integer> queue;

	public Queue() {
		queue = new LinkedList<Integer>();
	}

	public boolean enqueue(int data) {
		queue.add(queue.size(), data);
		return true;
	}

	public int dequeue() {
		if (queue.size() == 0) {
			return -111;
		} else {
			return queue.remove(0);
		}

	}

	/**
	 * displays the queue
	 */
	public void display() {
		System.out.print("Front-->");
		for (int data : queue) {
			System.out.print(data + " ");
		}
		System.out.println("<--Rear");
	}
}