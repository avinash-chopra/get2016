package session1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SinglyLinkList {

	// get user input number
	public static int getInputNumber() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = getInputNumber();
		}
		return inputNumber;
	}
	public static void main(String[] args) {
		 
		LinkList<Integer> list = new LinkList<Integer>();
		int loopVariable = 1;
		while(loopVariable == 1){
			System.out.println("Enter 1 insert in link list");
			System.out.println("Enter 2 insert in link list At a particular position");
			System.out.println("Enter 3 remove a item by value");
			System.out.println("Enter 4 remove a item by position");
			System.out.println("Enter 5 show link list");
			System.out.println("Enter 6 show a particular item in link list");
			System.out.println("Enter 7 reversal of link list");
			System.out.println("Enter Any other number to Exit");
			
			int choice = getInputNumber();
			
			switch(choice){
			case 1 :
				System.out.println("Enter the number you want to inseart");
				int number = getInputNumber();
				if(list.inseartAtEnd(number)){
					System.out.println("Insearted success full");
				}else{
					System.out.println("sorry,number cannot insearted");
				}
				break;
			case 2 :
				System.out.println("Enter the number you want to inseart");
				int numberToInseart = getInputNumber();
				System.out.println("Enter the position to inseart");
				int position = getInputNumber();
				if(list.insertAtPosition(position, numberToInseart)){
					System.out.println("Insearted success fully");
				}else{
					System.out.println("sorry,number cannot insearted");
				}
				break;
			case 3 :
				System.out.println("Enter the number you want to delete");
				int numberToDelete = getInputNumber();
				if(list.deleteByValue(numberToDelete)){
					System.out.println("Number success fully deleted");
				}else{
					System.out.println("sorry, number can't deleted");
				}
				break;
			case 4 :
				System.out.println("Enter the number you want to delete");
				int PositionToDelete = getInputNumber();
				if(list.deleteByIndex(PositionToDelete)){
					System.out.println("Number success fully deleted");
				}else{
					System.out.println("sorry, number can't deleted");
				}
				break;
			case 5:
				System.out.println("following number in link list ");
				list.showList();
				break;
			case 6:
				System.out.println("Enter position in link list to show ");
				int positionToShow = getInputNumber();
				if(list.showItemAtIndex(positionToShow) == false){
					System.out.println("sorry, Enter correct position");
				}
				break;
			case 7 :
				list.reversal();
				break;
			default:
				loopVariable = 0;
			}
			
			
			
			
			
			
		}
		 
	}
	
	
	

	
	
	
	
}
