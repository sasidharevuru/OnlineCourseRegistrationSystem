package com.osrs.login.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osrs.login.model.RegisterRequest;
import com.osrs.login.model.RegisterResponse;
import com.osrs.login.util.DBUtil;

/**
 * @author katva02
 * LoginController is used to login to the application and 
 * has methods like login,validateSession etc. TODO: Expand the description once all information is available
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	
	/**
	 * @param userName
	 * @param password
	 * @return sessionKey
	 * This method tries to login to the application and return a 
	 * sessionKey for the user.
 	 */
	@RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody RegisterRequest register(@RequestBody RegisterRequest registerBean){
		return registerBean;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody RegisterResponse registerInit(){
		return DBUtil.registerUser(null);
	}
	
	
}
