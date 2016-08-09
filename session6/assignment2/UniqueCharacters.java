package session6.assignment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 * @author Avinash Chopra
 * 
 */
public class UniqueCharactersImplementor {

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
	public static void main(String[] args) {

		
		UniqueCharacters uniqueCharacters = new UniqueCharacters();
		
		try {
			while (true) {
				int choice = 0;
				System.out
						.println("Enter the choice\n1. Enter a string\n2. Exit");
				String temp = inputString();
				if (!temp.equalsIgnoreCase("1") && !temp.equalsIgnoreCase("2")) {
					choice = 5;
				} else {
					choice = Integer.parseInt(temp);
				}
				switch (choice) {
				case 1:
					System.out.println("Enter a string ");
					String input = inputString();
					int totalChar = uniqueCharacters.uniqueCharacters(input);
					System.out.println("Total unique characters in : " + input+ " are " + totalChar);
					break;
				case 2:
					System.out.println("program End,Thank you");
					System.exit(-1);
				default:
					System.out.println("Enter a valid choice");
					break;
				}
			}
		} catch (Exception exception) {
			System.out.println("Something went wrong : "+ exception.getMessage());
		} 
			
	}
}
