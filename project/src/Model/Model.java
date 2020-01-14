package Model;

public class Model {

	private String ID;
	private String PW;
	
	
	// ·Î±×ÀÎ
	public Model(String ID, String PW) {
		super();
		this.ID = ID;
		this.PW = PW;
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
