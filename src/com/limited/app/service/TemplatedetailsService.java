package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Templatedetails;
import com.limited.app.bean.TemplatedetailsExample;
import com.limited.app.db.dao.TemplatedetailsMapper;
@Service
public class TemplatedetailsService extends BaseService{
	
	@Autowired
	private TemplatedetailsMapper templatedetailsMapper;
	
	@Autowired
	private TemplatedetailsExample templatedetailsExample;
	
	public TemplatedetailsService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TemplatedetailsMapper getTemplatedetailsMapper() {
		return templatedetailsMapper;
	}

	public void setTemplatedetailsMapper(TemplatedetailsMapper templatedetailsMapper) {
		this.templatedetailsMapper = templatedetailsMapper;
	}

	public TemplatedetailsExample getTemplatedetailsExample() {
		return templatedetailsExample;
	}

	public void setTemplatedetailsExample(TemplatedetailsExample example) {
		this.templatedetailsExample = example;
	}


	public int getCount() {
		// TODO Auto-generated method stub
		getTemplatedetailsExample().clear();
		return templatedetailsMapper.countByExample(templatedetailsExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return templatedetailsMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(Templatedetails alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(Templatedetails record) {
		// TODO Auto-generated method stub
		return templatedetailsMapper.insert(record);
	}

	public Templatedetails getByID(Integer id) {
		// TODO Auto-generated method stub
		return templatedetailsMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(Templatedetails record) {
		// TODO Auto-generated method stub
		return templatedetailsMapper.updateByPrimaryKey(record);
	}



	public List<Templatedetails> getAll(){
		getTemplatedetailsExample().clear();
		return templatedetailsMapper.selectByExample(getTemplatedetailsExample());
	}
	
	public List<Templatedetails> getByTemplateID(int value){
		getTemplatedetailsExample().clear();
		getTemplatedetailsExample().createCriteria().andTemplateidEqualTo(value);
		return templatedetailsMapper.selectByExample(getTemplatedetailsExample());
	}

	public List<Templatedetails> getByAlloctypeID(int value){
		getTemplatedetailsExample().clear();
		getTemplatedetailsExample().createCriteria().andAlloctypeidEqualTo(value);
		return templatedetailsMapper.selectByExample(getTemplatedetailsExample());
	}
	
	public List<Templatedetails> getBySectorID(int value){
		getTemplatedetailsExample().clear();
		getTemplatedetailsExample().createCriteria().andSecidEqualTo(value);
		return templatedetailsMapper.selectByExample(getTemplatedetailsExample());
	}	

	public List<Templatedetails> getByIndustryID(int value){
		getTemplatedetailsExample().clear();
		getTemplatedetailsExample().createCriteria().andIndidEqualTo(value);
		return templatedetailsMapper.selectByExample(getTemplatedetailsExample());
	}	

	public List<Templatedetails> getBySecIndID(int secid, int indid){
		getTemplatedetailsExample().clear();
		getTemplatedetailsExample().createCriteria().andSecidEqualTo(secid)
			.andIndidEqualTo(indid);
		return templatedetailsMapper.selectByExample(getTemplatedetailsExample());
	}

	public List<Templatedetails> getByInterID(int value){
		getTemplatedetailsExample().clear();
		getTemplatedetailsExample().createCriteria().andInteridEqualTo(value);
		return templatedetailsMapper.selectByExample(getTemplatedetailsExample());
	}	

}
