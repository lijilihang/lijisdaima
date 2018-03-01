package com.etimeci.ssm.service;

import java.util.List;

import com.etimeci.ssm.entity.Supplier;
public interface SupplierService {
	public int insertSupplier(Supplier Supplier);
	public List<Supplier> query(String suName);
	public List<Supplier> findSupplierById(Integer suId);
	public void updateSupplier(Supplier supplier);
	public void deleteSupplier(Integer suId);
}
