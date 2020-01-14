package Model;

public class UserModel extends Model{
	
	// ID(PK), PW, 이름, 주소, 전화번호
	private String USERNAME;
	private String ADDRESS;
	private int PHONE;
	
	
	// 회원가입
	public UserModel(String ID, String PW, String USERNAME, String ADDRESS, int PHONE) {
		super(ID, PW);
		this.USERNAME = USERNAME;
		this.ADDRESS = ADDRESS;
		this.PHONE = PHONE;
	}
	
	// Getter 
	public String getUSERNAME() {
		return USERNAME;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public int getPHONE() {
		return PHONE;
	}
	
	
	// Setter 
	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;
	}
	public void setADDRESS(String ADDRESS) {
		this.ADDRESS = ADDRESS;
	}
	public void setPHONE(int PHONE) {
		this.PHONE = PHONE;
	}
	
}
