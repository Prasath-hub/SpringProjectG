package com.springproject.login.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateuser(String userid, String password)
	{
		return userid.equalsIgnoreCase("in28minutes")
		&& password.equalsIgnoreCase("dummy");
	}

}
