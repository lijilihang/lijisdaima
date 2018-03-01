package com.etimeci.ssm.entity;

public class Supplier {
	private Integer suId;
	private String suName;
	private String suAddress;
	private String suTel;
	private String suMail;
	public Integer getSuId() {
		return suId;
	}
	public void setSuId(Integer suId) {
		this.suId = suId;
	}
	public String getSuName() {
		return suName;
	}
	public void setSuName(String suName) {
		this.suName = suName;
	}
	public String getSuAddress() {
		return suAddress;
	}
	public void setSuAddress(String suAddress) {
		this.suAddress = suAddress;
	}
	public String getSuTel() {
		return suTel;
	}
	public void setSuTel(String suTel) {
		this.suTel = suTel;
	}
	public String getSuMail() {
		return suMail;
	}
	public void setSuMail(String suMail) {
		this.suMail = suMail;
	}
	@Override
	public String toString() {
		return "Supplier [suId=" + suId + ", suName=" + suName + ", suAddress=" + suAddress + ", suTel=" + suTel
				+ ", suMail=" + suMail + "]";
	}
	
}