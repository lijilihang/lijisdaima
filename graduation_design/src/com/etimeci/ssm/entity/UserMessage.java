package com.etimeci.ssm.entity;

public class UserMessage {
	private Integer umId;//用户id
	private String umPhone;//用户电话
	private String umPassword;//用户密码
	private String umPasswordl;//确认密码
	private String umVcode;//验证码
	private String umName;//用户真实姓名
	private String umIdentifyNum;//用户身份证号码
	private String umEmail;//用户邮箱
	private String umCity;//所在城市
	private Integer umLoginName;//用户名
	private int umRole;//角色
	
	public Integer getUmId() {
		return umId;
	}

	public void setUmId(Integer umId) {
		this.umId = umId;
	}

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

	public String getUmPasswordl() {
		return umPasswordl;
	}

	public void setUmPasswordl(String umPasswordl) {
		this.umPasswordl = umPasswordl;
	}

	public String getUmVcode() {
		return umVcode;
	}

	public void setUmVcode(String umVcode) {
		this.umVcode = umVcode;
	}

	public String getUmName() {
		return umName;
	}

	public void setUmName(String umName) {
		this.umName = umName;
	}

	public String getUmIdentifyNum() {
		return umIdentifyNum;
	}

	public void setUmIdentifyNum(String umIdentifyNum) {
		this.umIdentifyNum = umIdentifyNum;
	}

	public String getUmEmail() {
		return umEmail;
	}

	public void setUmEmail(String umEmail) {
		this.umEmail = umEmail;
	}

	public String getUmCity() {
		return umCity;
	}

	public void setUmCity(String umCity) {
		this.umCity = umCity;
	}

	public Integer getUmLoginName() {
		return umLoginName;
	}

	public void setUmLoginName(Integer umLoginName) {
		this.umLoginName = umLoginName;
	}

	public int getUmRole() {
		return umRole;
	}

	public void setUmRole(int umRole) {
		this.umRole = umRole;
	}

	@Override
	public String toString() {
		return "UserMessage [umId=" + umId + ", umPhone=" + umPhone + ", umPassword=" + umPassword + ", umPasswordl="
				+ umPasswordl + ", umVcode=" + umVcode + ", umName=" + umName + ", umIdentifyNum=" + umIdentifyNum
				+ ", umEmail=" + umEmail + ", umCity=" + umCity + ", umLoginName=" + umLoginName + ", umRole=" + umRole
				+ "]";
	}
	
	
	
	

}
