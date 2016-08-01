package session1_singlyLinkList;

public class LinkList<T> {

	// hold address of first node
	Node<T> head;
	// number of elements in link list
	public int length;

	
	public LinkList() {
		head = null;
		length = 0;
	}

	/**
	 * 
	 * @return 	// return length o link list
	 */
	public int getLength() {
		return length;
	}

	/**
	 * 
	 * @param object		// T type object to insert 
	 * @return				// return true if insert success fully else false
	 */
	public boolean inseartAtEnd(T object) {
		//temp node to hold references
		Node<T> tempObject;
		tempObject = null;
		tempObject = inseart(head, object);
		if (tempObject == null) {
			return false;
		} else {
			if (head == null) {
				head = tempObject;
			}
			length++;
			return true;
		}
	}

	/**
	 * Display the link list
	 */
	public void showList() {
		show(head);
	}

	/**
	 * use recursion method to insert the data 
	 * @param node 		//address of node 
	 * @param data		// data to be insert
	 * @return			// return address of node where data store
	 */
	private Node<T> inseart(Node<T> node, T data) {
		if (node == null) {
			Node<T> temp = new Node<T>();
			temp.data = data;
			temp.address = null;
			return temp;
		} else {
			// use recursion 
			node.address = inseart(node.address, data);
			return node;
		}
	}

	/**
	 * display the link list by recursion 
	 * @param node 		// reference of node where data store
	 */
	private void show(Node<T> node) {
		if (node != null) {
			System.out.println(node);
			show(node.address);
		}
	}

	/**
	 * 
	 * @param position		//position where data to be store
	 * @param userObject	// user data
	 * @return				// true if insert success else return false
	 */
	public boolean insertAtPosition(int position, T userObject) {
		int i;
		Node<T> prev;
		prev = head;

		if (position > length + 1) {
			return false;
		}

		else if (position == 1) {
			Node<T> insertNode = new Node<T>();
			insertNode.address = head;
			insertNode.data = userObject;
			head = insertNode;
			return true;
		} else {

			for (i = 1; i < position - 1; i++) {
				prev = prev.address;
			}
			if (i == position || i == position - 1) {
				//temp node to hold references
				Node<T> tempNode;
				Node<T> insertNode = new Node<T>();
				tempNode = prev.address;
				insertNode.address = tempNode;
				insertNode.data = userObject;
				prev.address = insertNode;
				length++;
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * 
	 * @param userObject	//object to be deleted
	 * @return				// true if delete successfully else false
	 */
	public boolean deleteByValue(T userObject) {
		//temp node to hold references
		Node<T> tempNode;
		Node<T> prevNode = null;
		tempNode = head;
		for (int i = 0; i <= length && tempNode != null; i++) {
			if ((tempNode.data).equals(userObject) && prevNode == null) {
				head = tempNode.address;
				length--;
				return true;
			} else if ((tempNode.data).equals(userObject)) {
				prevNode.address = tempNode.address;
				length--;
				return true;
			}
			prevNode = tempNode;
			tempNode = tempNode.address;
		}
		return false;
	}

	/**
	 * 
	 * @param position 		//delete node at position  
	 * @return				// true if delete successfully else false
	 */
	public boolean deleteByIndex(int position) {
		if (position > length) {
			return false;
		} else if (position == 1) {
			head = head.address;
			length--;
			return true;
		} else {
			//temp node to hold references
			Node<T> tempNode;
			tempNode = head;
			for (int i = 1; i < position - 1; i++) {
				tempNode = tempNode.address;
			}
			if ((tempNode.address) == null) {
				tempNode.address = (tempNode.address);
			} else {
				tempNode.address = (tempNode.address).address;
			}

			length--;
			return true;
		}
	}

	/**
	 * 
	 * @return return last element
	 */
	public T getLastElement() {
		if (length <= 0) {
			return null;
		} else if (length == 1) {
			T data = head.data;
			head = null;
			length--;
			return data;
		} else {
			//temp node to hold references
			Node<T> tempNode;
			T data;
			tempNode = head;
			for (int i = 1; i < length - 1; i++) {
				tempNode = tempNode.address;
			}
			data = tempNode.address.data;
			tempNode.address = null;

			length--;
			return data;
		}
	}

	/**
	 * 
	 * @param position		// display the data at position
	 * @return				// true if position exist else false
	 */
	public boolean showItemAtIndex(int position) {
		if (position > length) {
			return false;
		} else {
			//temp node to hold references
			Node<T> tempNode;
			tempNode = head;
			for (int i = 1; i < position; i++) {
				tempNode = tempNode.address;
			}
			System.out.println(tempNode);
			return true;
		}
	}

	/**
	 * reverse the link list
	 * @return		//true if reversal successfully else return false 
	 */
	public boolean reversal() {
		if (head != null) {
			// temp nodes to hold references 
			Node<T> prevNode;
			Node<T> currentNode;
			Node<T> nextNode;
			prevNode = null;
			currentNode = head;
			for (int i = 1; i <= length; i++) {
				nextNode = currentNode.address;
				currentNode.address = prevNode;
				prevNode = currentNode;
				currentNode = nextNode;
			}
			head = prevNode;
			return true;
		} else {
			return false;
		}
	}

}
