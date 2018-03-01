package com.etimeci.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etimeci.ssm.dao.RegisterDao;
import com.etimeci.ssm.entity.EchartMapProvance;
import com.etimeci.ssm.entity.PageMess;
import com.etimeci.ssm.entity.UserMessage;
import com.etimeci.ssm.service.RegisterService;
import com.etimeci.ssm.web.RegisterLoginController;
@Service
public class RegisterServiceImpl implements RegisterService {
	

	@Autowired
	private RegisterDao registerDao;
	@Override
	public int registerInsert(UserMessage userMessage) {
		
		return registerDao.registerInsert(userMessage);
	}
	@Override
	public List<Map<String, Object>> selectUserAll(PageMess pageMess) {
		// TODO Auto-generated method stub
		return registerDao.selectUserAll(pageMess);
	}
	@Override
	public List<EchartMapProvance> selectMapA() {
		// TODO Auto-generated method stub
		return registerDao.selectMapA();
	}
	@Override
	public List<EchartMapProvance> selectMapB() {
		// TODO Auto-generated method stub
		return registerDao.selectMapB();
	}
	@Override
	public Boolean updateDataTables(UserMessage userMessage) {
		// TODO Auto-generated method stub
		return registerDao.updateDataTables(userMessage);
	}
	@Override
	public int deleteDataTables(Integer u_id,String umId) {
		// TODO Auto-generated method stub
		return registerDao.deleteDataTables(u_id,umId);
	}

}
