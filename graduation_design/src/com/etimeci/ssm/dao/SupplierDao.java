package com.etimeci.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.etimeci.ssm.entity.Supplier;



public interface SupplierDao {
	public int insertSupplier(Supplier supplier);
	public List<Supplier> query(@Param("suName") String suName);
    public void updateSupplier(Supplier supplier);
	public List<Supplier> findSupplierById(@Param("suId") Integer suId);
	public void deleteSupplier(Integer suId);
}
