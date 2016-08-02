package session3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author Avinash Chopra
 * @Date 02 - Aug - 2016 traverse a binary search tree in preorder
 */
public class PreOrder {

	/**
	 * This method give integer value if input is give wrong then again it run
	 * till a correct input is not given
	 * 
	 * @return //user input value
	 */
	public static int inputNumber() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputNumber();
		}
		return inputNumber;
	}

	/**
	 * 
	 * @param node
	 *            // node of tree
	 * @param data
	 *            // data to store
	 * @return
	 */
	public static Node createTree(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (node.data < data) {
				node.right = createTree(node.right, data);

			} else {
				node.left = createTree(node.left, data);

			}
		}

		return node;
	}

	/**
	 * 
	 * @param node
	 *            // take a node of tree and use recursive method to sub tree
	 */
	public static void preOrder(Node node) {
		// if node is null do nothing
		if (node == null){
			return;
		}
		// show the data and recursive call to sub tree
		System.out.print(node);
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void main(String args[]) {
		System.out.println("Enter the number of nodes in BST");
		int numberOfNodes = inputNumber();
		Node root;
		root = null;
		for (int i = 1; i <= numberOfNodes; i++) {
			System.out.print("Enter node number " + i + " ");
			// get input data from user
			int data = inputNumber();
			root = createTree(root, data);
		}
		System.out.println("PreOrder of BST tree");
		preOrder(root);
	}

}
