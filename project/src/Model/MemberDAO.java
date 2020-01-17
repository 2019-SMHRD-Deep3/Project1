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
			psmt.setString(4, m.getUSER_ADDRESS());
			psmt.setInt(5, m.getUSER_PHONE());
			rows = psmt.executeUpdate();
			if (rows == 0) {
				System.out.println("sql���� �߸��Ǿ����ϴ�.");
			} else {

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // �������� ���
		} catch (SQLException e) {
			e.printStackTrace(); // �������� ���
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
			if (rows == 0) {
				System.out.println("sql���� �߸��Ǿ����ϴ�.");
			} else {

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // �������� ���
		} catch (SQLException e) {
			e.printStackTrace(); // �������� ���
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

	// ����
	public int insert2(ShopkeeperModel m) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO SHOPKEEPER(SHOPKEEPER_ID,PW,SHOPNAME,SHOP_ADDRESS,BUSINESS_LICENSE,SHOP_TEL) VALUES (?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());
			psmt.setString(3, m.getSHOPNAME());
			psmt.setString(4, m.getSHOP_ADDRESS());
			psmt.setInt(5, m.getBUSINESS_LICENSE());
			psmt.setInt(6, m.getSHOP_TEL());
//			psmt.setInt(7, m.getSECTOR());
			rows = psmt.executeUpdate();
			if (rows == 0) {
				System.out.println("sql���� �߸��Ǿ����ϴ�.");
			} else {

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // �������� ���
		} catch (SQLException e) {
			e.printStackTrace(); // �������� ���
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

	// �α���
	public Model selectOne(Model m) {
		Model loginUser = null;

		try { // try ~ catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

			// �Ϲ����� �α���
			String sql = "SELECT * FROM USER2 " + "WHERE USER_ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());
			psmt.setString(2, m.getPW());

			rs = psmt.executeQuery(); // ����

			if (rs.next()) { // rs.next() -> ���� ���� �ִ��� ������ T/F �� �˷���
				// �ش� ID�� PW�� ���� ����� ����
				String id = rs.getString("USER_ID");
				String pw = rs.getString("PW");
				String name = rs.getString("USERNAME");
				String address = rs.getString("USER_ADDRESS");
				int phone = rs.getInt("USER_PHONE");

				loginUser = new UserModel(id, pw, name, address, phone); // ��ü�� �������ֱ�

			}

			if (loginUser == null) {
				// ����� �α���
				sql = "SELECT * FROM SHOPKEEPER " + "WHERE SHOPKEEPER_ID = ? AND PW = ?";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, m.getID());
				psmt.setString(2, m.getPW());

				rs = psmt.executeQuery(); // ����

				if (rs.next()) { // rs.next() -> ���� ���� �ִ��� ������ T/F �� �˷���
					// �ش� ID�� PW�� ���� ����� ����
					String id = rs.getString("SHOPKEEPER_ID");
					String pw = rs.getString("PW");
					loginUser = new ShopkeeperModel(id, pw); // ��ü�� �������ֱ�

				}
			}

			if (loginUser == null) {
				// ���̴� �α���
				sql = "SELECT * FROM RIDER " + "WHERE RIDER_ID = ? AND PW = ?";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, m.getID());
				psmt.setString(2, m.getPW());

				rs = psmt.executeQuery(); // ����

				if (rs.next()) { // rs.next() -> ���� ���� �ִ��� ������ T/F �� �˷���
					// �ش� ID�� PW�� ���� ����� ����
					String id = rs.getString("RIDER_ID");
					String pw = rs.getString("PW");
					loginUser = new RiderModel(id, pw); // ��ü�� �������ֱ�

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

		return loginUser;
	}

	// �ߺ� Ȯ��
	public Model idCheck(Model m) {
		Model ID = null;

		try { // try ~ catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, user, password);

			// �Ϲ����� ���̺� Ȯ��
			String sql = "SELECT * FROM USER2 " + "WHERE USER_ID = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getID());

			rs = psmt.executeQuery(); // ����

			if (rs.next()) { // rs.next() -> ���� ���� �ִ��� ������ T/F �� �˷���
				// �ش� ID�� PW�� ���� ����� ����
				String id = rs.getString("USER_ID");
				ID = new UserModel(id);

			}

			if (ID == null) {
				// ����� ���̺� Ȯ��
				sql = "SELECT * FROM SHOPKEEPER " + "WHERE SHOPKEEPER_ID = ?";

				psmt = conn.prepareStatement(sql);
				psmt.setString(1, m.getID());

				rs = psmt.executeQuery(); // ����

				if (rs.next()) { // rs.next() -> ���� ���� �ִ��� ������ T/F �� �˷���
					// �ش� ID�� PW�� ���� ����� ����
					String id = rs.getString("SHOPKEEPER_ID");
					ID = new UserModel(id);

				}
			}

			if (ID == null) {
				// ���̴� ���̺� Ȯ��
				sql = "SELECT * FROM RIDER " + "WHERE RIDER_ID = ?";

				psmt = conn.prepareStatement(sql);
				psmt.setString(1, m.getID());

				rs = psmt.executeQuery(); // ����

				if (rs.next()) { // rs.next() -> ���� ���� �ִ��� ������ T/F �� �˷���
					// �ش� ID�� PW�� ���� ����� ����
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


	// ���̴�
	public int insert2 ( String String) {
		int rows = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO ORDERLIST(MENU) VALUES (?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, String);
			

			rows = psmt.executeUpdate();
			if (rows == 0) {
				System.out.println("sql���� �߸��Ǿ����ϴ�.");
			} else {

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // �������� ���
		} catch (SQLException e) {
			e.printStackTrace(); // �������� ���
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

}
