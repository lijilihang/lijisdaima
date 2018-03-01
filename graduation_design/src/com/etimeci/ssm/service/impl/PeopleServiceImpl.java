package com.etimeci.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etimeci.ssm.dao.LoginDao;
import com.etimeci.ssm.dao.PeopleDao;
import com.etimeci.ssm.entity.Middle;
import com.etimeci.ssm.entity.Old;
import com.etimeci.ssm.entity.Young;
import com.etimeci.ssm.service.PeopleService;
@Service
public class PeopleServiceImpl implements PeopleService {
	
	@Autowired
	private PeopleDao peopleDao;

	@Override
	public List<Young> selectMessageYoung() {
		// TODO Auto-generated method stub
		return peopleDao.selectMessageYoung();
	}

	@Override
	public List<Middle> selectMessageMiddle() {
		// TODO Auto-generated method stub
		return peopleDao.selectMessageMiddle();
	}

	@Override
	public List<Old> selectMessageOld() {
		// TODO Auto-generated method stub
		return peopleDao.selectMessageOld();
	}

}
