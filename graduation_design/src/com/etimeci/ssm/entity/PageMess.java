package com.etimeci.ssm.entity;

public class PageMess {
	private Integer limit; 
	private Integer start;
	private Integer page;
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "PageMess [limit=" + limit + ", start=" + start + ", page=" + page + "]";
	}
	

}
