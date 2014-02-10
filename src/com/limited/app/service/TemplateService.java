package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Template;
import com.limited.app.bean.TemplateExample;
import com.limited.app.db.dao.TemplateMapper;
@Service
public class TemplateService extends BaseService{
	
	@Autowired
	private TemplateMapper templateMapper;
	
	@Autowired
	private TemplateExample templateExample;
	
	public TemplateService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TemplateMapper getTemplateMapper() {
		return templateMapper;
	}

	public void setTemplateMapper(TemplateMapper templateMapper) {
		this.templateMapper = templateMapper;
	}

	public TemplateExample getTemplateExample() {
		return templateExample;
	}

	public void setTemplateExample(TemplateExample example) {
		this.templateExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		getTemplateExample().clear();
		return templateMapper.countByExample(templateExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return templateMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(Template alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(Template record) {
		// TODO Auto-generated method stub
		return templateMapper.insert(record);
	}

	public Template getByID(Integer id) {
		// TODO Auto-generated method stub
		return templateMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(Template record) {
		// TODO Auto-generated method stub
		return templateMapper.updateByPrimaryKey(record);
	}

	public List<Template> getAll(){
		getTemplateExample().clear();
		return templateMapper.selectByExample(getTemplateExample());
	}

	public List<Template> getByDesc(String value){
		getTemplateExample().clear();
		getTemplateExample().createCriteria().andDescriptionEqualTo(value);
		return templateMapper.selectByExample(getTemplateExample());
	}

}
