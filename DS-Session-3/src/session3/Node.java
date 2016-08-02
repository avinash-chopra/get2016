package session3;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}

	@Override
	public String toString() {
		String s = data + " ";
		return s;
	}
}