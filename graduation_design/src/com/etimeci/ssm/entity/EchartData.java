package com.etimeci.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class EchartData<T> {
	 public List<String> legend = new ArrayList<String>();// 数据分组
	    public List<String> category = new ArrayList<String>();// 横坐标
	    public List<Series<T>> series = new ArrayList<Series<T>>();// 纵坐标
	 
	    public EchartData(List<String> legendList, List<String> categoryList,
	            List<Series<T>> seriesList) {
	        super();
	        this.legend = legendList;
	        this.category = categoryList;
	        this.series = seriesList;
	    }

		@Override
		public String toString() {
			return "EchartData [legend=" + legend + ", category=" + category + ", series=" + series + "]";
		}
	    
	    

}
