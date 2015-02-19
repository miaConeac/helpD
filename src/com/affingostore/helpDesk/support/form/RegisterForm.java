package com.affingostore.helpDesk.support.form;

import org.apache.struts.validator.ValidatorForm;

public class RegisterForm extends ValidatorForm {

	private static final long serialVersionUID = 1L;
	
	private String email;
	private String pwd1;
	private String pwd2;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd1() {
		return pwd1;
	}
	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}
	public String getPwd2() {
		return pwd2;
	}
	public void setPwd2(String pw2) {
		this.pwd2 = pw2;
	}
	
}
