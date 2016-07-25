package menuItemClassBased;
import java.util.ArrayList;
import java.util.List;

public class Choices {

	public static void main(String[] args) {

		Choices choices = new Choices();

		choices.action();
	}

	public void action(){

		try{

			MenuList ml = new MenuList();

			ml.action();

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
}