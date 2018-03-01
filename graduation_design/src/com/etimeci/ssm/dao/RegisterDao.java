package com.etimeci.ssm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.etimeci.ssm.entity.EchartMapProvance;
import com.etimeci.ssm.entity.PageMess;
import com.etimeci.ssm.entity.Supplier;
import com.etimeci.ssm.entity.UserMessage;


public interface RegisterDao {
	public int registerInsert(UserMessage userMessage);
	public List<Map<String, Object>> selectUserAll(PageMess pageMess);
	public List<EchartMapProvance> selectMapA();
	public List<EchartMapProvance> selectMapB();
	public Boolean updateDataTables(UserMessage userMessage);
	public int deleteDataTables(@Param("u_id")Integer u_id,String umId);//@Param(..)作用:这里的参数和mybatis里
	//面#{..}是用map对应的，如果不写这个注解，且函数有多个参数，就没法对应#{..}，就会报错，但是如果这个函数只有一个参数，则自动对应，不写注解也可以（可能只针对int类型）

	
}
