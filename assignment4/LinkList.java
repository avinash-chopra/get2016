package session1_doublyLinkList;

/**
 * 
 * @author Avinash Chopra
 *
 * @param <T>
 *            generic data type
 */
public class LinkList<T> {

	// head pointer of link list
	Node<T> head;
	// length of link list
	int length;

	// constructor of link list class
	public LinkList() {
		head = null;
		length = 0;
	}

	/**
	 * Insert data at the end of link list
	 * 
	 * @param data
	 *            // T type data as parameter
	 */
	public boolean insertAtEnd(T data) {

		if (head == null) {
			Node<T> node = new Node<T>();
			node.data = data;
			node.nextAddress = null;
			node.prevAddress = node;
			head = node;
			length++;
			return true;
		} else {
			Node<T> temp;
			Node<T> prev;
			temp = head;
			prev = null;
			for (int i = 1; i <= length; i++) {
				prev = temp;
				temp = temp.nextAddress;
			}
			Node<T> node = new Node<T>();
			node.data = data;
			node.prevAddress = prev;
			node.nextAddress = null;
			prev.nextAddress = node;
			length++;
			return true;
		}
	}

	/**
	 * 
	 * @param position
	 *            // position at which data store
	 * @param data
	 * @return // if insert successfully then return true else return false
	 */

	public boolean insertAtPosition(int position, T data) {
		// if it is not possible to add that element at that position
		if (position > length + 1) {
			return false;
		} else {
			// if position is 1 then we need to update head node
			if (position == 1) {
				Node<T> node = new Node<T>();
				node.data = data;
				Node<T> next;
				next = head;
				head = node;
				// changes address of nodes
				node.nextAddress = next;
				node.prevAddress = node;
				next.prevAddress = node;
				length++;
			}
			// if data at some other location
			else {
				Node<T> prev;
				prev = null;
				Node<T> tempNode;
				tempNode = head;
				for (int i = 1; i < position; i++) {
					prev = tempNode;
					tempNode = tempNode.nextAddress;
				}
				Node<T> node = new Node<T>();
				node.data = data;
				node.nextAddress = tempNode;
				node.prevAddress = prev;
				prev.nextAddress = node;
				if (tempNode != null) {
					tempNode.prevAddress = node;
				}
				length++;
			}
			return true;
		}
	}

	/**
	 * show the data
	 */
	public void showList() {
		Node<T> temp;
		temp = head;
		for (int i = 1; i <= length; i++) {
			System.out.println(temp);
			temp = temp.nextAddress;
		}
	}

	/**
	 * 
	 * @param position
	 *            // position of data
	 * @return // if position present then return true else return false
	 */
	public boolean showElementAtIndex(int position) {
		if (position > length) {
			return false;
		} else {
			Node<T> temp;
			temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.nextAddress;
			}
			System.out.println(temp);
			return true;
		}

	}

	/**
	 * delete node by a position
	 * 
	 * @param position
	 *            // position at which node to be deleted
	 */
	public boolean deleteByIndex(int position) {
		if (position > length) {
			return false;
		} else {
			if (position == 1) {
				head = head.nextAddress;
				length--;
				return true;
			} else {
				Node<T> tempNode;
				Node<T> prevNode;
				tempNode = head;
				prevNode = null;
				for (int i = 1; i <= position - 1; i++) {
					prevNode = tempNode;
					tempNode = tempNode.nextAddress;
				}
				// it's mean it is at last
				if (tempNode.nextAddress == null) {
					prevNode.nextAddress = null;
				}

				else {
					Node<T> temp;
					temp = tempNode.nextAddress;
					temp.prevAddress = prevNode;
					prevNode.nextAddress = temp;
				}
				length--;
				return true;
			}
		}
	}

	/**
	 * 
	 * @param data 		//delete node which have same as 'data'
	 * @return			// if deleted successfully return true else return false
	 */
	public boolean deleteByValue(T data) {
		Node<T> tempNode;
		Node<T> prevNode;
		prevNode = null;
		tempNode = head;
		for (int i = 1; i <= length; i++) {
			if ((tempNode.data).equals(data)) {
				if (i == 1) {
					head = tempNode.nextAddress;
					length--;
					return true;
				} else {
					prevNode.nextAddress = tempNode.nextAddress;
					tempNode.nextAddress.prevAddress = prevNode;
					length--;
					return true;
				}
			}
			prevNode = tempNode;
			tempNode = tempNode.nextAddress;
		}

		return false;
	}

	 /* Function to reverse a Doubly Linked List */
    public boolean reverse() {
        Node<T> temp = null;
        Node<T> current = head;
 
        /* swap next and prev for all nodes of 
         doubly linked list */
        if(length > 1){
        	while (current != null) {
                temp = current.prevAddress;
                current.prevAddress = current.nextAddress;
                current.nextAddress = temp;
                current = current.prevAddress;
            }
        }
        
 
        /* Before changing head, check for the cases like empty 
         list and list with only one node */
        if (temp != null) {
            head = temp.prevAddress;
        }
        if(length == 0){
        	head =null;
        }
		return true;
    }
}
