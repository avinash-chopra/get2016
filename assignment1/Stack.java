package session2_assignment1;
import session1_singlyLinkList.*;
/**
 * 
 * @author Avinash 
 * @Date 29 july 2016
 * @param <T> 		// generic parameter
 */
public class Stack<T> {
	LinkList<T> list = new LinkList<T>();
	
	public void push(T data){
		list.inseartAtEnd(data);
	}
	
	public T pop(){
		int len = list.getLength();
		T data;
		if(len > 0 ){
			data = list.getLastElement();
			if(data != null){
				return data;
			}
			return null;
		}else{
			System.out.println("sorry there is no element there" );
			return null;
		}
	}
	
	public void showStack(){
		list.showList();
	}
}
