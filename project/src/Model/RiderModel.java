package Model;

public class RiderModel extends Model {

	// ID, PW, �̸�, ����, �������, �������, �Ҽ� ���ȸ��, ��ȭ��ȣ

	private String RIDERNAME;
	private int RATING;
	private String TRANSPORTATION;
	private String LOC;
	private String COMPANY;
	private int PHONE;
	

	// ȸ������
	public RiderModel(String ID, String PW, String RIDERNAME, String TRANSPORTATION, String LOC,
			String COMPANY, int PHONE) {
		super(ID, PW);
		this.RIDERNAME = RIDERNAME;
		this.TRANSPORTATION = TRANSPORTATION;
		this.LOC = LOC;
		this.COMPANY = COMPANY;
		this.PHONE = PHONE;
	}
	
	// �α���
	public RiderModel(String ID, String PW) {
		super(ID, PW);
		
	}
	
	public RiderModel(String ID ) {
		super(ID );
		
	}
	

	// getter
	public String getRIDERNAME() {
		return RIDERNAME;
	}

	public int getRATING() {
		return RATING;
	}

	public String getTRANSPORTATION() {
		return TRANSPORTATION;
	}

	public String getLOC() {
		return LOC;
	}

	public String getCOMPANY() {
		return COMPANY;
	}

	public int getPHONE() {
		return PHONE;
	}

	
	
	
	// setter
	public void setRIDERNAME(String RIDERNAME) {
		this.RIDERNAME = RIDERNAME;
	}

	public void setRATING(int RATING) {
		this.RATING = RATING;
	}

	public void setTRANSPORTATION(String TRANSPORTATION) {
		this.TRANSPORTATION = TRANSPORTATION;
	}

	public void setLOC(String LOC) {
		this.LOC = LOC;
	}

	public void setCOMPANY(String COMPANY) {
		this.COMPANY = COMPANY;
	}

	public void setPHONE(int PHONE) {
		this.PHONE = PHONE;
	}

}
