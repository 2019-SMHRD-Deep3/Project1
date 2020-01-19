package Model;

public class Menu {
	
	private int menuSeq;
	private String shopkeeperId;
	private String food;
	private int price;
	
	
	
	public Menu(int menuSeq, String shopkeeperId, String food, int price) {
		super();
		this.menuSeq = menuSeq;
		this.shopkeeperId = shopkeeperId;
		this.food = food;
		this.price = price;
	}
	
	
	public int getMenuSeq() {
		return menuSeq;
	}
	public void setMenuSeq(int menuSeq) {
		this.menuSeq = menuSeq;
	}
	public String getShopkeeperId() {
		return shopkeeperId;
	}
	public void setShopkeeperId(String shopkeeperId) {
		this.shopkeeperId = shopkeeperId;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	} 
	
	
	

}
