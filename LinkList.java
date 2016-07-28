package session1;

public class LinkList<T> {

	Node<T> head;
	public int length;
	public LinkList(){
		head = null;
		length = 0;
	}
	
	public boolean inseartAtEnd(T object){
		Node<T> tempObject;
		tempObject = null;
		tempObject = inseart(head,object);
		if(tempObject == null){
			return false;
		}
		else{
			if(head == null){
				head = tempObject;
			}
			length++;
			return true;
		}
	}
	
	public void showList(){
		show(head);
	}
	
	
	
	private  Node<T> inseart(Node<T> n,T d){
		if(n == null){
			Node<T> temp = new Node<T>();
			temp.data = d;
			temp.address = null;
			return temp;
		}
		else{
			n.address = inseart(n.address,d);
			return n;
		}		
	}
	
	
	private void show(Node<T> n){
		if(n != null){
			System.out.println(n.data);
			show(n.address);
		}
	}
	
	public boolean insertAtPosition(int position,T userObject){
		int i;
		Node<T> prev;
		prev = head;
		
		if(position > length+1){
			return false;
		}
		
		else if(position == 1){
			Node<T> insertNode = new Node<T>();
			insertNode.address = head;
			insertNode.data = userObject;
			head = insertNode; 
			return true;
		}
		else{
			
			for(i = 1;i<position-1;i++){
				prev = prev.address;
			}
			if(i == position || i == position-1){
				Node<T> tempNode;
				Node<T> insertNode = new Node<T>();
				tempNode = prev.address;
				insertNode.address = tempNode;
				insertNode.data = userObject;
				prev.address = insertNode;
				length++;
				return true;
			}
			else{
				return false;
			}	
		}		
	}
	

	public boolean deleteByValue(T userObject){
		Node<T> tempNode ;
		Node<T> prevNode = null;
		tempNode = head;
		for(int i=0;i<=length && tempNode != null;i++){
			if((tempNode.data).equals(userObject) && prevNode == null){
				head = tempNode.address;
				length--;
				return true;
			}
			else if((tempNode.data).equals(userObject)){
				prevNode.address = tempNode.address;
				length--;
				return true;
			}
			prevNode = tempNode;
			tempNode = tempNode.address;
		}
		return false;
	}

	public boolean deleteByIndex(int position){
		if(position > length){
			return false;
		}
		else if(position == 1){
			head = head.address;
			length--;
			return true;
		}
		else{
			Node<T> tempNode;
			tempNode = head;
			for(int i=1; i< position-1;i++){
				tempNode = tempNode.address;
			}
			if((tempNode.address) == null){
				tempNode.address = (tempNode.address);
			}else{
				tempNode.address = (tempNode.address).address;
			}
			
			length--;
			return true;
		}
	}

	public boolean showItemAtIndex(int position){
		if(position>length){
			return false;
		}
		else{
			Node<T> tempNode;
			tempNode = head;
			for(int i=1; i< position ;i++){
				tempNode = tempNode.address;
			}
			System.out.println(tempNode.data);
			return true;
		}
	}
	
	public boolean reversal(){
		Node<T> tempNode;
		Node<T> prevNode = null;
		Node<T> currentNode;
		Node<T> temp;
		temp = null;
		currentNode = head;
		for(int i=1; i<=length;i++ ){
			System.out.println("current node " + currentNode.data);
			prevNode = currentNode;
			tempNode = currentNode.address;
			currentNode.address = temp;
			temp = currentNode;
			currentNode = tempNode;
			System.out.println("current node " + currentNode.data);
		}
		head = prevNode;
		return true;
	}
}
