package com.osrs.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.osrs.login.service.LoginService;

/**
 * @author katva02
 * LoginController is used to login to the application and 
 * has methods like login,validateSession etc. TODO: Expand the description once all information is available
 */
@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	/**
	 * @param userName
	 * @param password
	 * @return sessionKey
	 * This method tries to login to the application and return a 
	 * sessionKey for the user.
 	 */
	@RequestMapping("/login")
	public String login(String userName,String password){
		return loginService.login(userName, password);
	}
	
	/**
	 * @param key
	 * @return sessionKey
	 * Auto login the user based on a key.
	 */
	@RequestMapping
	public String autoLogin(String key){
		
		return "";
	}
}
