package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

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
			psmt.setString(4, m.getUSER_ADDRESS());
			psmt.setInt(5, m.getUSER_PHONE());
			rows = psmt.executeUpdate();
			if (rows == 0) {
				System.out.println("sql문이 잘못되었습니다.");
			} else {

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 오류문구 출력
		} catch (SQLException e) {
			e.printStackTrace(); // 오류문구 출력
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	
	
	

	//수정
	public int sujung(UserModel m, String id) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "update USER2 set PW=?, USERNAME=?, USER_ADDRESS=?, USER_PHONE=? where USER_ID=?  ";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, m.getPW());

			psmt.setString(2, m.getUSERNAME());
			psmt.setString(3, m.getUSER_ADDRESS());
			psmt.setInt(4, m.getUSER_PHONE());
			psmt.setString(5, id);
			
		
			rows = psmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
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
			if (rows == 0) {
				System.out.println("sql문이 잘못되었습니다.");
			} else {

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 오류문구 출력
		} catch (SQLException e) {
			e.printStackTrace(); // 오류문구 출력
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
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
			String sql = "INSERT INTO SHOPKEEPER(SEQ,SHOPKEEPER_ID,PW,SHOPNAME,SHOP_ADDRESS,BUSINESS_LICENSE,SHOP_TEL) VALUES (Update_sequence.NEXTVAL,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());
			psmt.setString(3, m.getSHOPNAME());
			psmt.setString(4, m.getSHOP_ADDRESS());
			psmt.setInt(5, m.getBUSINESS_LICENSE());
			psmt.setString(6, m.getSHOP_TEL());
//			psmt.setInt(7, m.getSECTOR());
			rows = psmt.executeUpdate();
			if (rows == 0) {
				System.out.println("sql문이 잘못되었습니다.");
			} else {

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 오류문구 출력
		} catch (SQLException e) {
			e.printStackTrace(); // 오류문구 출력
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	// 로그인
	public Model selectUser(Model m) {
		Model loginUser = null;

		try { // try ~ catch 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

			// 일반유저 로그인
			String sql = "SELECT * FROM USER2 " + "WHERE USER_ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());

			rs = psmt.executeQuery(); // 실행

			if (rs.next()) { // rs.next() -> 다음 줄이 있는지 없는지 T/F 로 알려줌
				// 해당 ID와 PW를 가진 사람이 존재
				String id = rs.getString("USER_ID");
				String pw = rs.getString("PW");
				String name = rs.getString("USERNAME");
				String address = rs.getString("USER_ADDRESS");
				int phone = rs.getInt("USER_PHONE");

				loginUser = new UserModel(id, pw, name, address, phone); // 객체를 생성해주기

			}

		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return loginUser;
	}






	public Model selectShopkeeper(Model m) {
		Model loginUser = null;

		try { // try ~ catch 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

			// 일반유저 로그인
			String sql = "SELECT * FROM SHOPKEEPER " + "WHERE SHOPKEEPER_ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());

			rs = psmt.executeQuery(); // 실행

			if (rs.next()) { // rs.next() -> 다음 줄이 있는지 없는지 T/F 로 알려줌
				// 해당 ID와 PW를 가진 사람이 존재
				String id = rs.getString("SHOPKEEPER_ID");
				String pw = rs.getString("PW");
				loginUser = new ShopkeeperModel(id, pw); // 객체를 생성해주기

				}
			}

		
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return loginUser;
	}

	public Model selectRider(Model m) {
		Model loginUser = null;

		try { // try ~ catch 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

			// 일반유저 로그인
			String sql = "SELECT * FROM RIDER " + "WHERE RIDER_ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());

			rs = psmt.executeQuery(); // 실행

			if (rs.next()) { // rs.next() -> 다음 줄이 있는지 없는지 T/F 로 알려줌
				// 해당 ID와 PW를 가진 사람이 존재
				String id = rs.getString("RIDER_ID");
				String pw = rs.getString("PW");
				loginUser = new RiderModel(id, pw); // 객체를 생성해주기

				}

			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return loginUser;
	}
	// 중복 확인
	public Model idCheck(Model m) {
		Model ID = null;

		try { // try ~ catch 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

			// 일반유저 테이블 확인
			String sql = "SELECT * FROM USER2 " + "WHERE USER_ID = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());

			rs = psmt.executeQuery(); // 실행

			if (rs.next()) { // rs.next() -> 다음 줄이 있는지 없는지 T/F 로 알려줌
				// 해당 ID와 PW를 가진 사람이 존재
				String id = rs.getString("USER_ID");
				ID = new UserModel(id);

			}

			if (ID == null) {
				// 사장님 테이블 확인
				sql = "SELECT * FROM SHOPKEEPER " + "WHERE SHOPKEEPER_ID = ?";

				psmt = conn.prepareStatement(sql);
				psmt.setString(1, m.getID());

				rs = psmt.executeQuery(); // 실행

				if (rs.next()) { // rs.next() -> 다음 줄이 있는지 없는지 T/F 로 알려줌
					// 해당 ID와 PW를 가진 사람이 존재
					String id = rs.getString("SHOPKEEPER_ID");
					ID = new UserModel(id);

				}
			}

			if (ID == null) {
				// 라이더 테이블 확인
				sql = "SELECT * FROM RIDER " + "WHERE RIDER_ID = ?";

				psmt = conn.prepareStatement(sql);
				psmt.setString(1, m.getID());

				rs = psmt.executeQuery(); // 실행

				if (rs.next()) { // rs.next() -> 다음 줄이 있는지 없는지 T/F 로 알려줌
					// 해당 ID와 PW를 가진 사람이 존재
					String id = rs.getString("RIDER_ID");

					ID = new UserModel(id);

				}

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return ID;
	}

	// 라이더
	public int insert5(String String, int num, String id) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO ORDERLIST VALUES (?,?,?, sysdate)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, String);
			psmt.setInt(2, num);
			psmt.setString(3, id);

			rows = psmt.executeUpdate();
			if (rows == 0) {
				System.out.println("sql문이 잘못되었습니다.");
			} else {

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 오류문구 출력
		} catch (SQLException e) {
			e.printStackTrace(); // 오류문구 출력
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public ArrayList<Payment> selectAll(String USER_ID) {
		ArrayList<Payment> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			
			
			Date date = new Date(System.currentTimeMillis());
			
			
			
			String sql = "SELECT MENU, PRICE   FROM  ORDERLIST " + "WHERE USER_ID = ? AND to_date(ORDER_DATE, 'YY/MM/DD') = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, USER_ID);
			psmt.setString(2, date.getYear()-100+"/"+(date.getMonth()+1)+"/"+date.getDate());
			rs = psmt.executeQuery();

			while (rs.next()) {

				String Menu = rs.getString("MENU");
				int Price = rs.getInt("PRICE");

				list.add(new Payment(Menu, Price));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 오류문구 출력
		} catch (SQLException e) {
			e.printStackTrace(); // 오류문구 출력
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
		/////////// 리스트 뽑는 부분

	}





	public int next() {
		int price =0;
		try { // try ~ catch 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

			// 일반유저 테이블 확인
			String sql = "SELECT * FROM SHOPKEEPER ";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); // 실행

			while (rs.next()) {
			 price++; 
			}
			System.out.println(price);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return price;
	}





	public ShopkeeperModel selectshop(int n) {
		ShopkeeperModel loginUser = null;

		try { // try ~ catch 예외처리
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

			// 일반유저 로그인
			String sql = "SELECT * FROM SHOPKEEPER " + "WHERE SEQ = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, n);
			

			rs = psmt.executeQuery(); // 실행

			if (rs.next()) { // rs.next() -> 다음 줄이 있는지 없는지 T/F 로 알려줌
				// 해당 ID와 PW를 가진 사람이 존재
				String shopName = rs.getString("SHOPNAME");
				String address = rs.getString("SHOP_ADDRESS");
//				Integer.parseInt(AGE.getText());
				String tel =rs.getString("SHOP_TEL");
				loginUser = new ShopkeeperModel(shopName, address, tel); // 객체를 생성해주기

				}
			}

		
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return loginUser;
	
	}



}
