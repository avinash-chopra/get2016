package session5;
/**
 * 
 * @author Avinash Chopra
 * @Date 04-08-2016
 *	Node of link list
 */
public class Node {
	// data
	int data;
	// next node address
	Node nextAddress;
	// constructor 
	public Node(int data){
		this.data = data;
		this.nextAddress = null;
	}
	// default constructor 
	public Node(){
		
	}
	// constructor 
	public Node(int data,Node address){
		this.data = data;
		this.nextAddress = address;
	}

}
