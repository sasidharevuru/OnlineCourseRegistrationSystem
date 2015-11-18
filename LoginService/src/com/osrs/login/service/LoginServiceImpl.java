package com.osrs.login.service;

import com.osrs.login.util.DBUtil;

public class LoginServiceImpl implements LoginService {
	
	public String login(String userName,String password){
		//Check credentials with database and create a session.
		//return sessionKey
		
		boolean isValidUser = DBUtil.checkLogin(userName,password);
		
		if(isValidUser){
			//create session key
			
		}
		return "";
	}
}
