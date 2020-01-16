package Model;

public class UserModel extends Model{
	
	// ID(PK), PW, 이름, 주소, 전화번호
	private String USERNAME;
	private String User_ADDRESS;
	private int User_PHONE;
	
	
	// 회원가입
	public UserModel(String ID, String PW, String USERNAME, String User_ADDRESS, int User_PHONE) {
		super(ID, PW);
		this.USERNAME = USERNAME;
		this.User_ADDRESS = User_ADDRESS;
		this.User_PHONE = User_PHONE;
	}
	
	// 로그인
	public UserModel(String ID, String PW) {
		super(ID, PW);
		
	}
	
	// 중복 확인
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
