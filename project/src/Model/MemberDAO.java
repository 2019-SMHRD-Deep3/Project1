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

	
	
	
	////// 계정 생성 부분
	// 일반유저
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
				System.out.println("sql문이 잘못되었습니다.");
			}else {
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //오류문구 출력
		} catch (SQLException e) {
			e.printStackTrace(); //오류문구 출력
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
	
	// 라이더	
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
				System.out.println("sql문이 잘못되었습니다.");
			}else {
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //오류문구 출력
		} catch (SQLException e) {
			e.printStackTrace(); //오류문구 출력
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
	
	// 사장
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
				System.out.println("sql문이 잘못되었습니다.");
			}else {
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //오류문구 출력
		} catch (SQLException e) {
			e.printStackTrace(); //오류문구 출력
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
	
	
	
	
	// 로그인
	// 일반유저
	public UserModel selectOne(UserModel m) {
		UserModel loginUser = null;
		
		try { // try ~ catch 예외처리 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			conn = DriverManager.getConnection(url,user, password); 
			String sql = "SELECT * FROM USER2 " +
						"WHERE USER_ID = ? AND PW = ?"; 
			psmt = conn.prepareStatement(sql);  
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());
			
			rs = psmt.executeQuery();  // 실행
			
			if(rs.next()) {  // rs.next()  -> 다음 줄이 있는지 없는지 T/F 로 알려줌
				// 해당 ID와 PW를 가진 사람이 존재
				String id = rs.getString("USER_ID");
				String pw = rs.getString("PW");
				loginUser = new UserModel(id, pw);  // 객체를 생성해주기 
				
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
