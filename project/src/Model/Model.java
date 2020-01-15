package Model;

public class Model {

	private String ID;
	private String PW;
	
	
	// 로그인
	public Model(String ID, String PW) {
		super();
		this.ID = ID;
		this.PW = PW;
	}
	
	// 중복 확인
	public Model(String ID) {
		super();
		this.ID = ID;
	}

	// getter
	public String getID() {
		return ID;
	}

	public String getPW() {
		return PW;
	}
	
	// setter
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public void setPW(String PW) {
		this.PW = PW;
	}
	
	
	
}
