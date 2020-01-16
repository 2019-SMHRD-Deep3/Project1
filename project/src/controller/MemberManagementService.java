package controller;

import Model.MemberDAO;
import Model.Model;
import Model.RiderModel;
import Model.ShopkeeperModel;
import Model.UserModel;

public class MemberManagementService {

	private MemberDAO dao = new MemberDAO();

	
	// 중복 확인
	public boolean idCheck(Model m) {
		Model ID = dao.idCheck(m);
		if (ID == null) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// 생성
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

	//로그인
	public Model userLogin(Model m) {
		Model loginUser = dao.selectOne(m);
		return loginUser;
	}
	
	public Model ShopkepperLogin(Model m) {
		Model loginShopkepper = dao.selectOne(m);
		return loginShopkepper;
	}
	
	public Model RiderLogin(Model m) {
		Model loginRider = dao.selectOne(m);
		return loginRider;
	}
	
}
