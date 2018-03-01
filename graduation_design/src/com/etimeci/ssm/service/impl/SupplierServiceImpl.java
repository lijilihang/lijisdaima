package com.etimeci.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etimeci.ssm.dao.SupplierDao;

import com.etimeci.ssm.entity.Supplier;
import com.etimeci.ssm.service.SupplierService;


@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDao supplierDao;

	@Override
	public int insertSupplier(Supplier supplier) {
		
		return supplierDao.insertSupplier(supplier);
	}

	@Override
	public List<Supplier> query(String suName) {
		// TODO Auto-generated method stub
		return supplierDao.query(suName);
	}

	@Override
	public void updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierDao.updateSupplier(supplier);
	}

	@Override
	public List<Supplier> findSupplierById(Integer suId) {
		return supplierDao.findSupplierById(suId);
	}

	@Override
	public void deleteSupplier(Integer suId) {
		// TODO Auto-generated method stub
		supplierDao.deleteSupplier(suId);
	}
	
	}

