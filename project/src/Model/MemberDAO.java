package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	
	
	
	////// 계정 생성 부분
	public int insert(UserModel m) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO MEMBER VALUES (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());
			psmt.setString(3, m.getUSERNAME());
			psmt.setString(4, m.getADDRESS());
			psmt.setInt(5, m.getPHONE());
			rows = psmt.executeUpdate();
			
			
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
	
	//////////////////
	
	

	
	
	
		
		
		
		
	
}
