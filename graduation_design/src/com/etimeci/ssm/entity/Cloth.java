package com.etimeci.ssm.entity;

public class Cloth {
	private Integer cId;
	private String cName;
	private Integer cNum;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Integer getcNum() {
		return cNum;
	}
	public void setcNum(Integer cNum) {
		this.cNum = cNum;
	}
	@Override
	public String toString() {
		return "Cloth [cId=" + cId + ", cName=" + cName + ", cNum=" + cNum + "]";
	}
	

}
