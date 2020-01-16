package Model;

public class ShopkeeperModel extends Model{
	
	// ID, PW, 가게 이름, 주소, 사업자번호, 평점, 전화번호 
	private String SHOPNAME;
	private String SHOP_ADDRESS;
	private int BUSINESS_LICENSE;
	private int	RATING;
	private int	SHOP_TEL;
	
	
	// 회원가입
	public ShopkeeperModel(String ID, String PW, String SHOPNAME, String SHOP_ADDRESS, int BUSINESS_LICENSE, int SHOP_TEL) {
		super(ID, PW);
		this.SHOPNAME = SHOPNAME;
		this.SHOP_ADDRESS = SHOP_ADDRESS;
		this.BUSINESS_LICENSE = BUSINESS_LICENSE;
		this.SHOP_TEL = SHOP_TEL;
	}
	
	// 로그인
	public ShopkeeperModel(String ID, String PW) {
		super(ID, PW);
		
	}

	// getter
	public String getSHOPNAME() {
		return SHOPNAME;
	}


	public String getSHOP_ADDRESS() {
		return SHOP_ADDRESS;
	}


	public int getBUSINESS_LICENSE() {
		return BUSINESS_LICENSE;
	}


	public int getRATING() {
		return RATING;
	}


	public int getSHOP_TEL() {
		return SHOP_TEL;
	}

	// setter
	public void setSHOPNAME(String sHOPNAME) {
		this.SHOPNAME = sHOPNAME;
	}

	public void setADDRESS(String aDDRESS) {
		this.SHOP_ADDRESS = aDDRESS;
	}

	public void setBUSINESS_LICENSE(int bUSINESS_LICENSE) {
		this.BUSINESS_LICENSE = bUSINESS_LICENSE;
	}

	public void setRATING(int rATING) {
		this.RATING = rATING;
	}

	public void setTEL(int SHOP_TEL) {
		this.SHOP_TEL = SHOP_TEL;
	}
	
	
	
}
