package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Alloctype;
import com.limited.app.bean.AlloctypeExample;
import com.limited.app.db.dao.AlloctypeMapper;
@Service
public class AlloctypeService extends BaseService{
	
	@Autowired
	private AlloctypeMapper alloctypeMapper;
	
	@Autowired
	private AlloctypeExample alloctypeExample;
	
	public AlloctypeService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AlloctypeMapper getAlloctypeMapper() {
		return alloctypeMapper;
	}

	public void setAlloctypeMapper(AlloctypeMapper alloctypeMapper) {
		this.alloctypeMapper = alloctypeMapper;
	}

	public AlloctypeExample getAlloctypeExample() {
		return alloctypeExample;
	}

	public void setAlloctypeExample(AlloctypeExample example) {
		this.alloctypeExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		return alloctypeMapper.countByExample(alloctypeExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return alloctypeMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(Alloctype alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(Alloctype record) {
		// TODO Auto-generated method stub
		return alloctypeMapper.insert(record);
	}

	public Alloctype getByID(Integer id) {
		// TODO Auto-generated method stub
		return alloctypeMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(Alloctype record) {
		// TODO Auto-generated method stub
		return alloctypeMapper.updateByPrimaryKey(record);
	}

	public List<Alloctype> getAll(){
		getAlloctypeExample().clear();
		return alloctypeMapper.selectByExample(getAlloctypeExample());
	}
	
	public List<Alloctype> getByDescription(String value){
		getAlloctypeExample().clear();
		AlloctypeExample.Criteria c=getAlloctypeExample().createCriteria();
		c.andDescriptionEqualTo(value);
		return alloctypeMapper.selectByExample(getAlloctypeExample());
	}
}
