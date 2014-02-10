package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Institution;
import com.limited.app.bean.InstitutionExample;
import com.limited.app.db.dao.InstitutionMapper;
@Service
public class InstitutionService extends BaseService{
	
	@Autowired
	private InstitutionMapper institutionMapper;
	
	@Autowired
	private InstitutionExample institutionExample;
	
	public InstitutionService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InstitutionMapper getInstitutionMapper() {
		return institutionMapper;
	}

	public void setInstitutionMapper(InstitutionMapper institutionMapper) {
		this.institutionMapper = institutionMapper;
	}

	public InstitutionExample getInstitutionExample() {
		return institutionExample;
	}

	public void setInstitutionExample(InstitutionExample example) {
		this.institutionExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		getInstitutionExample().clear();
		return institutionMapper.countByExample(institutionExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return institutionMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(Institution alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(Institution record) {
		// TODO Auto-generated method stub
		return institutionMapper.insert(record);
	}

	public Institution getByID(Integer id) {
		// TODO Auto-generated method stub
		return institutionMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(Institution record) {
		// TODO Auto-generated method stub
		return institutionMapper.updateByPrimaryKey(record);
	}


	public List<Institution> getAll(){
		getInstitutionExample().clear();
		return institutionMapper.selectByExample(getInstitutionExample());
	}
	
	public List<Institution> getByName(String value){
		getInstitutionExample().clear();
		getInstitutionExample().createCriteria().andInstNameEqualTo(value);
		return institutionMapper.selectByExample(getInstitutionExample());
	}
}
