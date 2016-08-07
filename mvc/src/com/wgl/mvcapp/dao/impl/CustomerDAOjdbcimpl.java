package com.wgl.mvcapp.dao.impl;

import java.util.List;

import com.wgl.mvcapp.dao.CustomerDAO;
import com.wgl.mvcapp.dao.Dao;
import com.wgl.mvcapp.domain.Customer;

public class CustomerDAOjdbcimpl extends Dao<Customer> implements CustomerDAO{

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getCountWithName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
