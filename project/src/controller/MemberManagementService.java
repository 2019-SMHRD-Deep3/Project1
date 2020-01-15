package controller;

import Model.MemberDAO;
import Model.RiderModel;
import Model.ShopkeeperModel;
import Model.UserModel;

public class MemberManagementService {

	private MemberDAO dao = new MemberDAO();

	
	
	//����
	public boolean memberJoin(UserModel m) {
		int rows = dao.insert(m);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean riderJoin(RiderModel m) {
		int rows = dao.insert1(m);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean shopkeeperJoin(ShopkeeperModel m) {
		int rows = dao.insert2(m);
		if (rows == 0) {
			return false;
		} else {
			return true;
		}
	}

	//�α���
	public UserModel userLogin(UserModel m) {
		UserModel loginUser = dao.selectOne(m);
		return loginUser;
	}
}
