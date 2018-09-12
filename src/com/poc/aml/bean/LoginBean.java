package com.poc.aml.bean;

import java.text.MessageFormat;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.poc.aml.bo.LoginBO;

public class LoginBean extends ActionForm {

	public String emailId;
	public String password;


	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String checkLoginCredentials( String email, String password ){

		LoginBO loginBo = new LoginBO();
		loginBo.checkLoginDetails( email,  password);



		return String   ;
	}



}
