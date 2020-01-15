package Model;

public class ShopkeeperModel extends Model{
	
	// ID, PW, 가게 이름, 주소, 사업자번호, 평점, 전화번호 
	private String SHOPNAME;
	private String ADDRESS;
	private int BUSINESS_LICENSE;
	private int	RATING;
	private int	TEL;
	
	
	// 회원가입
	public ShopkeeperModel(String ID, String PW, String SHOPNAME, String ADDRESS, int BUSINESS_LICENSE, int TEL) {
		super(ID, PW);
		this.SHOPNAME = SHOPNAME;
		this.ADDRESS = ADDRESS;
		this.BUSINESS_LICENSE = BUSINESS_LICENSE;
		this.TEL = TEL;
	}

	// getter
	public String getSHOPNAME() {
		return SHOPNAME;
	}


	public String getADDRESS() {
		return ADDRESS;
	}


	public int getBUSINESS_LICENSE() {
		return BUSINESS_LICENSE;
	}


	public int getRATING() {
		return RATING;
	}


	public int getTEL() {
		return TEL;
	}

	// setter
	public void setSHOPNAME(String sHOPNAME) {
		this.SHOPNAME = sHOPNAME;
	}

	public void setADDRESS(String aDDRESS) {
		this.ADDRESS = aDDRESS;
	}

	public void setBUSINESS_LICENSE(int bUSINESS_LICENSE) {
		this.BUSINESS_LICENSE = bUSINESS_LICENSE;
	}

	public void setRATING(int rATING) {
		this.RATING = rATING;
	}

	public void setTEL(int tEL) {
		this.TEL = tEL;
	}
	
	
	
}
