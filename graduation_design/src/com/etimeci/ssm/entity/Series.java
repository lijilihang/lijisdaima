package com.etimeci.ssm.entity;

import java.util.List;

public class Series<T> {
	public String name;
	public String type;
	public Integer barWidth;
    public String stack;
    
    public List<T> data;// 这里要用int 不能用String 不然前台显示不正常（特别是在做数学运算的时候）
 
    public Series(String name, String type,Integer barWidth, String stack, List<T> data) {
        super();
        this.name = name;
        this.stack=stack;
        this.type = type;
        this.barWidth=barWidth;
        this.data = data;
       

}

	@Override
	public String toString() {
		return "Series [name=" + name + ", type=" + type + ", stack=" + stack + ", data=" + data + "]";
	}
    
}
