package com.etimeci.ssm.service;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.etimeci.ssm.entity.EchartMapProvance;
import com.etimeci.ssm.entity.PageMess;
import com.etimeci.ssm.entity.UserMessage;
//import com.etimeci.ssm.web.RegisterController;

public interface RegisterService {
	public int registerInsert(UserMessage userMessage);
	public List<Map<String, Object>> selectUserAll(PageMess pageMess);
	public List<EchartMapProvance> selectMapA();
	public List<EchartMapProvance> selectMapB();
	public Boolean updateDataTables(UserMessage userMessage);
	public int deleteDataTables(Integer u_id,String umId);



}
