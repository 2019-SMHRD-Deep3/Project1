package Model;

public class Payment {

	private String Menu;
	private int Price;
	
	public Payment(String menu, int price) {
		super();
		Menu = menu;
		Price = price;
	}
	
	public String getMenu() {
		return Menu;
	}
	public int getPrice() {
		return Price;
	}
	
	
	
	
}
