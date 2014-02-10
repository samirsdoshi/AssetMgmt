package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Inter;
import com.limited.app.bean.InterExample;
import com.limited.app.db.dao.InterMapper;
@Service
public class InterService extends BaseService{
	
	@Autowired
	private InterMapper interMapper;
	
	@Autowired
	private InterExample interExample;
	
	public InterService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InterMapper getInterMapper() {
		return interMapper;
	}

	public void setInterMapper(InterMapper interMapper) {
		this.interMapper = interMapper;
	}

	public InterExample getInterExample() {
		return interExample;
	}

	public void setInterExample(InterExample example) {
		this.interExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		getInterExample().clear();
		return interMapper.countByExample(interExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return interMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(Inter alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(Inter record) {
		// TODO Auto-generated method stub
		return interMapper.insert(record);
	}

	public Inter getByID(Integer id) {
		// TODO Auto-generated method stub
		return interMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(Inter record) {
		// TODO Auto-generated method stub
		return interMapper.updateByPrimaryKey(record);
	}

	public List<Inter> getAll(){
		getInterExample().clear();
		return interMapper.selectByExample(getInterExample());
	}
	
	public List<Inter> getByDesc(String value){
		getInterExample().clear();
		getInterExample().createCriteria().andInterDescEqualTo(value);
		return interMapper.selectByExample(getInterExample());
	}
}
