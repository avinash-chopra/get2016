package session3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @Author Avinash Chopra
 * @Date 02 - Aug - 2016
 *  
 */
public class BinaryTreeMirror {

	int size = 1;
	String inOrder = "";

	/**
	 * This method give String
	 * 
	 * @return //user input value
	 */
	public static String inputString() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = "";
		try {
			inputString = br.readLine();
		} catch (Exception e) {
			System.out.println("Please Enter the Valid String");
			inputString = inputString();
		}
		return inputString;
	}

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

	public Node mirror(Node node) {
		if (node == null)
			return node;

		/* recursion the subtrees */
		Node left = mirror(node.left);
		Node right = mirror(node.right);

		/* swap the left and right pointers */
		node.left = right;
		node.right = left;

		return node;
	}
	/**
	 * 
	 * @param node		// node of tree
	 * @param data		// data to be insert 
	 * @return			// return node where data inserted 
	 * This use to create a tree and insert data in tree 
	 */
	public Node createTree(Node rootNode, int data) {
		if (rootNode == null) {
			rootNode = new Node(data);
			size++;
		} else {
			if (size % 2 == 1) {
				rootNode.right = createTree(rootNode.right, data);

			} else {
				rootNode.left = createTree(rootNode.left, data);

			}
		}

		return rootNode;
	}

	/**
	 * inorder traverse of tree 
	 * @param node		// node of tree 
	 */
	public void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);
		inOrder += (node.data);
		inOrder += " ";
		inOrder(node.right);
	}

	public void preOrder(Node node) {
		if (node == null)
			return;

		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	/* testing for example nodes */
	public static void main(String args[]) {
		/* creating a binary tree and entering the nodes */
		BinaryTreeMirror tree = new BinaryTreeMirror();
		Node rootTree1;
		rootTree1 = null;
		Node rootTree2;
		rootTree2 = null;
		System.out.println("Enter number of nodes in tree 1");
		int numberOfNodes = inputNumber();
		for (int i = 0; i < numberOfNodes; i++) {
			System.out.print("Enter element number " + (i + 1)+ " ");
			int data = inputNumber();
			rootTree1 = tree.createTree(rootTree1, data);
		}
		System.out.println("Enter number of nodes in tree 2");
		numberOfNodes = inputNumber();
		for (int i = 0; i < numberOfNodes; i++) {
			System.out.print("Enter element number " + (i + 1) +" ");
			int data = inputNumber();
			rootTree2 = tree.createTree(rootTree2, data);
		}
		String inOrderTree1 = "";
		String inOrderTree2 = "";
		tree.inOrder(rootTree1);
		inOrderTree1 = tree.inOrder;
		tree.inOrder = "";
		tree.mirror(rootTree1);
		tree.inOrder(rootTree1);
		inOrderTree1 = tree.inOrder;
		tree.inOrder = "";
		tree.inOrder(rootTree2);
		inOrderTree2 = tree.inOrder;
		if (inOrderTree1.equals(inOrderTree2)) {
			System.out.println("Trees are Mirror image of each other");
		} else {
			System.out.println("Trees are not Mirror image of each other");
		}
	}
}
