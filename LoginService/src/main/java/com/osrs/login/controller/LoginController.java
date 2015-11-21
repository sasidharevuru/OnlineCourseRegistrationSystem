package com.osrs.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osrs.login.service.LoginService;

/**
 * @author katva02
 * LoginController is used to login to the application and 
 * has methods like login,validateSession etc. TODO: Expand the description once all information is available
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	
	/**
	 * @param userName
	 * @param password
	 * @return sessionKey
	 * This method tries to login to the application and return a 
	 * sessionKey for the user.
 	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String login(){
		System.out.println("Reached login");
		return "sessionKey";
	}
	
	/**
	 * @param key
	 * @return sessionKey
	 * Auto login the user based on a key.
	 */
	@RequestMapping("/autologin")
	public String autoLogin(String key){
		
		return "";
	}
}
