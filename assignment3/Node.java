package session1_singlyLinkList;
/**
 * 
 * @author Avinash
 * @Date 28 july 2016
 * @param <T> 		// generic data type
 */
public class Node<T> {
	// to hold the data
	public T data;
	// to hold the address of node
	public Node<T> address;
	
	@Override
	public String toString() {
		return data.toString();
	}
}
