package menuList;
public class Stack {
	 static Menu[] menu;
	 static int pointer;
	
	public Menu[] getMenu() {
		return menu;
	}

	public void setMenu(Menu[] menu) {
		Stack.menu = menu;
	}

	public Stack()
	{
		this.menu=new Menu[10];
		Stack.pointer=-1;
		for(int index=0;index<10;index++)
		{
			menu[index]=new Menu();
		}
	}

}
