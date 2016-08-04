package session5;

/**
 * 
 * @author Avinash
 * @Date 04-08-2016 insert and displaying of link list by recursion
 */
public class List {

	// head of link list
	Node head;

	/**
	 * 
	 * @param data
	 *            data to be insert
	 */
	public void insert(int data) {
		// if head is not null
		if (head != null) {
			// if data is lower then head's data
			if (head.data > data) {
				head = new Node(data, head);
			} else {
				head = insert(head, data);
			}
		}
		// add first element in linked list
		else {
			head = insert(head, data);
		}
	}

	/**
	 * 
	 * @param node
	 *            a node of link list
	 * @param data
	 *            data to be insert
	 * @return return node address
	 */
	public Node insert(Node node, int data) {
		if (node == null) {
			Node temp = new Node(data);
			return temp;
		} else {
			if (node.data > data && node == head) {
				System.out.println("is this running");
				if (node.nextAddress != null) {
					node.nextAddress = new Node(data, node.nextAddress);
					return node;
				}
			}
			if (node.nextAddress != null) {
				if (node.nextAddress.data > data) {
					node.nextAddress = new Node(data, node.nextAddress);
					return node;
				}
			}
			node.nextAddress = insert(node.nextAddress, data);
			return node;
		}

	}

	/**
	 * 
	 * @param node
	 *            a node of link list
	 */
	public void showList(Node node) {
		// if node is null
		if (node == null) {
			return;
		} else {
			System.out.print(node.data + " ");
			showList(node.nextAddress);
		}
	}

	/**
	 * show link list
	 */
	public void showList() {
		showList(head);
	}
}
