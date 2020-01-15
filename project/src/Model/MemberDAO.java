package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberDAO {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	
	
	
	////// ���� ���� �κ�
	// �Ϲ�����
	public int insert(UserModel m) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO USER2 VALUES (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());
			psmt.setString(3, m.getUSERNAME());
			psmt.setString(4, m.getADDRESS());
			psmt.setInt(5, m.getPHONE());
			rows = psmt.executeUpdate();
			if(rows==0) {
				System.out.println("sql���� �߸��Ǿ����ϴ�.");
			}else {
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //�������� ���
		} catch (SQLException e) {
			e.printStackTrace(); //�������� ���
		} finally {
			try {
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	
	// ���̴�	
	public int insert1(RiderModel m) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO RIDER VALUES (?,?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());
			psmt.setString(3, m.getRIDERNAME());
			psmt.setInt(4, m.getRATING());
			psmt.setString(5, m.getTRANSPORTATION());
			psmt.setString(6, m.getLOC());
			psmt.setString(7, m.getCOMPANY());
			psmt.setInt(8, m.getPHONE());
			
			rows = psmt.executeUpdate();
			if(rows==0) {
				System.out.println("sql���� �߸��Ǿ����ϴ�.");
			}else {
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //�������� ���
		} catch (SQLException e) {
			e.printStackTrace(); //�������� ���
		} finally {
			try {
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	
	// ����
	public int insert2(ShopkeeperModel m) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO SHOPKEEPER VALUES (?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());
			psmt.setString(3, m.getSHOPNAME());
			psmt.setString(4, m.getADDRESS());
			psmt.setInt(5, m.getBUSINESS_LICENSE());
			psmt.setInt(6, m.getRATING());
			psmt.setInt(7, m.getTEL());
			rows = psmt.executeUpdate();
			if(rows==0) {
				System.out.println("sql���� �߸��Ǿ����ϴ�.");
			}else {
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //�������� ���
		} catch (SQLException e) {
			e.printStackTrace(); //�������� ���
		} finally {
			try {
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	
	
	
	
	// �α���
	// �Ϲ�����
	public UserModel selectOne(UserModel m) {
		UserModel loginUser = null;
		
		try { // try ~ catch ����ó�� 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			conn = DriverManager.getConnection(url,user, password); 
			String sql = "SELECT * FROM USER2 " +
						"WHERE USER_ID = ? AND PW = ?"; 
			psmt = conn.prepareStatement(sql);  
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());
			
			rs = psmt.executeQuery();  // ����
			
			if(rs.next()) {  // rs.next()  -> ���� ���� �ִ��� ������ T/F �� �˷���
				// �ش� ID�� PW�� ���� ����� ����
				String id = rs.getString("USER_ID");
				String pw = rs.getString("PW");
				loginUser = new UserModel(id, pw);  // ��ü�� �������ֱ� 
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
			
		} finally { 
			try {
				if(rs != null) rs.close();
				if(psmt !=null) psmt.close();
				if(conn!= null) {
					conn.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
		}
		
		return loginUser;
	}
	
}
