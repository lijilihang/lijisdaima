package com.etimeci.ssm.entity;

public class Login {
	private String umPhone;//用户电话
	private String umPassword;//用户密码
	private String umEmail;//用户邮箱
	public String getUmPhone() {
		return umPhone;
	}
	public void setUmPhone(String umPhone) {
		this.umPhone = umPhone;
	}
	public String getUmPassword() {
		return umPassword;
	}
	public void setUmPassword(String umPassword) {
		this.umPassword = umPassword;
	}
	public String getUmEmail() {
		return umEmail;
	}
	public void setUmEmail(String umEmail) {
		this.umEmail = umEmail;
	}
	@Override
	public String toString() {
		return "Login [umPhone=" + umPhone + ", umPassword=" + umPassword + ", umEmail=" + umEmail + "]";
	}
	

}
