package session7.assignment1;

/**
 * 
 *  @author Avinash Chopra
 *
 */
public class BinaryTree {

	//the binary tree contains a BST
	BinarySearchTree bst;

	public BinaryTree() {
		bst=new BinarySearchTree();
	}

	public BinarySearchTree getBst() {
		return bst;
	}

	public void setBst(BinarySearchTree bst) {
		this.bst = bst;
	}

	
}