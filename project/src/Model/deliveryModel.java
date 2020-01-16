package Model;

public class deliveryModel {

	private int order_number;
	private String user_address;
	private String store_name;
	private String store_address;
	
	public deliveryModel(int order_number, String user_address, String store_name, String store_address) {
		super();
		this.order_number = order_number;
		this.user_address = user_address;
		this.store_name = store_name;
		this.store_address = store_address;
	}

	public int getOrder_number() {
		return order_number;
	}

	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getStore_address() {
		return store_address;
	}

	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}
	
}
