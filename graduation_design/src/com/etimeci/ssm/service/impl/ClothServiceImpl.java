package com.etimeci.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etimeci.ssm.dao.ClothDao;
import com.etimeci.ssm.dao.RegisterDao;
import com.etimeci.ssm.service.ClothService;
@Service
public class ClothServiceImpl implements ClothService {
	
	@Autowired
	private ClothDao clothDao;
	@Override
	public List<Map<String, Object>> selectClothNum() {
		// TODO Auto-generated method stub
		return clothDao.selectClothNum();
	}

}
