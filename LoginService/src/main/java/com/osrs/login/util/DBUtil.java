package com.osrs.login.util;

import com.osrs.login.model.RegisterRequest;
import com.osrs.login.model.RegisterResponse;

public class DBUtil {

	public static boolean checkLogin(String userName, String password) {
		//TODO: connect to DB.
		return true;
	}

	public static RegisterResponse registerUser(RegisterRequest registerBean) {
		return new RegisterResponse("kjdf989dgf4fn","success");
	}

}
