package com.etimeci.ssm.dao;

import java.util.List;

import com.etimeci.ssm.entity.Middle;
import com.etimeci.ssm.entity.Old;
import com.etimeci.ssm.entity.Young;

public interface PeopleDao {
	public List<Young> selectMessageYoung();
	public List<Middle> selectMessageMiddle();
	public List<Old> selectMessageOld();

}
