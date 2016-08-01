package session1_doublyLinkList;
/**
 * 
 * @author Avinash Chopra
 * @Date 29-07-2016
 * @param <T> generic parameter  
 */
public class Node<T> {
	public T data;
	public Node<T> prevAddress;
	public Node<T> nextAddress;

	@Override
	public String toString() {
		return data.toString();
	}
}
