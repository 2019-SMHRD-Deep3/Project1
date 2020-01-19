package Model;

public class OrderList {
	private String userId;
	private String shopkeeperID;
	private int seq;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getShopkeeperID() {
		return shopkeeperID;
	}
	public void setShopkeeperID(String shopkeeperID) {
		this.shopkeeperID = shopkeeperID;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public OrderList(String userId, String shopkeeperID, int seq) {
		super();
		this.userId = userId;
		this.shopkeeperID = shopkeeperID;
		this.seq = seq;
	}
	
	
	
	
}
