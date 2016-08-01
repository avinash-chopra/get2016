package session2_assignment2;

/**
 * 
 * @author Avinash
 * @Date 29-july-2016
 * 
 */
public class Queue {

	// every student have node
	Node[] studentList;
	// first element of queue
	int front;
	// last element of queue
	int rear;
	// size of queue
	int size;
	// length of queue
	int length = 0;

	/**
	 * @param ArraySize
	 *            //size of require array
	 */
	public Queue(int ArraySize) {
		studentList = new Node[ArraySize + 1];
		front = 0;
		rear = 0;
		size = ArraySize;
	}

	/**
	 * default constructor 
	 * make default size of array 100 
	 */
	public Queue() {
		studentList = new Node[100];
		front = 0;
		rear = 0;
		size = 100;
	}

	/**
	 * 
	 * @param rank 			// rank of student 
	 * @param collegeRquire	// require college
	 * insert element at the end of queue 
	 */
	public void enqueue(int rank, int collegeRquire) {
		if (rear >= size) {

		} else {
			studentList[rear] = new Node();
			studentList[rear].rank = rank;
			studentList[rear].collegeRequire = collegeRquire;
			length++;
			rear++;
		}
	}

	/**
	 * remove a element from front of queue
	 */
	public void dequeue() {
		if (front >= rear) {
			front = 0;
			rear = 0;
		} else {
			// shift front and decrease length 
			front++;
			length--;
		}
	}

	/**
	 * set front and rear to zero
	 */
	public void makeEmpety() {
		front = 0;
		rear = 0;
		length = 0;
	}

	/**
	 * get front element
	 * @return		// get front element from queue 
	 */
	public Node getFront() {
		return studentList[front];
	}

	/**
	 * sorting of queue 
	 */
	public void sorting() {
		for (int i = front; i < rear; i++) {
			for (int j = i + 1; j < rear; j++) {
				if ((Integer) studentList[i].rank > (Integer) studentList[j].rank) {
					Node temp;
					temp = studentList[i];
					studentList[i] = studentList[j];
					studentList[j] = temp;
				}
			}
		}
	}

	/**
	 * show the queue
	 */
	public void show() {
		System.out.println("length = " + length);
		for (int i = front; i < rear; i++) {
			System.out.println(studentList[i].rank + "\t"
					+ studentList[i].collegeRequire);
		}
	}

}
