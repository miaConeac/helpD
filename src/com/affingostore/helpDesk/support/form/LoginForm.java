package com.affingostore.helpDesk.support.form;

import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm{

	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private int status;
	
	public static final int LOGGED_IN = 1;
	public static final int LOGGED_OFF = 2;

	public LoginForm() {
		// TODO Auto-generated constructor stub
		this.status = LOGGED_OFF;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
		
	
	
}
