package Model;

public class UserModel extends Model{
	
	// ID(PK), PW, �̸�, �ּ�, ��ȭ��ȣ
	private String USERNAME;
	private String User_ADDRESS;
	private int User_PHONE;
	
	
	// ȸ������
	public UserModel(String ID, String PW, String USERNAME, String User_ADDRESS, int User_PHONE) {
		super(ID, PW);
		this.USERNAME = USERNAME;
		this.User_ADDRESS = User_ADDRESS;
		this.User_PHONE = User_PHONE;
	}
	
	// �α���
	public UserModel(String ID, String PW) {
		super(ID, PW);
		
	}
	
	// �ߺ� Ȯ��
	public UserModel(String ID) {
		super(ID);
	}

	// Getter 
	public String getUSERNAME() {
		return USERNAME;
	}
	public String getUSER_ADDRESS() {
		return User_ADDRESS;
	}
	public int getUSER_PHONE() {
		return User_PHONE;
	}
	
	
	// Setter 
	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;
	}
	public void setUSER_ADDRESS(String User_ADDRESS) {
		this.User_ADDRESS = User_ADDRESS;
	}
	public void setUSER_PHONE(int User_PHONE) {
		this.User_PHONE = User_PHONE;
	}
	
}
