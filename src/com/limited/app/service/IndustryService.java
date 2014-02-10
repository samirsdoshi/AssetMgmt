package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Industry;
import com.limited.app.bean.IndustryExample;
import com.limited.app.db.dao.IndustryMapper;
@Service
public class IndustryService extends BaseService{
	
	@Autowired
	private IndustryMapper industryMapper;
	
	@Autowired
	private IndustryExample industryExample;
	
	public IndustryService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public IndustryMapper getIndustryMapper() {
		return industryMapper;
	}

	public void setIndustryMapper(IndustryMapper industryMapper) {
		this.industryMapper = industryMapper;
	}

	public IndustryExample getIndustryExample() {
		return industryExample;
	}

	public void setIndustryExample(IndustryExample example) {
		this.industryExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		getIndustryExample().clear();
		return industryMapper.countByExample(industryExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return industryMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(Industry alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(Industry record) {
		// TODO Auto-generated method stub
		return industryMapper.insert(record);
	}

	public Industry getByID(Integer id) {
		// TODO Auto-generated method stub
		getIndustryExample().clear();
		return industryMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(Industry record) {
		// TODO Auto-generated method stub
		return industryMapper.updateByPrimaryKey(record);
	}

	public List<Industry> getAll(){
		getIndustryExample().clear();
		return industryMapper.selectByExample(getIndustryExample());
	}
	
	public List<Industry> getByName(String value){
		getIndustryExample().clear();
		getIndustryExample().createCriteria().andIndNameEqualTo(value);
		return industryMapper.selectByExample(getIndustryExample());
	}
}
